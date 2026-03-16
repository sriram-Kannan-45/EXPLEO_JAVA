package treemap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		TreeMap <String , Double > tm = new TreeMap <String , Double > ();
		
		System.out.println("Size of the HashMap is "+tm.size());
		
		tm.put("john",121212.3);
		
		tm.put("tom Smith", 145.32);
		
		tm.put("jane", 2323.3);
		
		tm.put("ralph", 323.2);
		
		System.out.println(tm+"\nsize "+tm.size());
		
		Set<Map.Entry <String , Double>> set = tm.entrySet();
		
		for (Map.Entry <String , Double > me :set)
		{
			System.out.println(me.getKey()+" "+me.getValue());
		}
	}

}
