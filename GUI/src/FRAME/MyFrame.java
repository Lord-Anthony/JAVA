package FRAME;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

	MyFrame(){
	
	this.setTitle("Pet Shop");  // sets title of this
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
	this.setResizable(false); // unable to resize
	this.setSize(1000,700);		//  x-dimension and y-dimension	
	this.setVisible(true); // make this visible
	this.setLocationRelativeTo(null);
	
	ImageIcon image = new ImageIcon("logo.jpg"); // create an image icon
	this.setIconImage(image.getImage());  // change icon in this	this.getContentPane().setBackground(Color.BLUE); // change color of background
	this.getContentPane().setBackground(new Color(0xDFDABC)); // hexadecimal color
		
	}
}
