package LEVEL_1;

import java.util.Scanner;

/*
 * a. Age should be above 18 yrs but less than 55 yrs.
   b. Weight should be more than 45kg.
 */
public class L1_7 {
	
	public static void main(String sr[])
	{
		Scanner sc = new Scanner (System.in);
		
		int age = sc.nextInt();
		
		int weight = sc.nextInt();
		
		if( age > 18 && 
				age < 55)
		{
			if (weight > 45)
			{
				System.out.println("ELIGIBLE");
			}
		}
		
		else
		{
			System.out.println("NOT ELIGIBLE");
		}
		
	}

}
