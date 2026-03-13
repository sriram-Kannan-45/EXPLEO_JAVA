package inheritance_1;

public class projectLeader  // parent class
{
	String proLeadName = "ram";
	
	int empId = 100;
	
	void display ()
	{
		System.out.println("parent display \nproLeadName : "+proLeadName);
		System.out.println("empId : "+ empId);
	}
}

class programmer extends projectLeader  // child class
{
	String projectName ; 
	
	int empId ;
	
	void setDetails(String name , int id) // child class method 
	{
		projectName = name;
		empId = id;
	}
	
	void display ()
	{
		System.out.println("child diplay\nchild ProjectName : "+ projectName);
		System.out.println("child empId : "+ empId);
		super.display();
	}
}
