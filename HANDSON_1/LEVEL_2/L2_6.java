package LEVEL_2;

import java.util.Scanner;

public class L2_6 {

	public static void main ( String args[ ])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the price : ");
		
		int price = sc.nextInt();
		
		System.out.print("Enter the quantity : ");
		
		int quant = sc.nextInt();
		
		double total_amt = price * quant;
		
		System.out.println("The total amount : "+total_amt);
		
		if ( total_amt > 1000 )
		{
			total_amt = total_amt - (total_amt * 0.10);
		}
		
		else if ( total_amt < 1000 )
		{
			total_amt = total_amt - (total_amt * 0.05);
		}
		
		System.out.println("The total amount after the dicount : " + total_amt);
		
	}
}
