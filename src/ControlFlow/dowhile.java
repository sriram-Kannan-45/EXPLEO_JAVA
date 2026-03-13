package ControlFlow;

public class dowhile {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int maxSeat = 5 , seat_count = 0;
		
		do
		{
			System.out.println("Current availablity of seat "+(maxSeat - seat_count));
			seat_count++;
		}
		while (seat_count < maxSeat);
		
		System.out.println("\nSeats are filled");

	}

}
