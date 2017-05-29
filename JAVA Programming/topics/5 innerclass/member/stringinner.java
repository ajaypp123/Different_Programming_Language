//member class toString()

class myclass
{

	public static void main(String[] args) 
	{
		new OC().new IC().print(); // Output: IC, OC
	}
}

class OC 
{
	class IC 
	{
		public String toString() 
		{
			return "In class IC"; 
		}
		public void print() 
		{
			System.out.println(this);
			System.out.println(OC.this);
		}
	}
	public String toString() { return "In class OC"; }
}