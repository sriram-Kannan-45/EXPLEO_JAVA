package LEVEL_1;

import java.util.Scanner;

public class L1_6 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		while (true)
		{
			int n = sc.nextInt();
			
			if (n<0) {
				
				break ;
			}
			
			count += n;
			
			for (int i=0 ;i<n;i++) {
				System.out.println("HELLO");
			}
		}
		
		System.out.println("the total number of the displayed\r\n"
				+ "\"Hello\" "+ count);

	}

}
