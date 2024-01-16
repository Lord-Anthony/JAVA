package FINAL;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;

public class Pet implements ActionListener{
	
	


	
JFrame f = new JFrame();

JButton close = new JButton(" Close ");	

JPanel items = new JPanel();

JButton l1 = new JButton("Labrador Retrievers");
JButton l2 = new JButton("German Shepherd Dogs");
JButton l3 = new JButton("Golden Retrievers");
JButton l4 = new JButton("French Bulldogs");
JButton l5 = new JButton("Poodles");
JButton l6 = new JButton("Dachshunds");


JButton buy = new JButton("buy");
	
	Pet(){
		
		//--------------------------------------------------------------------------------------------------------
		
		//--------------------------------------------------------------------------------------------------------
		
		//--------------------------------------------------------------------------------------------------------
		
		//--------------------------------------------------------------------------------------------------------
		
		//--------------------------------------------------------------------------------------------------------
		
		items.setSize(300,300);
		items.setLayout(new GridLayout(3,3,20,20));		
		items.setBounds(30,50,500,500);
		
		
		items.add(l1);
		items.add(l2);
		items.add(l3);
		items.add(l4);
		items.add(l5);
		items.add(l6);
		
		
		//--------------------------------------------------------------------------------------------------------
		close.setBounds(900,570,80,20);
		close.setFont(new Font("Mv Boli",Font.PLAIN,13));
		close.addActionListener(this);
		close.setForeground(new Color(0xD0961C));
		close.setBackground(new Color(0x977837));
		close.setFocusable(false);
		
		buy.setBounds(800,570,80,20);
		buy.setFont(new Font("Mv Boli",Font.PLAIN,13));
		buy.addActionListener(this);
		buy.setForeground(new Color(0xD0961C));
		buy.setBackground(new Color(0x977837));
		buy.setFocusable(false);
		//--------------------------------------------------------------------------------------------------------
		
		f.add(buy);		
		f.add(items);
		f.add(close);
		
		//--------------------------------------------------------------------------------------------------------
				
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		f.setSize(1000, 600);
		f.setResizable(false);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setUndecorated(true);
		f.getContentPane().setBackground(new Color(0xCCA758));
		f.setVisible(true);
}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		ArrayList <String> name = new ArrayList <String> ();
		
		if (e.getSource() == close) {
			f.dispose();
			
		}
		if (e.getSource() == l1) {
			name.add("Labrador");
		}
		if (e.getSource() == buy) {
			System.out.println(name);
		}
		

		
		}

	//----------------------------------------------------------------------------------------------
}