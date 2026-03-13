package methods;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputSteram
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		String str = "";
		try
		{
			FileInputStream input = new FileInputStream("D:\\drive\\out\\production\\section_1\\MainTxt.txt");
			
			System.out.println("Data in the file ");
			
			int i = input.read();

			while (i != -1)
			{
				str += (char)(i);
				
				i = input.read();
			}
			
			input.close();
		}
		
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		String[] arr = str.split(" ");
		
		int max = 0 ;
		
		String res = "";
		
		for (int i = 0 ; i<arr.length ; i++ )
		{
			if (arr[i].length() > max )
			{
				res = arr[i];
				
				max = arr[i].length();
			}
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("MAX STRING IS : "+ res);
		
	}

}
