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
import javax.swing.JOptionPane;

public class GuiMain extends JFrame implements ActionListener
{
	
	
	JButton button;
	JMenu file;
	JMenuBar jmb;
	JMenu help;
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
		 
		 JMenu help =new JMenu("help");
		 jmb.add(help);
		 
		 help.addActionListener(this);
		 
		 JMenuItem open =new JMenuItem("open");
		 file.add(open);
		JMenuItem exit = new JMenuItem("exit");
		file.add(exit);
		open.addActionListener(this);
	
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
			JOptionPane.showMessageDialog(null,"its working");
			Click enter_word = new Click("search");
		
		}
		else if (e.getSource().equals(open))
		{
			JOptionPane.showMessageDialog(null,"its working");
			Click enter_word = new Click("search");
		}
		
	}


	
	
	
	

}
