package LEVEL_2;

import java.util.Scanner;

// Letters: 24, Digits: 4, Other Symbols: 4
public class L2_9 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int let_count=0, digit_count=0, other_count = 0;
		
		String str = sc.nextLine();
		
		for(int i=0 ; i<str.length();i++)
		{
			char ch = str.charAt(i);
			
			if (Character.isLetter(ch))
			{
				let_count++;
			}
			
			else if (Character.isDigit(ch))
			{
				digit_count++;
			}
			else
			{
				other_count++;
			}
		}
		
		System.out.println("Letters : "+let_count+" Digits : "+digit_count+" Other Symbols : "+other_count);

	}

}
