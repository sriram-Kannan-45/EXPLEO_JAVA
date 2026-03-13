package Level_Arr_1;

import java.util.Scanner;

public class L1_2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no of element to be add : ");
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		
		for (int i=0 ; i<n ; i++)
		{
			arr[i] = sc.nextInt();
			
			
		}
		
		for (int i=0 ; i<n ; i++)
		{
			for (int j=0 ; j<n-1 ; j++)
			{
				if (arr[j] > arr[j+1])
				{
					int temp = arr[j];
					
					arr[j] = arr[j+1];
					
					arr[j+1] = temp;
				}
			}
		}
		System.out.print(" After sort ");
		for (int i=0 ; i<n ; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
