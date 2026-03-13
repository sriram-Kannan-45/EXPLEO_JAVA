package LEVEL_1;

import java.util.Scanner;

public class L1_8 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		
		if (Character.isDigit(ch))
		{
			System.out.println("DIGIT");
		}
		
		else if (Character.isLetter(ch))
		{
			System.out.println("ALPHABET");
		}
		
		else {
			System.out.println("Special SymboL");
		}

	}

}
