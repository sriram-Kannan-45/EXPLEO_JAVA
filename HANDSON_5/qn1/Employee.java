package qn1;



class Employee
{
	    protected String empId;
	    protected String empName;
	    protected double baseSalary;

	    public Employee(String empId, String empName, double baseSalary) 
	    {
	        this.empId = empId;
	        this.empName = empName;
	        this.baseSalary = baseSalary;
	    }

	    public String getEmpId() 
	    {
	    	return empId; 
	    	
	    }
	    public String getEmpName() 
	    { 
	    	return empName; 
	    	
	    }
	    public double getBaseSalary() { 
	    	return baseSalary; 
	    	
	    }

	    public double calculateSalary() 
	    {
	        return baseSalary;
	    }

	    public String toString() 
	    {
	        return "ID: " + empId +
	               "\nName: " + empName +
	               "\nFinal Salary: " + calculateSalary();
	    }
}

	

