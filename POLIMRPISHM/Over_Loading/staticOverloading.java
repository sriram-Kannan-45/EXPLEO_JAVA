package Over_Loading;

public class staticOverloading {

	
	static int add (int a , int b)
	{
		return a+b;
	}
	
	static double add (double a , double b )
	{
		return a+b;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("static overloading by int : "+ add(1,2));
		
		System.out.println("static overloading by double : "+add (2.33 , 444.5));
	}

}
