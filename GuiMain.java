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

public class GuiMain extends JFrame implements ActionListener
{
	
	
	JButton button2;
	JButton button3;
	
	public JButton getButton2() {
		return button2;
	}

	public void setButton2(JButton button2) {
		this.button2 = button2;
	}

	public JButton getButton3() {
		return button3;
	}

	public void setButton3(JButton button3) {
		this.button3 = button3;
	}
	
	GuiMain(String title)
	{
		
		super(title);
		setSize(300,300);
		setLayout(new FlowLayout());
		
		setSize(500,500);
		 JMenuBar jmb =new JMenuBar();
		 setJMenuBar(jmb);
		
		 
		 JMenu file = new JMenu("file");
		 jmb.add(file);
		 
		 JMenu help =new JMenu("help");
		 jmb.add(help);
		 
		 JMenuItem open =new JMenuItem();
		 file.add("open");
		JMenuItem exit = new JMenuItem();
		file.add("exit");
		
		button2 = new JButton("click to enter word");
		button3 = new JButton("edit dictionary ");
		 
	
		add(button2);
		add(button3);
		 
		 
		 setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(button2))
		{
			Click enter_word =new Click("eddy");
			
		}
		else if (e.getSource().equals(button3))
		{
			EDIT word = new EDIT("JESS");
		}
		else if (e.getSource().equals(button2))
		{
			Open file1 =new Open("okoko");
		}
		else if (e.getSource().equals(button2))
		{
			HELP file2 =new HELP("PETER");
		}

	}


	
	
	
	

}
