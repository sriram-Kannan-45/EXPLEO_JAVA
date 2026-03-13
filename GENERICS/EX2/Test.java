package EX2;

public class Test <T,U,R> 
{

	T obj1 ;
	
	U obj2 ;
	
	R obj3 ;
	
	Test (T ob1 , U ob2 , R ob3)
	{
		this.obj1 = ob1 ;
		
		this.obj2 = ob2 ;
		
		this.obj3 = ob3 ;
	}
	
	public void print()
	{
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}
	
}


