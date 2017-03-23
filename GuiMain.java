package week1;
import java.util.*;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GuiMain extends JFrame
{
	
	
	JButton button1;
	JButton button2;
	JButton button3;
	
	GuiMain(String title)
	{
		
		super(title);
		setSize(300,300);
		setLayout(new FlowLayout());
		
		
		button2 = new JButton("click to enter word");
		button3 = new JButton("edit dictionary ");
		 
		 
		 add(button2);
		 add(button3);
		 
		 
		 setVisible(true);
		
		
	}


	
	
	
	

}
