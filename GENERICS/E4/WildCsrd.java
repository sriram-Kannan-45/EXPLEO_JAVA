package E4;

import java.util.ArrayList;
import java.util.List;

public class WildCsrd {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		List <Integer> ints = new ArrayList<>();
		
		ints.add(3);
		ints.add(5);
		ints.add(10);
		
		double sum = sum(ints);
		
		System.out.println("Sum of the ints = "+sum);
		
	}

	private static double sum(List< ? extends Number> list)
	{
		// TODO Auto-generated method stub
		double sum = 0;
		
		for (Number n : list )
		{
			sum += n.doubleValue();
		}
		
		return sum ;
	}

}
