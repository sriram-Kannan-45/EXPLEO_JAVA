package methods;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMethods {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		Path p1 = Paths.get("C:\\\\Users\\\\user\\\\Downloads\\\\1_Problem Statements\\\\1_Problem Statements");
		
		Path normalizedPath = p1.normalize();
		
		Path p2 = Paths.get("C:\\\\Users\\\\user\\\\Downloads\\\\1_Problem Statements\\\\1_Problem Statements");
		
		System.out.println("NORMALIZED PATH : "+normalizedPath);
		
//		System.out.println("GET PATH : "+p2);
		
		Path subPath = p1.subpath(1, 3);
		
		System.out.println("SUB PATH : "+subPath);
		
		System.out.println("GET FILE NAME : "+p1.getFileName());
		
		System.out.println("GET PARENT : "+p1.getParent());
		
		System.out.println("GET NAME COUNT : "+p1.getNameCount());
		
		System.out.println("GET ROOT : "+p1.getRoot());
		
		System.out.println("IS ABSOLUTE PATH : "+p1.isAbsolute());
		
		System.out.println("TO ABSOLUTE PATH : "+p1.toAbsolutePath());
		
		System.out.println("TO URI : "+p1.toUri());
		
		if (p1.equals(p2))
		{
			System.out.println("BOTH ARE EQUAL ");
		}
		
		else
		{
			System.out.println("BOTH ARE NOT EQUAL");
		}

	}

}
