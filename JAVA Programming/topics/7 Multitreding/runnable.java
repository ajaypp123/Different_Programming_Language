//runnable


class thread1 implements Runnable
{
	public void run()
	{
		int i = 0;
		while(i<5)
		{
			System.out.println("In thread 1 : i = " + i);
			i=i+1;
		}
		System.out.println("First thread executed.");
	}
}

class thread2 implements Runnable
{
	public void run()
	{
		int i = 0;
		while(i<5)
		{
			System.out.println("In thread 2 : i = " + i);
			i=i+1;
		}
		System.out.println("Second thread executed.");
	}
}


class mainthread
{
	public static void main(String args[])
	{
		//create obj of runnable interface
		thread1 t1 = new thread1();
		Thread obj1 = new Thread(t1);
		obj1.start();

		thread2 t2 = new thread2();
		Thread obj2 = new Thread(t2);
		obj2.start();

		int j = 0;
		while(j<5)
		{
			System.out.println("In thread main : j = " + j);
			j=j+1;
		}
		System.out.println("main thread executed.");
	}
}