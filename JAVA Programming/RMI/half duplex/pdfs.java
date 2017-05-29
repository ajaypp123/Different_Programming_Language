import java.net.*;
import java.io.*;
import java.util.*;

class chatserver
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket ss = new ServerSocket(2000);
		Socket sk = ss.accept();
		//BufferedReader cinput = new BufferedReader(new InputStreamReader(sk.getInputStream()));
		Scanner cinput = new Scanner(sk.getInputStream());
		PrintStream cout = new PrintStream(sk.getOutputStream());
		//BufferedReader sinput = new BufferedReader(new InputStreamReader(System.in));
		Scanner sinput = new Scanner(System.in);

		String s;
		while(true)
		{
			s = cinput.nextLine();
			if (s.equalsIgnoreCase("#END"))
			{
				cout.println("BYE");
				break;
			}
			System.out.print("Client : "+s+"\n");
			System.out.print("Server : ");
			s = sinput.nextLine();
			cout.println(s);
		}
		ss.close();
		sk.close();
		//cinput.close();
		//cout.close();
		//sinput.close();
	}
}
