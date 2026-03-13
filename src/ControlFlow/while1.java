package ControlFlow;

public class while1 
{
	public static void main(String args[])
	{
		int num = 10 , seat_count = 0;
		
		while (seat_count < num)
		{
			System.out.println("current seat availability : "+num--);
		}
		
		System.out.println("\nSeats are Filed");
	}
}
