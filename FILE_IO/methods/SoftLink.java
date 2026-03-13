package methods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SoftLink {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Path existingFilePath = Paths.get("D:\\demo\\shopperApp");
		
		Path symLinkPath = Paths.get("D:\\drive\\out\\production\\section_1\\Main.class");
		
		try 
		{
			Files.createSymbolicLink(symLinkPath, existingFilePath);
			
		}
		catch (IOException x )
		{
			System.err.println(x);
		}
		catch (UnsupportedOperationException x)
		{
			System.err.println(x);
		}
	}

}
