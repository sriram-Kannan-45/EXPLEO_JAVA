package comparetor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Mobile implements Comparable<Mobile> {
	private String name;

	private int ram;

	private int price;

	public Mobile(String name, int ram, int price) {
		super();
		this.name = name;
		this.ram = ram;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getRam() {
		return ram;
	}

	public int getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(Mobile o) {
		// TODO Auto-generated method stub
		if (this.ram < o.getRam()) {
			return 1;
		}

		return -1;
	}

}

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		List <Mobile> list = new  ArrayList<>();
		
		list.add(new Mobile ("Readmi",1,8000));
		
		list.add(new Mobile ("Apple",1,8000));
		
		list.add(new Mobile ("Samsung",222,8000));
		
		Collections.sort(list);
		
		System.out.println("After sorting : ");
		
		for (Mobile mb : list )
		{
			System.out.println(mb.getName() + "\t" + mb.getRam() + "\t" + mb.getPrice());
		}
	}

}
