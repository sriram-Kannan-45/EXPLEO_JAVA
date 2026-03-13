package qn1;



class PermanentEmployee extends Employee 
	{
	    private double bonus;

	    public PermanentEmployee(String empId, String empName,
	                             double baseSalary, double bonus)
	    {
	        super(empId, empName, baseSalary);
	        this.bonus = bonus;
	    }

	   
	    public double calculateSalary() 
	    {
	        return baseSalary + bonus;
	    }
	}

