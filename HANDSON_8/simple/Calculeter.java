package simple;

import java.util.Scanner;

public class Calculeter {

	static long power(int n, int p) throws Exception
	{

        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }

        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }

        return (long) Math.pow(n, p);
    }
	
	
	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		
		
		
		try
		
		{
			int n1 = sc.nextInt();
			
			int n2 = sc.nextInt();
			System.out.println(power(n1,n2));
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
