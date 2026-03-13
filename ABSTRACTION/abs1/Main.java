package abs1;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Shape s ;
		
		s = new Rectangle(23,4);
		
		s.area();
		s.perimeter();
		
		System.out.println();
		
		s = new Square(23);
		
		s.area();
		s.perimeter();
		
		System.out.println();
		
		s = new Circle(3);
		
		s.area();
		s.perimeter();

	}

}
