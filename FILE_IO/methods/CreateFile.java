package methods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		Path path = Paths.get("D:\\drive\\out\\production\\section_1\\MainTxt.txt");
		
		Path p = Files.createFile(path);
		
		System.out.println("File Created " + p);

	}

}
