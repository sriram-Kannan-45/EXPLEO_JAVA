package ControlFlow;

import java.util.Scanner;

public class if_else_2 {
	public static void main(String arg[])
	{
		Scanner sc = new Scanner (System.in); // scanner class access
		
		boolean avaliable = false;
		
		System.out.print("Enter the seat no : ");
		String num = sc.next();// to got the input of the number 
		
		if (avaliable) // conditional statement 
		{
			System.out.println("You have been boked the seat number : "+ num);
		}
		else
		{
			System.out.println("Seat number "+num+" is alredy Booked...");
		}
		
	}
}
