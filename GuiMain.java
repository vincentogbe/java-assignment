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
		
		

		 JMenuBar jmb =new JMenuBar();
		 setJMenuBar(jmb);
		
		 
		 JMenu file = new JMenu("file");
		 jmb.add(file);
		 
		 JMenu help =new JMenu("help");
		 jmb.add(help);
		 
		 help.addActionListener(this);
		 
		 JMenuItem open =new JMenuItem();
		 file.add("open");
		JMenuItem exit = new JMenuItem();
		file.add("exit");
		open.addActionListener(this);
		
		button2 = new JButton("click to enter word");
		button2.addActionListener(this);
		button3 = new JButton("edit dictionary ");
		button3.addActionListener(this);
		 
	
		add(button2);
		add(button3);
		
		 
		 setVisible(true);
		
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(button2))
		{
			Click enter_word =new Click("search");
		
		}
		else if (e.getSource().equals(button3))
		{
			EDIT word = new EDIT("edit ");
		}
		
		
	}


	
	
	
	

}
