import java.util.Random;

class VisitorSchool implements Runnable 
{
	DrivingSchool drivingSchool;

	public VisitorSchool(DrivingSchool drivingSchool)
	{
		this.drivingSchool = drivingSchool;
	}

	public void run() 
	{
		if (CarsGreaterThanZero()) 
		{	
			getInTheCarAndDrive();
		} 
		else if (CarsEqualToZero()) 
		{
			waitForCar();
			getInTheCarAndDrive();
		}
	}

	public boolean CarsGreaterThanZero()
	{
		synchronized (drivingSchool) 
		{
			if (drivingSchool.getNoOfCars() > 0) 
			{
				return true;
			} else
			{
				return false;
			}
		}
	}

	public boolean CarsEqualToZero() 
	{
		synchronized (drivingSchool) 
		{
			if (drivingSchool.getNoOfCars() == 0) 
			{	
				return true;
			} else 
			{
				return false;
			}
		}
	}

void waitForCar() 
{
	synchronized (drivingSchool) 
	{
		try 
		{
			drivingSchool.wait();
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}

void getInTheCarAndDrive() 
{
	synchronized (drivingSchool)
	{
		drivingSchool.setNoOfCars(drivingSchool.getNoOfCars() - 1);
		System.out.println(Thread.currentThread().getName( )+ " is driving, " + drivingSchool.getNoOfCars()+ " available");
	}
	Random numGen = new Random();
	int r = numGen.nextInt(1000);
	try 
	{
		Thread.sleep(r);
	} catch (InterruptedException e) 
	{
		e.printStackTrace();
	}
	synchronized (drivingSchool) {
	drivingSchool.setNoOfCars(drivingSchool.getNoOfCars() + 1);
	System.out.println(Thread.currentThread().getName( )+ " has done driving, " + drivingSchool.getNoOfCars()+ " available");
	drivingSchool.notify();
	}
}
}

 class DrivingSchool 
{
	private int noOfCars = 3;

	public int getNoOfCars()
	{
		return noOfCars;
	}

	public void setNoOfCars(int noOfCars) 
	{
		this.noOfCars = noOfCars;
	}

	public static void main(String[] args) 
	{
		DrivingSchool drivingSchool = new DrivingSchool();
		VisitorSchool vs1 = new VisitorSchool(drivingSchool);
		Thread t1 = new Thread(vs1, "A");
		VisitorSchool vs2 = new VisitorSchool(drivingSchool);
		Thread t2 = new Thread(vs2, "B");
		VisitorSchool vs3 = new VisitorSchool(drivingSchool);
		Thread t3 = new Thread(vs3, "C");
		VisitorSchool vs4 = new VisitorSchool(drivingSchool);
		Thread t4 = new Thread(vs4, "D");
		VisitorSchool vs5 = new VisitorSchool(drivingSchool);
		Thread t5 = new Thread(vs5, "E");
		t1.start();
t2.start();
t3.start();
t4.start();
t5.start();
	}
}

