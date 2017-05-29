import java.net.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

class CView extends JFrame implements ActionListener
{
	public JLabel lb;
	public JTextField tf;
	public JTextArea ta;
	public JList ls;
	public JButton jb;
	PrintWriter out;
	BufferedReader br;
	Vector<String> ulist;	
	public String cname;
	Myif remote;

	public CView(Myif remote)
	{
		this.remote=remote;	
		
		ulist=new Vector();
		cname=JOptionPane.showInputDialog(this,"Please enter your display name");
		lb=new JLabel("Enter your text here:");
		tf=new JTextField(30);
		ta=new JTextArea(15,40);
		
		//DefaultListModel df=new DefaultListModel();
		//df.addElement("Hello");
		//df.addElement("Hi");
		ls=new JList();
		jb=new JButton("Send");
		jb.addActionListener(this);
		add(lb);
		add(tf);
		add(ls);
		add(jb);
		add(ta);
		
		setLayout(new FlowLayout());
		setSize(600,400);
		setVisible(true);
	}

	public void Initiate()
	{
		try{
		remote.login(cname);}
		catch(Exception e){}
			
	}

	public void updateList(String s)
	{
		String temp=s;
		//if(s==null)
			//try{temp=br.readLine();}catch(Exception e){}
		//else 
			//temp=s;


		StringTokenizer st=new StringTokenizer(temp,"#");
		ulist.clear();
		while(st.hasMoreTokens())
		{
			ulist.add(st.nextToken());
		}
		ls.setListData(ulist);

	}

	public void actionPerformed(ActionEvent ae)
	{
		
		if(jb.equals(ae.getSource()))
		{
			try{
			remote.sendMess(cname+"#"+(String)ls.getSelectedValue()+"#"+tf.getText());
			}catch(Exception e){}
		}
	}
}


class SReader extends Thread
{
	
	CView cv;
	Myif remote;
	public SReader( Myif remote,CView cv)
	{
		this.remote=remote;	
		this.cv=cv;
		
	}
	public void run()
	{
		while (true)
		{
			try
			{
				String str=remote.recvMess(cv.cname);
				if(str.startsWith("$"))
				{
					str=str.substring(1,str.length());
					str.trim();
					cv.updateList(str);
				}
				else
				{
					StringTokenizer st=new StringTokenizer(str,"#");
					String from=st.nextToken();
					String to=st.nextToken();
					String mess=st.nextToken();
					
					cv.ta.setText(cv.ta.getText()+"\n"+from+"::"+mess);
				}
			}catch(Exception e){}
		}
	}
}


class MyClient 
{
	
	InetAddress addr;
	
	CView cv;

	public void conn()
	{
		try
		{
			
			
			//addr=InetAddress.getByName("172.22.24.155");
			Registry r=LocateRegistry.getRegistry("172.22.24.144");
			Myif remote=(Myif)r.lookup("MyServ");
			System.out.println("Connected");
			
			cv=new CView(remote);
			cv.Initiate();
			
			SReader sr=new SReader(remote,cv);
			sr.start();
			
		}
		catch(Exception e)
		{
		}
	}
	
	public static void main(String a[])
	{
		MyClient c=new MyClient();
		c.conn();
		//c.startComm();
	}
}
