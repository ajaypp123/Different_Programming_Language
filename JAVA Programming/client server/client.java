import java.io.*;
import java.net.*;
import java.util.*;

class cli 
{
	cli()
	{
		try{
		
		Socket sk = new Socket("localhost",2000);
		
		Scanner input = new Scanner(sk.getInputStream());
		PrintStream output = new PrintStream(sk.getOutputStream());
		
		Scanner sc = new Scanner(System.in);
		
		String s;
		int a;
		int b=0;
		
		s = input.nextLine();
		System.out.println(s);
		
		System.out.println("Enter set of integer:");
		
		while( b != 5)
		{
			a = sc.nextInt();
			output.println(a);
			
			b++;
		}
		//a = sc.nextInt();
		//output.println(a);
		
		}catch(Exception e){}
	}
	
	public static void main(String args[])
	{
		cli ce = new cli();
	}
}	