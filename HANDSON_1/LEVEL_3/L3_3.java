package LEVEL_3;

import java.util.Scanner;

public class L3_3 
{
	public static void main ( String Str[ ] )
	{
		Scanner sc = new Scanner (System.in);
		
		String str = sc.next();
		
		if (str.length()!=4)
		{
			System.out.println(str+" is not a valid car number");
			return;
		}
		
		int i=0;
		
		int sum = 0;
		while (str.length()>i)
		{
			sum = sum + str.charAt(i) - '0';
			
			i++;
		}
		
		if (sum % 3 == 0
				|| sum % 5 == 0
				|| sum % 7 == 0 )
		{
			System.out.println("Lucky Number");
		}
		
		else
		{
			System.out.println("Sorry it’s not my lucky number");
		}
	}

}
