package question5;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		List <Integer > list = new LinkedList<>();
		
		Set <Integer> tree = new TreeSet<>();
		
		Scanner sc = new Scanner(System.in);
		
		while (true)
			
		{
			System.out.print("Enter a number (or type 'done' to finish) : ");
			String val = sc.nextLine();
			if ( val.equals("done") )
			{
				break;
			}
			
			else 
			{
				int n = Integer.parseInt(val);
				
				tree.add(n);
			}
		}
		
		System.out.println("Sorted unique numbers : "+tree);
		
		float avg = 0 ;
		
		for ( int i : tree )
		{
			avg += i ;
			
			if ( i % 2 != 0)
			{
				list.add(i);
			}
		}
		
		System.out.println("Average : "+avg/tree.size());
		
		int low = 0 , high = 0;
		
		for (int i : tree)
		{
			if ( low > i)
			{
				low = i;
			}
			
			if (high < i)
			{
				high = i;
			}
		}
		
		System.out.println("Lowest : "+low+"\nHighest : "+high+"\nOdd numbers : "+list);

	}

}
