import java.util.Scanner;

class avarage
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		int avg ,total,c,p;
		total = 0;
		c = 0;
		
		while(c<10)
		{
			p = input.nextInt();
			total = total + p;
			c++;
		}
		
		avg = total/10;
		
		System.out.println("avarage =  " + avg);
	}
}	
		