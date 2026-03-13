package methods;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;

import serialaization_dese.Employee;

public class BufferedStream {

    public static void main(String[] args) {

        try {
            BufferedReader bufinput = new BufferedReader(new FileReader(args[0]));
            BufferedWriter bufoutput = new BufferedWriter(new FileWriter(args[1]));

            String line = "";

            while ((line = bufinput.readLine()) != null) {
                bufoutput.write(line);
                bufoutput.newLine();
            }

            bufinput.close();
            bufoutput.close();
        }

        catch (FileNotFoundException f)
        {
            System.out.println("FileNotFoundException: " + f);
        }

        catch (IOException e) 
        {
            System.out.println("IOException: " + e);
        }
        
        
    }
}