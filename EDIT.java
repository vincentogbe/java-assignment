package week1;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class EDIT extends JFrame implements ActionListener
{
	
	JButton addword;
	JButton delword;
	JButton viewword;
	JButton cheack;
	JTextField textfield1;
	JTextField textfield2;
	JTextField textfield3;
	JTextField textfield4;
	
	public JButton getCheack() {
		return cheack;
	}

	public void setCheack(JButton cheack) {
		this.cheack = cheack;
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
		
		
		cheack = new JButton("cheack word");
		cheack.addActionListener(this);
		textfield4 = new JTextField("");
		
		the_box.add(textfield4);
		the_box.add(cheack);
		the_box.add(textfield1);
		the_box.add(addword);
		the_box.add(textfield2);
		the_box.add(delword);
		
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		
		if (e.getSource().equals(addword))
		{
			
			setVisible(true);
			
			textfield1.getText();
			//bad words put in loop
			//slang words put in loop 
		}

		else if (e.getSource().equals(delword))
		{
			
			setVisible(true);
			
			textfield1.getText();
			//loop th
		}

	}

}
