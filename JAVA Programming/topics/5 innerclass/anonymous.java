//Anonymous class

class anonymousclass 
{
	public static void main(String[] args) 
	{
		new OC().print();
	}
}

class OC 
{
	public void print() 
	{
		final String s = "test: ";
		System.out.println(new Object() 
		{
			private int x=1; 	
			private int y=2;
			public String toString() 
			{
				return s+"("+x+","+y+")"; 
			}
		} );
	}
}