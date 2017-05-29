import java.util.Scanner;

interface A 
{
	void add() ;
}

interface B
{
	void sub();
}

class C implements A,B
{
	public void add()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number in class C of class A : ");
		int a = input.nextInt();
		System.out.println("In class C : a =  " + a );
		System.out.println("\n\n\n" );
	}

	public void sub()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number in class C of class B : ");
		int a = input.nextInt();
		System.out.println("In class C : a =  " + a );
		System.out.println("\n\n\n" );
	}
} 

class myclass
{
	public static void main (String args[])
	{
		C obj = new C();

		obj.add();
		obj.sub();
	}
}

/*


C:\Users\rit\Desktop>javac hybrid.java

C:\Users\rit\Desktop>java myclass
Enter number in class C of class A :
5
In class C : a =  5




Enter number in class C of class B :
2
In class C : a =  2

*/