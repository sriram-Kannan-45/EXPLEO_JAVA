package strings;
/*
 * Write a Java method that removes all duplicate characters from a given string while
preserving the order of first appearance.
 Constraints:
• Ignore case for duplication comparison (optional based on requirement)
• Do not use Set<String> built-in removal methods
• Use your own logic + frequency/boolean array
Sample Input:
corporate assignment
Sample Output:
corpte asingm
 */
public class Main_1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String str = "corporate assignment".toLowerCase();
		
		boolean arr[] = new boolean [26];
		
		String res = "";
		
		for (int i = 0 ; i < str.length() ; i++)
		{
			char val = str.charAt(i);
			
			if (val == ' ')
			{
				res += val ;
				
				continue;
			}
			
			if (!arr[ val - 'a'])
			{
				res += val;
				
				arr[val - 'a'] = true ;
			}
		}
		
		
		System.out.println("Original input : "+ str);
		System.out.println("Result : "+res);
		
		
	}

}
