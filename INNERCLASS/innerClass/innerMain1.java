package innerClass;

class outterClass
{
	int age = 10 ;
	
	public void checkAge()
	{
		System.out.println("In checkAge() ");
	}
	
	class innerClass 
	{
		public void show()
		{
			System.out.println("In show() ");
		}
	}
}
public class innerMain1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		outterClass o = new outterClass();
		
		System.out.println(o.age);
		
		o.checkAge();
		
		outterClass.innerClass in = o.new innerClass();
		
		in.show();
	}

}
