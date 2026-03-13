package LEVEL_1;

import java.util.Scanner;

public class L1_4 
{
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int i = sc.nextInt();
        
        int j = 1;
        
        do
        {
        	System.out.println(j++);
        }
        while (i>=j);
    }

}
