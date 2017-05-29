import java.net.*;
import java.io.*;

class Client
{
	Socket s;
	BufferedReader br;
	PrintWriter out;
	Client()
	{
		
		try
		{
		s=new Socket();
		InetAddress inet=InetAddress.getByName("127.0.0.1");
		InetSocketAddress sock=new InetSocketAddress(inet,9191);
		s.connect(sock);
			System.out.println("Connected to Server");
			br=new BufferedReader (new InputStreamReader (s.getInputStream()));
			out=new PrintWriter(new BufferedWriter (new OutputStreamWriter(s.getOutputStream())));
		}catch(Exception e){}
		
	}
	void con()
	{
		
		CRead sr=new CRead(br);
		CWriter sw=new CWriter(out);
		sr.start();
		sw.start();

	}

	public static void main(String a[])
	{
		Client c=new Client();
		c.con();
	}
}


class CRead extends Thread
{
	BufferedReader cbr;
	CRead(BufferedReader br)
	{
		br=cbr;
	}
	public void run()
	{
		while(true)
		{
			try{String str=cbr.readLine();
			System.out.println(str);
			if(str.equals("exit"))
				System.exit(0);	
			}catch(Exception e){}
		}
	}
}

class CWriter extends Thread
{
	PrintWriter cout;
	CWriter(PrintWriter out)
	{
		cout=out;
	}
	public void run()
	{
		while(true)
		{
			try{
				String str=new BufferedReader(new InputStreamReader (System.in)).readLine();
				cout.println(str);
				cout.flush();
			}catch(Exception e){}
		}
	}
}