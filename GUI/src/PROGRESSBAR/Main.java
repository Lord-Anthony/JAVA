package PROGRESSBAR;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class Main extends JFrame{
	
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	JProgressBar bar;  /// JProgressBar

	Main(){
		frame = new JFrame();
		bar =  new JProgressBar();
		
		bar.setValue(0);  // set the first value
		bar.setBounds(0,0,420,50);  // x,y,width,height
		bar.setStringPainted(true);  // print the value
		bar.setFont(new Font("Mv Boli",Font.BOLD,25));
		bar.setForeground(Color.lightGray);  // color of moving bar
		bar.setBackground(Color.black); // color of bar
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(420,420);		
		
		//---------------------------------------------------------------
		frame.add(bar);
		frame.setVisible(true);					
		
		fill();
	}	
	
	public void fill() {
		int counter = 0;
		
		while (counter <= 100) {
			bar.setValue(counter);
			try {
			Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			counter +=1;
		}
		bar.setString("Done");
	}
	
						
	public static void main(String[] args) {
		new Main();

	}

}
