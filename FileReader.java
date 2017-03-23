package week1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileReader {
	

	String fileName;
	File fileExample;
	Scanner myScanner;
    PrintWriter pwInput;
	
	// Constructor
	FileReader(String fileName)
	{
		
		this.fileName = fileName;
		
	}
	
	// get a connection to the file
	void connectToFile()
	{
		fileExample = new File(fileName);
	}

	// Read the file, returning a string of lines
    void readFile()
    {
    
    	//String[] values = new String[6];
	    try
		{
	    	//int i = 0;
	    	myScanner = new Scanner(fileExample); 
			 while (myScanner.hasNextLine())
			    {
			      
				 String line = myScanner.nextLine();
				 System.out.println(line);
			      //i++;
			    }
		}
		catch (FileNotFoundException e)
		{
			System.out.println("run time error " + e.getMessage());
		}
	    finally
	    {
	        //return values;
	    }
    }
    
	// get hold of a Print writer object
    void getFileWriter()
    {
    	try
    	{
    		pwInput = new PrintWriter(fileExample);
    	}
  		catch (FileNotFoundException e)
  		{
  			System.out.println("run time error " + e.getMessage());
  		}
    	
    }	

	// wtite a string to the file
    void writeLineToFile(String line)
    {
       System.out.println(line);
  		pwInput.println(line);    	
    }	

    
    
    void closeReadFile()
    {
		 myScanner.close();
    }

    void closeWriteFile()
    {
		 pwInput.close();
    }


}
