package hard;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q1
{
	public static void main (String srgs[])
	{
		Path p = Paths.get("D:\\\\drive\\\\out\\\\production\\\\section_1\\\\MainTxt.txt");
		Path slp=Paths.get("D:\\drive\\section_1\\src\\p_1.java");
		boolean resut=Files.exists(p);
		
		System.out.print("Path: "+p+" File Exists: "+res);
		
		if(resut)
		{
			try
			{
				Files.createSymbolicLink(slp,p);
				
			}
			catch(IOException x)
			{
				System.out.println(x);
			}
			System.out.println();
			boolean readable=Files.isReadable(p);
			System.out.println("Readable: "+readable);
			
			boolean writable=Files.isWritable(p);
			System.out.println("Writable: "+writable);
			
		}
	}
}
