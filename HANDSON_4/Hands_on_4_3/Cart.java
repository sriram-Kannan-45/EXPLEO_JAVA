package Hands_on_4_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart 
{
	List<Product> list = new ArrayList<>();
	
	Scanner sc = new Scanner (System.in);
	
	void addProduct() 
	{
		System.out.print("Enter the id : ");
		
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter the product  name : ");
		
		String name = sc.nextLine();
		
		System.out.print("Enter the price : ");
		
		double price = sc.nextDouble();
		
		System.out.print("Enter the quantity : ");
		
		int qunt = sc.nextInt();
		
		Product obj = new Product( id , name , price);
		
		obj.setQunatity(qunt);
		
		list.add(obj);
	}
	
	void remove()
	{
		System.out.println("Enter the id to remove ");
		int id = sc.nextInt();
		for (Product obj : list )
		{
			if (obj.getProductId()==id)
			{
				list.remove(obj);
			}
		}
		System.out.println("After remove : ");
		display();
	}
	
	void calculateCartTotal() 
	{
		int cal = 0 ;
		
		for (Product obj : list )
		{
			cal += obj.calculateTotal();
		}
		
		System.out.println("The total value amount is : "+ cal);
	}
	
	void display()
	{
		for (Product obj : list )
		{
			System.out.println(obj.getProductDetails());
		}
	}
	
}
