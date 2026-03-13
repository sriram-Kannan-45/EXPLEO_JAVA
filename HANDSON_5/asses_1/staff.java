package asses_1;

class staff extends person
{
	String school ; 
	
	double pay ;
	
	staff ( String name , String address , String school , double pay)
	{
		super(name,address);
		
		this.school = school;
		
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "staff [school=" + school + ", pay=" + pay + ", name=" + getName() + ", address=" + getAddress() + "]";
	}

	

	
	
	
}
