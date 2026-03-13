package THIS_KEY;

public class Main {

	public static void main(String[] args) 
	{
		thisObj obj = new thisObj (1,"titoo",20000);
		
		obj.registeredEmploye();
		
		obj.sendForProcessing();
		
		System.out.println("UPDATE");
		
		obj.updateName("SRIRAM");
		
		obj.updateSalary(200);
		
		obj.sendForProcessing();
		
		
	}

}
