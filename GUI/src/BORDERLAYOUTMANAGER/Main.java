package BORDERLAYOUTMANAGER;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		
		// Layout Manager = defines the natural layout for components within container
		
		// 3 common managers
		
		// Border Layout = places components in five areas: NORTH,SOUTH,WEST,EAST,CENTER.
		// All extra space is placed in the center area
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(new BorderLayout(10,10)); // MARGINS
		frame.setSize(500,500);

		//panels
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		//color
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.yellow);
		panel3.setBackground(Color.pink);
		panel4.setBackground(Color.green);
		panel5.setBackground(Color.blue);
		
		//size		
		panel1.setPreferredSize(new Dimension(50,50));
		panel2.setPreferredSize(new Dimension(50,50));
		panel3.setPreferredSize(new Dimension(50,50));
		panel4.setPreferredSize(new Dimension(50,50));
		panel5.setPreferredSize(new Dimension(50,50));
		
		// ----------------------------- SUB PANELS -------------------------
		
		//panels
				JPanel panel6 = new JPanel();
				JPanel panel7 = new JPanel();
				JPanel panel8 = new JPanel();
				JPanel panel9 = new JPanel();
				JPanel panel10 = new JPanel();
				
				//color
				panel6.setBackground(Color.BLACK);
				panel7.setBackground(Color.WHITE);
				panel8.setBackground(Color.GRAY);
				panel9.setBackground(Color.MAGENTA);
				panel10.setBackground(Color.cyan);
				
				panel5.setLayout(new BorderLayout());
				
				//size		
				panel6.setPreferredSize(new Dimension(25,25));
				panel7.setPreferredSize(new Dimension(25,25));
				panel8.setPreferredSize(new Dimension(25,25));
				panel9.setPreferredSize(new Dimension(25,25));
				panel10.setPreferredSize(new Dimension(25,25));
		
				//----------------SUB PANELS----------------
				
				panel5.add(panel6,BorderLayout.NORTH);
				panel5.add(panel7,BorderLayout.SOUTH);
				panel5.add(panel8,BorderLayout.WEST);
				panel5.add(panel9,BorderLayout.EAST);
				panel5.add(panel10,BorderLayout.CENTER);
				
				frame.add(panel1,BorderLayout.NORTH);
				frame.add(panel2,BorderLayout.SOUTH);
				frame.add(panel3,BorderLayout.WEST);
				frame.add(panel4,BorderLayout.EAST);
				frame.add(panel5,BorderLayout.CENTER);
		
	}

}
