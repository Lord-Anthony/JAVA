package JLAYEREDPANE;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Main {

	public static void main(String[] args) {
		
		//JLayeredPane = Swing container that provides a third
		//				 dimension for positioning components
		//				 ex. Depth, Z-index'
		
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.gray);
		label1.setBounds(50,50,200,200);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.lightGray);
		label2.setBounds(100,100,200,200);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.gray);
		label3.setBounds(150,150,200,200);
		
		JLayeredPane pane = new JLayeredPane();
		pane.setBounds(0,0,500,500);
		pane.add(label1, Integer.valueOf(0));
		pane.add(label2, Integer.valueOf(1));	// stack
		pane.add(label3, Integer.valueOf(0));
		
		
		JFrame frame = new JFrame();
		
		frame.add(pane);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500,500));
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		
		
		
		
		
		
	}

}
