package week1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	JTextField textfields;

	public JButton getAddword() {
		return addword;
	}

	public void setAddword(JButton addword) {
		this.addword = addword;
	}

	public JButton getDelword() {
		return delword;
	}

	public void setDelword(JButton delword) {
		this.delword = delword;
	}

	public JButton getViewword() {
		return viewword;
	}

	public void setViewword(JButton viewword) {
		this.viewword = viewword;
	}
	
	public JTextField getTextfields() {
		return textfields;
	}

	public void setTextfields(JTextField textfields) {
		this.textfields = textfields;
	}

	EDIT(String title)
	
	{
		super(title);
		setSize(200,200);
		setLayout(new FlowLayout());
		
		JMenuBar jmb = new JMenuBar();
		setJMenuBar(jmb);
		
		JMenu file = new JMenu();
		jmb.add(file);
		
		JMenuItem open =new JMenuItem();
		file.add(open);
		
		JMenuItem exit = new JMenuItem();
		file.add(exit);
		
		addword = new JButton("add");
		addword.addActionListener(this);
		delword = new JButton("delet");
		delword.addActionListener(this);
		viewword = new JButton("view words");
		viewword.addActionListener(this);
		textfields = new JTextField("add word   ");
		add(addword);
		add(delword);
		add(viewword);
		
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		
		if (e.getSource().equals(addword))
		{
			
			setVisible(true);
			
			textfields.getText();
			//String cardsn = textfields.getText();
			//System.exit(0);
		}
	}

}
