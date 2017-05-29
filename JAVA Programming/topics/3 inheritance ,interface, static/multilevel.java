import java.util.Scanner;

class A
{
	void ca()
	{
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number in class A : ");
	int a = input.nextInt();
	System.out.println("In class A : a =  " + a );
	System.out.println("\n\n\n" );
	}
}

class B extends A
{
	void cb()
	{
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number in class B : ");
	int a = input.nextInt();
	System.out.println("In class B : a =  " + a );
	
	B obj1 = new B();
	obj1.ca();
	System.out.println("\n\n\n" );
	}
}

class C extends B
{
	public static void main(String args[])
	{
		int a;
		C obj = new C();

		obj.ca() ;
		obj.cb() ;

		
	}
}

/*
C:\Users\rit\Desktop>javac multilevel.java

C:\Users\rit\Desktop>java C
Enter number in class A :
5
In class A : a =  5




Enter number in class B :
4
In class B : a =  4
Enter number in class A :
56
In class A : a =  56


*/