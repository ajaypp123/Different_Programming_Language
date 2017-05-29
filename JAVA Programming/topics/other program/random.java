import java.util.Random ;

class rand 
{
	public static void main(String args[])
	{
		Random r = new random();
		int n , c;
		for(c=0;c<=5;c++)
		{
			n = r.nextInt(6);
			System.out.println(n);
		}
	}
}