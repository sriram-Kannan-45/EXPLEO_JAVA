package simple;

import java.io.File;

public class Q3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		File f = new File("D:\\drive\\out\\production\\section_1\\MainTxt.txt");
		
		if (f.exists())
		{
			System.out.println("FILE EXISTS");
		}
		
		else
		{
			System.out.println("FILE NOT EXISTS");
		}
	}

}
