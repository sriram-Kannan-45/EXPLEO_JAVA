package Hands_on_2;

import java.util.Scanner;

class Employee 
{
	Scanner sc = new Scanner(System.in);
	private int empId ; 
	private String empName ; 
	
	public void markCheckIn (Attendance att)
	
	{
		System.out.print("Enter the id ");
		
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter the Name ");
		String name = sc.nextLine();
		
		this.empId = id;
		this.empName = name;
		
		att.setEmpId(empId);
		
		if (att.markCheckIn())
		{
			System.out.println(" sucessfull ");
			
			System.out.println(att.toString());
		}
		else 
		{
			System.out.println(" pls checkout first ");
		}
		
		
	}
	
	public void markCheckOut (Attendance att)
	
	
	{
		
		System.out.print("Enter the id ");
		
		int id = sc.nextInt();
		sc.nextLine();
		
		if (att.getEmpId() != id )
		{
			System.out.println("Wrong ID");
			return;
		}
		
		
		
		if (att.markCheckOut())
		{
			System.out.println(" sucessfully exit ");
			
			System.out.println(att.toString());
		}
		
		else
		{
			System.out.println("pls first check in");
		}
	}
}
