package JLABEL;

import javax.swing.JLabel;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		// JLabel = GUI display area of string, number, or both
		
		
		
		ImageIcon image = new ImageIcon("paws.png");
		Border border = BorderFactory.createLineBorder(Color.GREEN,3);
	
		
		JLabel label = new JLabel(); // create a label
		label.setText("Welcome to Pet Shop"); // set text of label
		label.setIcon(image);		// set an image inside label
		label.setHorizontalTextPosition(JLabel.CENTER); // set text position
		label.setVerticalTextPosition(JLabel.TOP);	// set text position
		label.setForeground(new Color(0x011111)); // set text color
		label.setFont(new Font("MV Boli",Font.BOLD,20)); // set font of text
		label.setIconTextGap(10); // set gap of text and image
		label.setBackground(new Color(0xDFDABC)); // set background color
		label.setOpaque(true); // display background color
		label.setBorder(border);	// set a border
		label.setVerticalAlignment(JLabel.CENTER);		//set position of icon and text
		label.setHorizontalAlignment(JLabel.CENTER);
		//label.setBounds(100,100,250,250); // set x , y ,width ,height
		
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(500,500);	
		frame.setVisible(true);	
		//frame.setLayout(null);
		//
		frame.add(label);								
		frame.pack();
		
	}
}
