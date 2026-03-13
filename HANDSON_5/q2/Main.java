package q2;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		System.out.println("Hii user please select the option to be you work \n1.CREDIT \n2.UPI \n3.NET BANKING\n4.EXIT\n---------------------");
		
		Scanner sc = new Scanner (System.in);
		Random r = new Random();
		String tId = String.valueOf(r.nextInt(1,555555555));
		int n = sc.nextInt();
		
		sc.nextLine();
		
		switch(n)
		{
		case 1:
			
			
			
			System.out.println("ENTER THE NAME : ");
			String name = sc.nextLine();
			System.out.println("ENTER THE CARD NUMBER : ");
			String cardNo = sc.nextLine();
			System.out.println("ENTER THE CVV NUMBER : ");
			String cvv = sc.nextLine();
			System.out.println("ENTER THE CARD EXPIRY DATE : ");
			String year = sc.nextLine();
			
			System.out.println("ENTER THE AMOUNT : ");
			
			double amt = sc.nextDouble();
			
			
			
			criditcard cd = new criditcard(tId,amt,name,cardNo,cvv,year);
			
			cd.executeTransaction();
			
			break;
			
		case 2 :
			
			System.out.println("ENTER THE NAME : ");
			String name_upi = sc.nextLine();
			
			System.out.println("ENTER THE AMOUNT : ");
			
			double amot = sc.nextDouble();
			System.out.println("ENTER THE UPI ID : ");
			
			sc.nextLine();
			String upiId = sc.nextLine();
			System.out.println("ENTER THE UPI PIN : ");
			String upiPin = sc.nextLine();
			
			upi up = new upi (tId,amot,name_upi,upiId,upiPin);
			
			up.executeTransaction();
			break;
		case 3:
			
			System.out.println("ENTER THE NAME : ");
			String name_net = sc.nextLine();
			
			System.out.println("ENTER THE AMOUNT : ");
			
			double amount = sc.nextDouble();
			System.out.println("ENTER THE bank : ");
			
			sc.nextLine();
			String bank = sc.nextLine();
			System.out.println("ENTER THE ACCOUNT NUMBER : ");
			String acc = sc.nextLine();
			
			System.out.println("ENTER IFSC : ");
			
			String ifsc = sc.nextLine();
			
			netbanking net = new netbanking (tId,amount,name_net,bank,acc,ifsc);
			
			net.executeTransaction();
			
			break;
			
		case 4:
			break;
		}
		
		
		
		
		
		
	}

}
