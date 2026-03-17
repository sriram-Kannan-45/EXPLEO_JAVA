package question4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Main 
{

	public static void main (String args[])
	{
		Map <String , Integer > map = new HashMap<>();
		
		System.out.println("Enter the six members name and mark ");
		
		Scanner sc = new Scanner (System.in);
		
		for (int i = 0 ; i < 6 ; i++)
		{
			String name = sc.nextLine();
			
			int mark = sc.nextInt();sc.nextLine();
			
			map.put(name, mark);
		}
		
		Stack <String> st = new Stack<>();
		
		for (Map.Entry<String , Integer > mp : map.entrySet())
		{
			if (mp.getValue() > 75 )
			{
				st.push(mp.getKey());
			}
		}
		
		System.out.println(st);
	}
}
