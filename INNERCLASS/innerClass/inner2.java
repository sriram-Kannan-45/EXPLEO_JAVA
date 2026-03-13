package innerClass;

class person
{
	int age = 21 ;
	
	static int weight = 45 ;
	
	static class Gender
	{
		void nonStaticDisplay()
		{
			System.out.println("In non static display method \nweight value "+weight);
		}
		
		static void display()
		{
			System.out.println("in static display method \nweight value "+weight);
		}
	}
	
	Gender gender = new Gender();
	
}
public class inner2
{

	public static void main(String []arg )
	{
		person p = new person();
		
		p.gender.nonStaticDisplay();
		
		p.gender.display();
	}
}
