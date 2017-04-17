package week1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
	
	JButton addword;
	JButton delword;
	JButton viewword;
	JButton check;
	JTextField textfield1;
	JTextField textfield2;
	JTextField textfield3;
	JTextField textfield4;


	
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

	public JTextField getTextfield4() {
		return textfield4;
	}

	public void setTextfield4(JTextField textfield4) {
		this.textfield4 = textfield4;
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

	public JButton getViewword() 
	{
		return viewword;
	}

	public void setViewword(JButton viewword) 
	{
		this.viewword = viewword;
	}
	
	
	EDIT(String title)
	
	{
		super(title);
		setSize(200,200);
		setLayout(new FlowLayout());
		Box the_box = Box.createVerticalBox();
		this.add(the_box);
	
		
		addword = new JButton("Add word");
		addword.addActionListener(this);
		textfield1= new JTextField("");
		
		delword = new JButton("delet word");	
		delword.addActionListener(this);
		textfield2 =new JTextField("");
		
		
		check = new JButton("cheack word");
		check.addActionListener(this);
		textfield4 = new JTextField("");
		
		the_box.add(textfield4);
		the_box.add(check);
		the_box.add(textfield1);
		the_box.add(addword);
		the_box.add(textfield2);
		the_box.add(delword);
	
		
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		textfield4.getText();
		textfield1.getText();
		textfield2.getText();
		if(e.getSource().equals(check))
		{
			
			
			try {
					Scanner txtscan = new Scanner(new File("slang_words.txt"));
					ArrayList<String> slanglist=new ArrayList<String>();
				 
					while(txtscan.hasNextLine())
					{
						slanglist.add(txtscan.nextLine()); 

					}
					if(slanglist.contains(textfield4.getText()))
					{
						JOptionPane.showMessageDialog(null,"this is a slang word in this file ");
					}
					else
					{
						 JOptionPane.showMessageDialog(null,"this is not a slang word in this file ");
					}
				}
			catch (FileNotFoundException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	
		}
		else if (e.getSource().equals(addword))
		{
			try {
				Scanner addscan = new Scanner(new File("slang_words.txt"));
				ArrayList<String> addlist = new ArrayList<String>();
				
				while(addscan.hasNextLine())
				{
					addlist.add(addscan.nextLine()); 
					
				}
				if(addlist.contains(textfield1.getText()))
				{
					JOptionPane.showMessageDialog(null,"this word is already in the file ");
				}
				else 
				{
					try
					{
					    String filename= "slang_words.txt";
					    FileWriter fw = new FileWriter(filename,true); //the true will append the new data
					    fw.write(System.getProperty("line.separator"));
					    fw.write(textfield1.getText());//appends the string to the file
					    fw.close();
					    
					    JOptionPane.showMessageDialog(null,"word has been added");
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

		else if (e.getSource().equals(delword))
		{
			try {
				Scanner delscan = new Scanner(new File("slang_words.txt"));
				ArrayList<String> dellist = new ArrayList<String>();
				
				while(delscan.hasNextLine())
				{
					dellist.add(delscan.nextLine()); 
					
				}
				if(dellist.contains(textfield2.getText()))
				{
					JOptionPane.showMessageDialog(null,"worded is deleted");
				}
				else 
				{
					try
					{
					    String filename= "slang_words.txt";
					    FileWriter fw = new FileWriter(filename,true); //the true will append the new data
					    fw.write(textfield1.getText());//appends the string to the file
					    fw.close();
					    
					    JOptionPane.showMessageDialog(null,"word has been added");
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
		
			 
			 JOptionPane.showMessageDialog(null,"file deleted");
			  
		}

	}

}
