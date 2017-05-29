import java.io.*;
import java.net.*;
import java.util.*;

class ser 
{
	ser()
	{
		try{
		
		ServerSocket ss = new ServerSocket(2000);
		Socket sk = ss.accept();
		
		Scanner input = new Scanner(sk.getInputStream());
		PrintStream output = new PrintStream(sk.getOutputStream());
		Scanner sc = new Scanner(System.in);
		
		String s = "You are connected.......";
		int b;
		int p=0;
		
		
		output.println(s);
		
		//(
		while(p != 5)
		{
			b = input.nextInt();
			System.out.println(b);
			
			p++;
		}	
		
		//b = input.nextInt();
		//System.out.println(b);
		//)
		
		}catch(Exception e)
		{}
		
	}
	
	public static void main(String args[])
	{
		ser se = new ser();
	}
}