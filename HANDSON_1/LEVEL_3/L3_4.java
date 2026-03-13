package LEVEL_3;

import java.util.Scanner;

public class L3_4 {
	
	public static void main (String str[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int result = 0;
		if (n < 2000)
		{
			result = (n *5)/100;
		}
		
		else if ( n>=2000 && 
				  n<5000)
		{
			result = (n *25)/100;
		}
		
		else if ( n>=5000 &&
				  n<100000 )
		{
			result = (n* 35)/(100);
		}
		
		else
		{
			result = (n * 50)/100;
		}
		
		System.out.println((float)(n-result));
		
		sc.close();
	}

}
