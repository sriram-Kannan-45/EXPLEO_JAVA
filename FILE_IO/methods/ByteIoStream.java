package methods;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ByteIoStream {

    public static void main(String[] args) {

        char[] b = new char[128];

        try
        {
            FileReader fr = new FileReader("C:\\Users\\user\\git\\java\\EXPLEO\\input.txt");
            FileWriter fw = new FileWriter("C:\\Users\\user\\git\\java\\EXPLEO\\dem.txt");

            int count = 0, read = 0;

            while((read = fr.read(b)) != -1)
            {
                fw.write(b);
                count += read;
            }

            fr.close();
            fw.close();

            System.out.println("Total Count: " + count + " Characters");
        }

        catch(FileNotFoundException x)
        {
            System.out.println("File not found");
        }
        catch(IOException e)
        {
            System.out.println("IOException: " + e);
        }

    }

}