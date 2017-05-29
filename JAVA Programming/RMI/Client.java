import java.net.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

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
	public static String cname;

	public CView(PrintWriter out, BufferedReader br)
	{
		this.out=out;
		this.br=br;
		
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
		out.println(cname);
		out.flush();
		//updateList(null);
			
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
			System.out.println(" B LICK");
			out.println(cname+"#"+(String)ls.getSelectedValue()+"#"+tf.getText());
			out.flush();
		}
	}
}
class SReader extends Thread
{
	Socket s;
	BufferedReader br;
	CView cv;
	public SReader(Socket s, CView cv)
	{
		this.s=s;
		this.cv=cv;
		try{br=new BufferedReader(new InputStreamReader(s.getInputStream()));}catch(Exception e){}
	}
	public void run()
	{
		while (true)
		{
			try
			{
				String str=br.readLine();
				if(str.startsWith("$"))
				{
					str.replace('$',' ');
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

class Client 
{
	Socket s;
	InetAddress addr;
	BufferedReader br;
	PrintWriter out;
	CView cv;
	public void conn()
	{
		try
		{
			
			
			addr=InetAddress.getByName("127.0.0.1");
			s=new Socket();
			InetSocketAddress saddr=new InetSocketAddress(addr,8888);
			s.connect(saddr);
			System.out.println("Connected");
			br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			out=new PrintWriter(new BufferedWriter(new OutputStreamWriter(s.getOutputStream())),true);
			cv=new CView(out,br);
			cv.Initiate();
			
			SReader sr=new SReader(s,cv);
			sr.start();
			
		}
		catch(Exception e)
		{
		}
	}
	
	public static void main(String a[])
	{
		Client c=new Client();
		c.conn();
		//c.startComm();
	}
}
