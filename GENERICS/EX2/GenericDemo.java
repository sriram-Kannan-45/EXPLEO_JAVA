package EX2;

public class GenericDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Test <String , Integer , Float > obj = new Test<>("sriram",3,4.5f);
		
		obj.print();

	}

}
