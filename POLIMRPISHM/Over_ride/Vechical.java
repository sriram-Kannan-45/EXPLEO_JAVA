package Over_ride;

class Vechical 
{
	void run()
	{
		System.out.println("Vechical is running ");
	}
}

class Truck extends Vechical
{
	void run()
	{
		System.out.println("Truck is running ");
	}
}


