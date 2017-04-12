package week1;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class help

{
	
	public void reader() throws Exception
	{
		FileReader file = new FileReader("C:/Users/ogbe/Desktop/2 year/programing/labs/assighment/src/week1/help.txt");
		BufferedReader reader = new BufferedReader(file);
		
		String text = "";
		String line =reader.readLine();
		while(line!= null)
		{
			text +=line ;
			line = reader.readLine();
		}
		System.out.println(text);
	}

}
