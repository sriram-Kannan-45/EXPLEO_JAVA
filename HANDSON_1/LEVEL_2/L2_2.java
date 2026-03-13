package LEVEL_2;

import java.util.Scanner;

public class L2_2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("ENTER THE PRICE : ");
		double price = sc.nextDouble();
		
		System.out.print("ENTER THE QUANTITY : ");
		
		int qunti = sc.nextInt();
		
		double total = price * qunti;
		
		System.out.println("TOTAL : "+total);
		
		double discount=0;
		
		if(qunti > 500) {
			
			discount =  (total*0.15);
		}
		
		System.out.println("AFTER DISCOUNT : "+ (total - discount));

	}

}
