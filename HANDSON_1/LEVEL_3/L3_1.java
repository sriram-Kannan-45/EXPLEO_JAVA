package LEVEL_3;

import java.util.Scanner;

public class L3_1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		char charArray[]= sc .nextLine().toCharArray();
		
		for(int i=0 ; i<charArray.length ; i++)
		{
			for(int j=0 ; j< charArray.length-1 ; j++ )
			{
				if ( charArray[j]>charArray[j+1])
				{
					char temp = charArray[j];
					
					charArray[j] = charArray[j+1];
					
					charArray[j+1] = temp ;
				}
			}
		}
		
		for (char ch : charArray)
		{
			System.out.print(ch);
		}

	}

}
