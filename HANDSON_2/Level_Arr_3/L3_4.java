package Level_Arr_3;

import java.util.Arrays;
import java.util.Scanner;

public class L3_4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		
		int arr_x[] = new int [x];
		
		for (int i=0 ; i<x ; i++)
		{
			arr_x[i] = sc.nextInt();
		}
		
		
		int y = sc.nextInt();
		
		int arr_y[] = new int [y];
		
		for (int i=0 ; i<y ; i++)
		{
			arr_y[i] = sc.nextInt();
		}
		
		int z = sc.nextInt();
		
		int arr_z[] = new int [z];
		
		for (int i=0 ; i<z ; i++)
		{
			arr_z[i] = sc.nextInt();
		}
		
		int new_arr[] = new int [x+y+z];
		int j=0;
		for (int i=0 ; i<x ; i++)
		{
			new_arr[j++] = arr_x[i];
		}
		
		for (int i=0 ; i<y ; i++)
		{
			new_arr[j++] = arr_y[i];
		}
		
		for (int i=0 ; i<z ; i++)
		{
			new_arr[j++] = arr_z[i];
		}
		
		Arrays.sort(new_arr);
		
		for (int i=0 ; i<(x+y+z) ; i++)
		{
			System.out.print(new_arr[i]+" ");
		}
		

	}

}
