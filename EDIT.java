package week1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.awt.FlowLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EDIT extends JFrame implements ActionListener 
{
	//creating variables
	private JButton addword;
	private JButton delword;
	private JButton check;
	private JTextField textfield1;
	private JTextField textfield2;
	private JTextField textfield3;

	//Encapsulate variables
	public JButton getCheack() {
		return check;
	}

	public void setCheack(JButton cheack) {
		this.check = cheack;
	}

	public JTextField getTextfield1() {
		return textfield1;
	}

	public void setTextfield1(JTextField textfield1) {
		this.textfield1 = textfield1;
	}

	public FileManager getFi() {
		return fi;
	}

	public void setFi(FileManager fi) {
		this.fi = fi;
	}

	FileManager fi;

	
	
	public JTextField getTextfield1s() 
	{
		return textfield1;
	}

	public void setTextfield1s(JTextField textfield1)
	{
		this.textfield1 = textfield1;
	}

	public JTextField getTextfield2()
	{
		return textfield2;
	}

	public void setTextfield2(JTextField textfield2)
	{
		this.textfield2 = textfield2;
	}

	public JTextField getTextfield3()
	{
		return textfield3;
	}

	public void setTextfield3(JTextField textfield3)
	{
		this.textfield3 = textfield3;
	}
	public JTextField getTextfield()
	{
		return textfield1;
	}

	public void setTextfields(JTextField textfields)
	{
		this.textfield1 = textfields;
	}


	public JButton getAddword()
	{
		return addword;
	}

	public void setAddword(JButton addword)
	{
		this.addword = addword;
	}

	public JButton getDelword() 
	{
		return delword;
	}

	public void setDelword(JButton delword)
	{
		this.delword = delword;
	}
	
	EDIT(String title)
	
	{
		
		//creating gui frame
		super(title);
		setSize(200,200);
		setLayout(new FlowLayout());
		Box the_box = Box.createVerticalBox();
		this.add(the_box);
		
		check = new JButton("cheack word");//Creating Jbutton 
		check.addActionListener(this);// Adding action listener
		textfield1 = new JTextField("");
	
		
		addword = new JButton("Add word");
		addword.addActionListener(this);
		textfield2= new JTextField("");
		
		delword = new JButton("delet word");	
		delword.addActionListener(this);
		textfield3 =new JTextField("");
		
		the_box.add(textfield1);//Adding buttons and textfields to gui 
		the_box.add(check);
		the_box.add(textfield2);
		the_box.add(addword);
		the_box.add(textfield3);
		the_box.add(delword);
	
		
		setVisible(true);//making visible
		
	}
	
	public void actionPerformed(ActionEvent e)//action listener
	{
		
		textfield1.getText();// getting text from user
		textfield2.getText();
		textfield3.getText();
		
		if(e.getSource().equals(check))//checking if word is in file
		{
			
			
			try {
					Scanner txtscan = new Scanner(new File("slang_words.txt"));//scanning in file
					ArrayList<String> slanglist=new ArrayList<String>();//creating an array of strings 
				 
					while(txtscan.hasNextLine())
					{
						slanglist.add(txtscan.nextLine()); //adding file words to strings 

					}
					if(slanglist.contains(textfield1.getText()))//checking if word is in file 
					{
						JOptionPane.showMessageDialog(null,"this is a slang word in this file ");//message to user
					}
					else
					{
						 JOptionPane.showMessageDialog(null,"this is not a slang word in this file ");// error message to user
					}
				}
			catch (FileNotFoundException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();//error message if file is not found 
			}
	
		}
		else if (e.getSource().equals(addword))// adding word to file 
		{
			try {
				Scanner addscan = new Scanner(new File("slang_words.txt"));
				ArrayList<String> addlist = new ArrayList<String>();
				
				while(addscan.hasNextLine())
				{
					addlist.add(addscan.nextLine()); 
					
				}
				if(addlist.contains(textfield2.getText()))//checking if word is already in the file
				{
					JOptionPane.showMessageDialog(null,"this word is already in the file ");//sending error message  
				}
				else 
				{
					try
					{
					    String filename= "slang_words.txt";
					    FileWriter fw = new FileWriter(filename,true); //the true will append the new data
					    fw.write(textfield2.getText());//appends the string to the file
					    fw.append(System.getProperty("line.separator"));//going on to a new line when after a word is entered 
					    fw.close();//close file
					    
					    JOptionPane.showMessageDialog(null,"word has been added");//message telling user that word as been added 
					}
					catch(IOException ioe)
					{
					    System.err.println("IOException: " + ioe.getMessage());
					}

				}
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		else if (e.getSource().equals(delword))//deleting worded 
		{
			try 
			{
				BufferedReader br = new BufferedReader(new FileReader("slang_words.txt"));//reading in an file 
			    ArrayList<String> lines=new ArrayList<>();//creating an array of strings
			    String currentLine = new String();//creating a variable of type string
			    while ((currentLine = br.readLine()) != null)//loop to go around file 
			    {
			        if (currentLine.contains(textfield3.getText()))//checking if word is in file 
			        {
			            lines.add(currentLine.replace(textfield3.getText(), ""));//Replacing users input with a blank space 
			            
			        }
			        else 
			        {
			            lines.add(currentLine);
			        }
			    }
			    JOptionPane.showMessageDialog(null,"word has been deleted");
			    
			    BufferedWriter bw = new BufferedWriter(new FileWriter("slang_words.txt"));
			    for (String i:lines)
			    {
			       bw.write(i);
			       bw.newLine();
			    }
			    bw.close();
			}
			catch(IOException ioe)
			{
			    System.err.println("IOException: " + ioe.getMessage());
			}	
		}
	}
}
