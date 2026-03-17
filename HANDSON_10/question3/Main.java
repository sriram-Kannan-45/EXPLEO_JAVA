package question3;

import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)

	{
		// TODO Auto-generated method stub

		Map<Character, Integer> map = new HashMap<>();

		Scanner sc = new Scanner(System.in);

		char str[] = sc.nextLine().toCharArray();

		for (char c : str) {
			if (c == 'a' || c == 'c' || c == 's' || c == 'o') {
				if (map.containsKey(c)) {
					map.put(c, (map.get(c))+1);
				}

				else 
				{
					map.put(c, 1);
				}
			}
		}
		
		
		System.out.println();
		for (Map.Entry<Character, Integer> mp : map.entrySet())
		{
			System.out.println(mp.getKey()+" : "+mp.getValue());
		}

	}

}
