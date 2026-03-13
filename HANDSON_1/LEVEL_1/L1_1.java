package LEVEL_1;

import java.util.Scanner;

public class L1_1 {
	
	public static void main(String srt[])
	{
		Scanner sc = new Scanner (System.in);
		
		
		
		
		
		
		
		
		
		System.out.print("ENTER A NAME : ");
		String name = sc.next();
		
		System.out.print("ENTER A WAGES : ");
		int wages = sc.nextInt();
		
		System.out.print("ENTER A NO OF DAYS WORKED : ");
		int days = sc.nextInt();
		
		System.out.println("NAME : "+name);
		System.out.println("WAGES : "+wages);
		System.out.println("WORKING DAYS : "+days);
		System.out.println("SALARY : "+(wages*days));
	}

}
