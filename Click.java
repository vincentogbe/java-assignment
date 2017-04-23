package week1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.JTextComponent;

public class Click extends JFrame
{
	
	
	
	public Click(String title)
	{
				
				super(title);
				setSize(200,200);
				setLayout(new FlowLayout());
				Box the_box = Box.createVerticalBox();
				this.add(the_box);
				
				JTextArea textArea = new JTextArea(5, 20);
				JScrollPane scrollPane = new JScrollPane(textArea); 
				textArea.setEditable(false);
				
				the_box.add(textArea);
				
				setVisible(true);
		
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.showOpenDialog(null);
				File f = fileChooser.getSelectedFile();
				File filename = f.getAbsoluteFile();
				
				try
				{
					FileReader reader = new FileReader(filename);
					BufferedReader br  = new BufferedReader(reader);
					textArea.read(br,null);
					br.close();
					textArea.requestFocus();
				}
				catch (Exception a)
				{
					JOptionPane.showMessageDialog(null, a);
					
				}
	}

}