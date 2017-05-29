import java.net.*;
import java.io.*;
import java.util.*;


class chatclient
{
	public static void main(String args[]) throws Exception
	{
		Socket sk = new Socket("localhost",2000);
		//BufferedReader sinputput = new BufferedReader(new InputStreamReader(sk.getInputStream()));
		Scanner sinput = new Scanner(sk.getInputStream());
		PrintStream soutput = new PrintStream(sk.getOutputStream());
		//BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		Scanner  stdin = new Scanner(System.in);
		
		String s;
		while(true)
		{
			System.out.print("Client : ");
			s = stdin.nextLine();
			soutput.println(s);
			s = sinput.nextLine();
			System.out.print("Server : "+s+"\n");
			if ( s.equalsIgnoreCase("BYE") )
			{
				break;
			}
		}
		sk.close();
		//sinput.close();
		//soutput.close();
		//stdin.close();
	}
}