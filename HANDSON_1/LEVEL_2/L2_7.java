package LEVEL_2;

import java.util.Scanner;

/*
Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary is between 10001 to 20000: HRA = 25%, DA = 90%
Basic Salary >= 20001 : HRA = 30%, DA = 95%
Gross Salary=Basic Salary + HRA + DA

 */
public class L2_7 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the basic salary : ");
		int basic_salary = sc.nextInt();
		
		int har = 0;
		
		int da = 0;
		
		if (basic_salary <= 10000 )
		{
			har =( basic_salary * 20 ) / 100;
			
			da = ( basic_salary * 80 ) / 100;
		}
		
		else if (basic_salary >= 10001 &&
							basic_salary <= 20000)
		{
			har = ( basic_salary * 25 ) / 100 ;
			
			da = ( basic_salary * 90 ) / 100;
		}
		
		else
		{
			har = ( basic_salary * 30 ) / 100;
			
			da = ( basic_salary * 95 ) / 100;
		}
		
		double gros = basic_salary + har + da ;
		
		System.out.println("HAR : "+har);
		
		System.out.println("DA : "+ da);
		
		System.out.println("The gross salary is : "+ gros);
	}

}
