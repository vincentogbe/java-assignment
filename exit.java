package week1;

import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class exit  extends JFrame implements ActionListener  
{
	

	private JButton yes;
	private JButton no;
	private JLabel option;
	
	exit(String title)
	{
		
		super(title);
		setSize(200,200);
		setLayout(new FlowLayout());
		
		
		yes = new JButton("yes");//Creating Jbutton 
		yes.addActionListener(this);// Adding action listener
		
		no= new JButton("no");
		no.addActionListener(this);
		
		option = new JLabel("are you sure want to exit?");
		add(option);
		add(yes);
		add(no);
		setVisible(true);//making visible
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		
		if(e.getSource().equals(yes))//checking if word is in file
		{

			System.exit(0);
		}
		else if (e.getSource().equals(no))
		{
			setVisible(false);
		}
	}

}
