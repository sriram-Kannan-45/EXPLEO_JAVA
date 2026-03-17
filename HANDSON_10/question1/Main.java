package question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		List <String> list = new ArrayList<>();
		
		System.out.print("How many names do you want to input? : ");
		
		int n = sc.nextInt(); sc.nextLine();
		
		for (int i = 0 ; i < n ; i++)
		{
			System.out.print("Enter name #"+(i+1)+" : ");
			list.add(sc.nextLine());
			
			
		}
		
		System.out.println("Names longer than 5 characters:");
		
		for ( String str : list)
		{
			if (str.length() > 5 )
			{
				System.out.println(str);
			}
		}

	}

}
