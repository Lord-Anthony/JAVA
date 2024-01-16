package NEW_WINDOW;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {

	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	
	
	NewWindow(){
		
		label.setBounds(0,0,100,50);
		label.setFont(new Font(null,Font.BOLD,10));
		label.setText("TANGINAMO");
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(420,420));
		frame.setLayout(null);
		frame.add(label);
		
				
		frame.setVisible(true);
	}
		
		
	}


