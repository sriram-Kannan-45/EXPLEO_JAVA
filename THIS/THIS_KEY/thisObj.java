package THIS_KEY;

public class thisObj
{

	int empId;
	
	String empName;
	
	double empSalary; 
	
	thisObj (int id , String empName ,double empSalary)
	{
		this.empId = id ;
		this.empName = empName ;
		this.empSalary = empSalary;
	}

	thisObj()
	{
		this(2,"ram",30000);
		
		toString();
	}
	
	void registeredEmploye()
	{
		System.out.println("Employee details");
		
		System.out.println(this.toString());
	}
	
	void sendForProcessing()
	{
		HRDepartment hr = new HRDepartment();
		
		hr.processEmploye(this);
	}
	
	thisObj updateSalary(double hikePercentage)
	{
		this.empSalary = empSalary + (empSalary * hikePercentage / 100 );
		
		return this;
	}
	
	thisObj updateName (String newName )
	{
		this.empName = newName;
		
		return this;
	}
	
	
	public String toString()
	{
		return " empId : " + empId + " empName : " + empName + " empSalary : " + empSalary ;
	}
	
	
}

class HRDepartment
{
	void processEmploye(thisObj obj )
	{
		System.out.println("HR department processing");
		
		System.out.println("processed employee "+obj.empName+" with salary "+obj.empSalary+"\n");
	}
}
