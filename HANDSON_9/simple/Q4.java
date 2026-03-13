package simple;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q4 {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		Path p = Paths.get("D:\\drive\\out\\production\\section_1\\MainTxt.txt");
		
		System.out.println(Files.getLastModifiedTime(p));

	}

}
