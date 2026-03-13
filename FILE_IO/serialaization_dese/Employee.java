package serialaization_dese;

public class Employee implements java.io.Serializable 
{
	public static transient int empId ;
	
	public static  String empName ;
	
	public Employee (int id , String name )
	{
		this.empId = id ;
		
		this.empName = name ;
	}
	
	
}
