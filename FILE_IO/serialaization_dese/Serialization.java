package serialaization_dese;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws ClassNotFoundException 
	{
		// TODO Auto-generated method stub
		
		Employee object = new Employee (1,"ram");
		
		String filename = "file.ser";
		
		try 
		{
			FileOutputStream file = new FileOutputStream(filename);
			
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(object);
			
			out.close();
			
			file.close();
			
			System.out.println("Object has been serialized ");
			
		}
		
		catch (IOException e)
		{
			System.out.println("IO exception ");
		}
		
		Employee obj = null ;
        
        try
        {
        	FileInputStream file = new FileInputStream(filename);
        	
        	ObjectInputStream in = new ObjectInputStream(file);
        	
        	obj = (Employee)in.readObject();
        	
        	in.close();
        	
        	System.out.println("Object has been deserialized ");
        	
        	System.out.println("EMP ID : "+obj.empId + "\nEMP NAME : "+obj.empName);
        }
        
        catch(IOException e)
        {
        	System.out.println("io");
        }
        
        catch(ClassNotFoundException ex)
        {
        	System.out.println("class");
        }
	}

}
