import java.net.*;
import java.io.*;

class Server
{
	ServerSocket ss;
	BufferedReader br;
	PrintWriter out;
	Socket s;
	Server()
	{
		try{ss=new ServerSocket(9191);}catch(Exception e){}
	}
	void start()
	{
		try
		{
			s=ss.accept();
			System.out.println(s.getInetAddress().toString()+" coneected");
			br=new BufferedReader (new InputStreamReader (s.getInputStream()));
			out=new PrintWriter(new BufferedWriter (new OutputStreamWriter(s.getOutputStream())));
			SReader sr=new SReader(br);
			SWriter sw=new SWriter(out);
			sr.start();
			sw.start();
					
		 	
		
		}catch(Exception e){}
	}
	public static void main(String a[])
	{
		Server s=new Server();
		s.start();
	}
	
}

class SReader extends Thread
{
BufferedReader cbr;
	SReader(BufferedReader br)
	{
		cbr=br;
	}
	public void run()
	{
		while(true)
		{
			try{
			String str=cbr.readLine();
			System.out.println(str);
			if(str.equals("exit"))
				System.exit(0);
			}catch(Exception e){}
		}
	}
}

class SWriter extends Thread
{
	PrintWriter cout;
	SWriter(PrintWriter out)
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
