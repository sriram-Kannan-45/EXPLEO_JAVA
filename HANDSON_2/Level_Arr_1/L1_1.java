package Level_Arr_1;

import java.util.Scanner;

public class L1_1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int odd[] = new int [5];
		
		int even[] = new int [5];
		
		int odd_index=0;
		
		int even_index=0;
		
		for (int i=1; i <= 10 ; i++ )
		{
			if (i%2 == 0)
			{
				even[even_index++] = i;
			}
			
			else
			{
				odd [odd_index++] = i;
			}
		}
		
		System.out.print("EVEN : ");
		
		for (int i=0 ; i<5 ; i++)
		{
			System.out.print(even[i]+" ");
		}
		System.out.println();
		System.out.print("ODD : ");
		
		for (int i=0 ; i<5 ; i++)
		{
			System.out.print(odd[i]+" ");
		}

	}

}
