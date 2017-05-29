

class thread1 extends Thread
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

class thread2 extends Thread
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
		thread1 t1 = new thread1();
		t1.setPriority(4);
		t1.start();

		thread2 t2 = new thread2();
		t2.start();
		t1.setPriority(7);

		int j = 0;
		while(j<5)
		{
			System.out.println("In thread main : j = " + j);
			j=j+1;
		}
		System.out.println("main thread executed.");
	}
}