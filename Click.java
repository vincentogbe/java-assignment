package week1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.text.JTextComponent;

public class Click  implements ActionListener
{
	
	
	
	public Click(String title)
	{
		

		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("search file");
		frame.setLayout(new FlowLayout());
		JButton button = new JButton("Select File");
		button.addActionListener(new ActionListener() 
		{
	
			private JTextComponent JTextArea1;

			public void actionPerformed(ActionEvent e)
			{
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.showOpenDialog(null);
				File f = fileChooser.getSelectedFile();
				String filename = f.getAbsolutePath();
				
				try
				{
					FileReader reader = new FileReader(filename);
					BufferedReader br  = new BufferedReader(reader);
					JTextArea1.read(br,null);
					br.close();
					JTextArea1.requestFocus();
				}
				catch (Exception a)
				{
					JOptionPane.showMessageDialog(null, a);
					
				}
			}
		});
		
		frame.setSize(500,300);
		frame.add(button);
		frame.pack();
		frame.add(JTextArea1);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}