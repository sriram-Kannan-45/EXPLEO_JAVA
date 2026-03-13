package EX1;

public class GenericDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Demo <Integer> iobj = new Demo<Integer>();
		
		iobj.set(25);
		
		System.out.println(iobj.get());
		
		
		Demo <String> sobj = new Demo<String>();
		
		sobj.set("sriram");
		
		System.out.println(sobj.get());
	}

}
