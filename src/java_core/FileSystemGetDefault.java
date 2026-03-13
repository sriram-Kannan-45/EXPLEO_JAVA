package java_core;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystemGetDefault {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		FileSystem fs = FileSystems.getDefault();
		
		Path p1 = fs.getPath("C:\\Users\\user\\Downloads\\1_Problem Statements\\1_Problem Statements");
		
		System.out.println(p1);

	}

}
