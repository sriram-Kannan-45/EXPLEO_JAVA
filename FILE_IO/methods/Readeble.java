package methods;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Readeble {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Path p = Paths.get("D:\\drive\\out\\production\\section_1\\Main.class");
		
		boolean res = Files.isReadable(p);
		
		System.out.println("FILE "+p+"\nIs READABLE "+res);

	}

}
