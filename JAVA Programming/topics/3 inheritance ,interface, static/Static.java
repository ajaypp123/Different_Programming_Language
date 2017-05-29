

class parant
{
	static
	{
		System.out.println("In static class ");
	}

	int a = 20;	
	void base()
	{
		System.out.println("In parant class a : " + a );
	}
}

class child1 extends parant
{
	void sub()
	{
		System.out.println("In child class ");
	}

	public static void main(String args[])
	{
		child1 obj = new child1();
		obj.base();
		obj.sub();
	}
}

/*
C:\Users\rit\Desktop>javac single.java

C:\Users\rit\Desktop>java child1
In static class
In parant class a : 20
In child class

*/