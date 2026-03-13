package interfaces;


interface Shape 
{
	double DEFAULT_VALUE = 1.0 ;
	
	double calculateArea();
	
	double calculatePerimeter();
	
	default String getDescription ()
	{
		return "A shape with unspecified Dimension ";
	}
	
}

class Circle implements Shape
{
	private double radius;
	
	public Circle (double r)
	{
		this.radius = r;
		
	}
	
	Circle ()
	{
		this.radius = DEFAULT_VALUE;
	}
	
	public double calculateArea()
	{
		return 3.14 * radius * radius ;
	}
	
	public double calculatePerimeter()
	{
		return 2 * 3.14 * radius ;
	}
	
	
	public String getDescription()
	{
		return "RADIUS : " + radius + " PERIMETER : "+calculatePerimeter() +" AREA : "+calculateArea() + "\n";
	}

	
}

class Rectangle implements Shape
{
	private double len , breath ;
	
	Rectangle (int len , int breath )
	{
		this.len = len ;
		this.breath = breath ;
	}
	
	Rectangle ()
	{
		this.breath = DEFAULT_VALUE;
		this.len = DEFAULT_VALUE;
	}
	
	public double calculateArea()
	{
		return len * breath ;
	}
	
	public double calculatePerimeter()
	{
		return 2 * ( len + breath ) ;
	}
	
	public String getDescription()
	{
		return "LENGTH : " + len + " BREATH : "+ breath + " PERIMETER : "+calculatePerimeter() +" AREA : "+calculateArea()+"\n";
	}
}
public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Circle c = new Circle(5);
		
		System.out.println(c.getDescription());
		
		Rectangle r = new Rectangle(2,3);
		
		System.out.println(r.getDescription());

	}

}
