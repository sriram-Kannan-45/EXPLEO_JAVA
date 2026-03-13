package LEVEL_1;

import java.util.Scanner;

public class L1_2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		if (n!=0 && n%7==0)
		{
			System.out.println(n + " is a divisor of 7");
		}
		else
		{
			System.out.println(n + " is not a divisor of 7");
		}

	}

}
