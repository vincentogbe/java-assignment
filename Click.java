package week1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class Click extends JFrame implements ActionListener
{

	JButton button1;
	JButton button2;
	
	JTextField textfields;
	
	public JButton getButton1()
	{
		return button1;
	}

	public void setButton1(JButton button1)
	{
		this.button1 = button1;
	}

	public JTextField getTextfields()
	{
		return textfields;
	}

	public void setTextfields(JTextField textfields) 
	{
		this.textfields = textfields;
	}


	Click(String title) 
	{
		super(title);
		setSize(200,200);
		setLayout(new FlowLayout());
		   
		button1 = new JButton("search");
		textfields = new JTextField("search file              ");
		  
		button1.addActionListener(this);
		  
		 add(textfields);
		 add(button1);
		  
		   setVisible(true);	
		
		
	}
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource().equals(button1))
		{
			textfields.getText();
			//String cardsn = textfields.getText();
			//System.exit(0);
		}
	
	}


}
