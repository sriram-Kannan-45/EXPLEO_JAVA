package innerClass;

class outer
{
	int value = 56 ;
	
	public void outterClass()
	{
		System.out.println("inside the method of outter class ");
		
		class inner
		{
			public void innerClassMethod()
			{
				System.out.println("inside the method of inner class\nvalue : "+value);
			}
		}
		
		inner in = new inner();
		
		in.innerClassMethod();
	}
}
public class inner3
{
	public static void main( String args [])
	{
		outer out = new outer();
		out.outterClass();
	}
}
