package abs1;

public abstract class Shape
{
	
	void draw()
	{
		System.out.println("drawing");
	}
	
	abstract void area();
	
	abstract void perimeter();

}

class Rectangle extends Shape
{
	private int len , breath ;
	
	Rectangle (int len , int breath)
	{
		this.len = len ; 
		
		this.breath = breath ;
	}
	
	void area()
	{
		System.out.println("RECTANGLE AREA IS : "+ (len*breath));
	}
	
	void perimeter()
	{
		System.out.println("RECTANGLE PERIMETER IS : "+ (2*(len + breath)));
	}
}

class Square extends Shape
{
	private int side ;
	
	Square (int side)
	{
		this.side = side ;
	}
	
	void area ()
	{
		System.out.println("SQUARE AREA : "+(side*side));
	}
	
	void perimeter()
	{
		System.out.println("SQUARE PERI : "+(4*side));
	}
}

class Circle extends Shape
{
	final double pi = 3.14 ;
	
	private int r;
	
	Circle (int r)
	{
		this.r = r ;
	}
	
	void area ()
	{
		System.out.println("CIRCLE AREA : " +(pi*r*r));
	}
	
	void perimeter ()
	{
		System.out.println("CIRCLE PERIMETER : "+(2*pi*r));
	}
}