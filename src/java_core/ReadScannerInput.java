package java_core;

import java.util.Scanner;

public class ReadScannerInput {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); // call the Scanner class by the obj 
		
		System.out.println("Enter your Name :"); // call the print statement 
		
		String str = sc.nextLine(); // scanner method for String
		
		System.out.println("Hi "+str+" welcome to the trainning program... "); // print statement 

	}

}
