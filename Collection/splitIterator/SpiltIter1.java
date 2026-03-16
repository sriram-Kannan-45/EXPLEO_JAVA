package splitIterator;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpiltIter1 {
	
	public static void main(String args[]) {
		//Create an Arraylist
		ArrayList <Double> doubleValues= new ArrayList<Double>();
		doubleValues.add(1.0);
		doubleValues.add(2.0);
		doubleValues.add(3.0);
		doubleValues.add(4.0);
		doubleValues.add(5.0);
		doubleValues.add(6.0);

		System.out.println("contents");
		
		Spliterator <Double> sit = doubleValues.spliterator();
		
		while(sit.tryAdvance((n)->System.out.print(n+" ")));
		System.out.println();
		
		System.out.println("remain");
		
		sit = doubleValues.spliterator();
		
		sit.forEachRemaining((n)-> System.out.println(n+" "));
		
		System.out.println();
		
		System.out.println(doubleValues.size());

}
}

