package LEVEL_3;

import java.util.Scanner;

public class L3_5 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }
		
		int fact = 1;
		
		int i= 1;
		while (true)
			
		{
			fact = fact * i;
			
			
			if (fact  > n) 
			{
				System.out.println("Sorry. The given number is not a perfect factorial");
				break;
			}
			
			else if (fact  == n)
			{
				System.out.println(i);
				break;
			}
			
			i++;
			
		}
	}
}
