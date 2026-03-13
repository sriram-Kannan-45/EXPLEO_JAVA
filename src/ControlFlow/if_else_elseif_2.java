package ControlFlow;

import java.util.Scanner;

public class if_else_elseif_2 
{
	public static void main(String str[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Types of seat avaliable \nREGULAR \nPREMIUM \nEXECUTIVE \nVIP \nchoose any one of hte option ");
		
		String seat = sc.next().toUpperCase();
		
		if (seat.equals("REGULAR"))
		{
			System.out.println("You have been selected a REGULAR seat and its cost was 80");
		}
		
		else if (seat.equals("PREMIUM"))
		{
			System.out.println("You have been selected a PREMIUM seat and its cost was 100");
		}
		
		else if (seat.equals("EXECUTIVE"))
		{
			System.out.println("You have been selected a EXECUTIVE seat and its cost was 120");
			
		}
		
		else if (seat.equals("VIP"))
		{
			System.out.println("You have been selected a VIP seat and its cost was 150");
		}
		
		else
		{
			System.out.println("You have not selected any type");
		}
	}
}
