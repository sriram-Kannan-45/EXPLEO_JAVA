package java_core;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIo {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		Path p1 = Paths.get("C:\\Users\\user\\Downloads\\1_Problem Statements\\1_Problem Statements");
		
		Path p2 = p1.subpath(0, 4);
		
		System.out.println(p2);

	}

}
