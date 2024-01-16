package JFILECHOOSERCLASS;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class Main extends JFrame implements ActionListener {
	
	
	JButton button;
	
	Main(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		//-------------------------------------------------------------------------
		
		button = new JButton("Select File");
		button.addActionListener(this);
		
		//-------------------------------------------------------------------------
		this.add(button);
		this.pack();
		this.setVisible(true);
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		new Main();
				
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()== button) {
			
			JFileChooser filechooser = new JFileChooser();  
			
			filechooser.setCurrentDirectory(new File(".")); // open first place
			
//			System.out.println(filechooser.showOpenDialog(null)); // select file to open
			int response = filechooser.showOpenDialog(null);  // open file
			filechooser.showSaveDialog(null); // select file to save
			
			
			
			
//	show file location		
			if(response == JFileChooser.APPROVE_OPTION);
					File file = new File(filechooser.getSelectedFile().getAbsolutePath());
			System.out.println(file);
			
		}
		
	}
}