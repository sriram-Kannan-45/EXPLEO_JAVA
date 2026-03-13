package methods;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String data = "Welcome to java ";
		
		try 
		{
			FileOutputStream op = new FileOutputStream("txt.txt");
			
			byte[] array = data.getBytes();
			
			op.write(array);
			
			op.close();
		}
		
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

}
