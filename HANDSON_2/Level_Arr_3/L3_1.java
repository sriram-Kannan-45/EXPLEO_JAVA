package Level_Arr_3;

import java.util.Scanner;

public class L3_1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		int total = 0;
		
		for (int i=0 ; i<n ; i++)
		{
			arr[i] = sc.nextInt();
			
			total += arr[i];
		}
		
		if ( total%n == 0 )
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}

	}

}
