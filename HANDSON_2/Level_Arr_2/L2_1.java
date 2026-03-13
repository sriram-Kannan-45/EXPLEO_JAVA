package Level_Arr_2;

import java.util.Scanner;

public class L2_1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int [n];
		
		for (int i=0 ; i<n ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("enter the target element : ");
		
		int t = sc.nextInt();
		
		for (int i=0 ; i<n ; i++)
		{
			if (arr[i] == t ) {
				
				System.out.println("true");
				
				return ; 
			}
		}

	}

}
