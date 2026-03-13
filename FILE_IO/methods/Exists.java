package methods;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exists 
{
	public static void main (String ards[])
	{
		Path p = Paths.get("D:\\drive\\ou\\production\\section_1\\Main.class");
		
		Boolean result = Files.exists(p);
		
		System.out.println("Path "+ p + "  "+result);
		
		
	}
	
}
