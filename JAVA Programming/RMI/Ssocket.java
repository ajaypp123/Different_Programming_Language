import java.net.*;
import java.io.*;
import java.util.*;

class NClient extends Thread
{
	public String cname;
	public Socket s;
	public BufferedReader br;
	public PrintWriter out;
	public NClient(String str, Socket st)
	{
		try{cname=str;
		s=st;
		br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		out=new PrintWriter(new BufferedWriter(new OutputStreamWriter(s.getOutputStream())),true);
		}catch(Exception e){}
	}
	public void run()
	{
		SSReader ssr=new SSReader(s);
		ssr.start();
	}
	public void sendMess(String msg)
	{
		out.println(msg);
		out.flush();
	}

	
}

class CReg
{
	Vector<NClient> vec;
	public static CReg inst=null;
	public static CReg getInst()
	{
		if(inst==null)
		{
			inst=new CReg();
			return inst;
		}
		else return inst;
	}
	public CReg()
	{
		vec=new Vector();
	}
	
	public void add(NClient c)
	{
		vec.add(c);
		for(NClient n:vec)
		{
			n.sendMess("$"+getNameList());
		}
	}
	public void remove(NClient c)
	{
	}
	public NClient getByName(String c)
	{
	
		for(NClient n:vec)
		{
			if(n.cname.equals(c))
			{
				return n;
			}
		}
		return null;
	}
	public String getNameList()
	{
		String temp="";
		for(NClient n:vec)
		{
			temp=temp+"#"+n.cname;	
		}
		return temp;
	}
}
class SSReader extends Thread
{
	Socket s;
	String msg;
	public BufferedReader br;
	public PrintWriter out;
	public SSReader(Socket st)
	{
		s=st;
		try{br=new BufferedReader(new InputStreamReader(s.getInputStream()));}catch(Exception e){}
	}
	public void run()
	{	
		System.out.println("SSR statted for"+s.getInetAddress().toString());
		while(true)
		{
			try
			{msg=br.readLine();
			System.out.println(msg);
			StringTokenizer st=new StringTokenizer(msg,"#");
					String from=st.nextToken();
					String to=st.nextToken();
					String mess=st.nextToken();
			CReg.getInst().getByName(to).sendMess(msg);
			}catch(Exception e){}
			
		}
	}
	
}
class Ssocket
{
	ServerSocket ss;
	BufferedReader br;
	PrintWriter out;
	Socket s;
	CReg reg;
	public Ssocket()
	{
		try
		{
			ss=new ServerSocket(8888);
			reg=CReg.getInst();
		}catch(Exception e)
		{
		}
	}
	public void getRequest()
	{
		try
		{
			while(true)
			{
				s=ss.accept();
				String cname=s.getInetAddress().toString();
				System.out.println(cname+" is connected");
				br=new BufferedReader(new InputStreamReader(s.getInputStream()));
				out=new PrintWriter(new BufferedWriter(new OutputStreamWriter(s.getOutputStream())),true);
			
				String str=br.readLine();
				NClient c=new NClient(str,s);
				c.start();
				reg.add(c);
				out.println("$"+reg.getNameList());
				out.flush();
			
			}
			
		}catch(Exception e)
		{
		}
	}
	public static  void main(String a[])
	{
		Ssocket os=new Ssocket();
		os.getRequest();
	}
}