package ControlFlow;

import java.util.Scanner;

public class ifelseStructure {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in); // scanner class access
		
		boolean isMoving = true ;
		
		
		int currentSpeed = 10;
		
		if (isMoving) // conditional statement 
		{
			currentSpeed--;
			System.out.println("The bicylce speed was redused");
		}
		else
		{
			System.out.println("The bicycle alredy stoped");
		}
	}

}
