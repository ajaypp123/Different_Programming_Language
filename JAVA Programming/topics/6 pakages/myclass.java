package ajay;
import pkg.*;

class myclass
{
	public static void main(String[] args) 
	{
		mathfun obj = new mathfun();

		obj.add();
		obj.sub();
	}
}


/*

C:\Users\rit\Desktop>javac -d . mathfun.java

C:\Users\rit\Desktop>java pkg.mathfun
Error: Main method not found in class pkg.mathfun, please define the main method
 as:
   public static void main(String[] args)

C:\Users\rit\Desktop>javac -d . myclass.java

C:\Users\rit\Desktop>java ajay.myclass
Sum of a and b is = 84
Sum of a and b is = 16

C:\Users\rit\Desktop>



*/