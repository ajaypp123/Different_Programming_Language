// public  protected
//overriding

class parant
{	
	protected int b=10;
	private int c = 22;
	public int a = 20;	
	
	void base1()
	{
		System.out.println("In parant class a : " + a );
	}
	
	void base2()
	{
		System.out.println("In parant class a : " + a );
		System.out.println("In parant class c : " + c );
	}
}

class child1 extends parant
{
	void sub()
	{
		System.out.println("In child class a = " + a);
		System.out.println("In child class b = " + b);
	}
}

class myclass
{	
	public static void main(String args[])
	{
		child1 obj = new child1();
		obj.base1();
		obj.sub();
		
		parant p = new parant();
		p.base2();
	}
}

