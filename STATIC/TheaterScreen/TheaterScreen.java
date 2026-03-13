package TheaterScreen;

public class TheaterScreen
{
	private static int totseat = 20;
	TheaterScreen(){
		System.out.println("Current seat availability : "+totseat);
	}
	public void Display_TheaterScreen() {
		System.out.println("Current seat avail : "+totseat);
	}
	public static void BookTicket(int nooftick) {
		System.out.println("No. of seats booked : "+nooftick);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Screen ticket avaliability status ");
		
		TheaterScreen TS1 = new TheaterScreen();
		
		BookTicket(4);
		
		TheaterScreen TS2 = new TheaterScreen();
		
		BookTicket(5);
		
		TS2.Display_TheaterScreen();

	}
}
