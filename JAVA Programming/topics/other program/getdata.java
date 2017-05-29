import java.util.Scanner;

class aj{
	
	private String name;
	
	public void setname(String n)
	{
		name = n;
	}
	
	public String getname()
	{
		return name ; 
	}	
	
	public void say()
	{
		System.out.println("Your name is " + name );
	}	
}

class aja
{
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);
		System.out.println("Enter name ");
		String name = input.nextLine();
		aj obj = new aj();
		obj.setname(name);
		obj.say();
	}
}