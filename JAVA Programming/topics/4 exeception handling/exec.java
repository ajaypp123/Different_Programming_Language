//Exeception handling in java

import java.util.Scanner;

class myexception extends Exception
{
	String str2;
	
	myexception(String str1)
	{
		str2 = str1;
	}

	public String toString()
	{
		return (str2);
	}
}


class myclass
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter age of father : ");
		int a = input.nextInt();

		System.out.println("Enter age of son : ");
		int b = input.nextInt();

		try
		{
			if(b>=a)
			{
				throw new myexception("Error : 999");
			}
		}
		catch(myexception ex)
		{
			System.out.println("Son age is not grater");
			System.out.println(ex);
		}
	}
}


/*


C:\Users\rit\Desktop>javac exec.java

C:\Users\rit\Desktop>java myclass
Enter age of father :
44
Enter age of son :
65
Son age is not grater
Error : 999

*/