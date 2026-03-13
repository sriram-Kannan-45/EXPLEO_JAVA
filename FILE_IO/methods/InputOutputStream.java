package methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputStream {

	public static void main(String[] args) throws IOException 
	
	{
		// TODO Auto-generated method stub
		
		byte[] b = new byte[128];
		
		try {
			FileInputStream fs = new FileInputStream("txt.txt") ;
			FileOutputStream fos = new FileOutputStream ("newOp.txt");
			
			System.out.println("Byte avaliable "+fs.available());
			
			int count = 0 , read = 0;
			
			while ((read = fs.read(b))!=-1)
			{
				fos.write(b);
				
				count += read;
			}
			
			System.out.println("Total count : "+ count);
		}
		
		catch (FileNotFoundException f )
		{
			System.out.println(f);
		}
		
		catch (IOException e )
		{
			System.out.println(e);
		}

	}

}
