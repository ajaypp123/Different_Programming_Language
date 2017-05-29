//Overriding program

class A 
{
	public void show()
	{
		System.out.println("In class A");
	}
}

class B 
{
	public void show()
	{
		System.out.println("In class B");
	}
}

class myclass
{
	public static void main(String args[])
	{
		B obj = new B();
		obj.show();
	}
}

/*
C:\Users\rit\Desktop>javac overriding.java

C:\Users\rit\Desktop>java myclass
In class B
*/