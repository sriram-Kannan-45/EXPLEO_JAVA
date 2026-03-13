package LEVEL_1;

import java.util.Scanner;

public class L1_F3 {

	static void hikeSalary(int salary , int hike)
	{
		int newSalary = salary + ((salary * hike)/100);
		
		System.out.println("The new hike salary is "+newSalary);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int salary = sc.nextInt ();
		
		int hike = sc.nextInt();
		
		hikeSalary(salary,hike);

	}

}
