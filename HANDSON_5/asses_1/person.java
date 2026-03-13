package asses_1;

public class person
{
	String name ;
	
	String address ;
	
	protected person ( String name , String address )
	{
		this.name = name;
		
		this.address = address;
	}

	public String getName() {
		return name;
	}

	

	public String getAddress() {
		return address;
	}

	@Override
	public String toString()
	{
		return "person [name=" + name + ", address=" + address + "]";
	}
	
}


