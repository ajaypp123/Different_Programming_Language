// Member class

class member
{
	int a=10 , b=8;
	
	public int add()
	{
		return a+b;
	}

	class subs
	{
		private int a = 20;
		private int b = 28;

		public void ad()
		{
		System.out.println("In innerclass Addition = " +  (this.a+member.this.a) );
		System.out.println("In innerclass Subtraction = " + (this.b+member.this.b) );
		}

		public int sub()
		{
			return this.a-member.this.b;
		}
	}
}

class myclass 
{
	public static void main(String args[])
	{
		member m = new member();
		
		member.subs s = m.new subs();

		System.out.println("In mainclass Addition = " + m.add());
		System.out.println("In mainclass Subtraction = " + s.sub());

		s.ad();
	}
}
