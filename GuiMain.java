package week1;
import java.util.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
//import javax.swing.JOptionPane;



public class GuiMain extends JFrame implements ActionListener
{
	
	
	JButton button;
	JMenu file;
	JMenuBar jmb;
	JMenuItem help;
	JMenuItem open;
	JMenuItem exit;
	
	public JButton getButton() {
		return button;
	}

	
	GuiMain(String title)
	{
		
		super(title);
		setSize(300,300);
		setLayout(new FlowLayout());
		
		

		 JMenuBar jmb =new JMenuBar();
		 setJMenuBar(jmb);
		
		 
		 JMenu file = new JMenu("file");
		 jmb.add(file);
		 
		 help =new JMenuItem("help");
		 file.add(help);
		 help.addActionListener(this);
		 
		 open =new JMenuItem("open");
		 file.add(open);
		open.addActionListener(this);
		 
		exit = new JMenuItem("exit");
		file.add(exit);
		exit.addActionListener(this);
	
	
		button = new JButton("edit dictionary ");
		button.addActionListener(this);
		 
	
		add(button);
		
		
		 
		 setVisible(true);
		
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
	
		
		if(e.getSource().equals(button))
		{
			EDIT word = new EDIT("edit ");

		}
		else if (e.getSource().equals(help))
		{
			   
			   //help fm = new help();
			FileManager fm = new FileManager("help.txt");
			fm.connectToFile();
			fm.readFile();
			fm.closeReadFile();
		}
		else if (e.getSource().equals(open))
		{
			Click enter_word = new Click("search");
		}
		else if (e.getSource().equals(exit))
		{
			System.exit(0);
		}
		
	}


	
	
	
	

}
