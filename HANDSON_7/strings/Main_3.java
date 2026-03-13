package strings;

import java.util.Scanner;

public class Main_3 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("USER NAME : ");
		String userName = sc.nextLine();
		
		System.out.print("PASSWORD : ");
		String passWord = sc.nextLine() ;
		
		System.out.print("IP ADDRESS : ");
		String ip= sc.nextLine(); 
		
		String ipArray[] = ip.split("\\.");
		
		for (int i=0 ; i<ipArray.length ; i++ )
		{
			int ipNum = Integer.parseInt(ipArray[i]);
			
			if (ipNum < 0 || ipNum > 255 )
			{
				System.out.println("Invalid ip number ");
				return ;
			}
		}
		
		String status = "SUCCESS";
		
		passWord = passWord.replaceAll(passWord,"***********");
		
		ip = ip.replaceAll(ip,"XXX.XXX.XXX.XXX");
		
		System.out.println("USER NAME : "+userName+"\nPASSWORD : "+passWord+"\nIP : "+ip+"\nSTATUS : "+status);

	}

}
