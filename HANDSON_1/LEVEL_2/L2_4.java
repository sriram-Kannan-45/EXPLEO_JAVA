package LEVEL_2;

import java.util.Scanner;

public class L2_4 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the hours : ");
		int hrs = sc.nextInt();
		
		if (hrs > 7 )
		{
			System.out.println("Sry please run again and put value under 7");
			
			return ;
		}
		
		System.out.print("Enter the minite : ");
		int min = sc.nextInt();
		
		int total = 0;
		if (hrs == 5)
		{
			total = 200 + min ;
		}
		else
		{
			total = (hrs * 50 ) + min ;
		}
		
		System.out.println("Total RS : "+total);

	}

}
