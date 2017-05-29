// Member class inheritance

class member
{
	int a=10 , b=8;
	
	public int add()
	{
		return a+b;
	}

	class subs
	{
		public int sub()
		{
			return a-b;
		}
	}
}

class child extends member
{

}

class myclass 
{
	public static void main(String args[])
	{
		member m = new member();
		
		member.subs s = m.new subs();

		child 

		System.out.println("Addition = " + m.add());
		System.out.println("Addition = " + s.sub());
	}
}

