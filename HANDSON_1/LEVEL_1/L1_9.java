package LEVEL_1;

import java.util.Scanner;

public class L1_9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		while (n>0)
		{
			sum += n%10;
			
			n=n/10;
		}
		
		System.out.println("THE TOTAL IS : "+sum);
		// TODO Auto-generated method stub

	}

}
