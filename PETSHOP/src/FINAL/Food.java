package FINAL;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Food implements ActionListener{

	JFrame f = new JFrame();
	
	JButton close = new JButton(" Close ");	
	
	Food(){
		
		//--------------------------------------------------------------------------------------------------------
		
		//--------------------------------------------------------------------------------------------------------
		
		//--------------------------------------------------------------------------------------------------------
		
		//--------------------------------------------------------------------------------------------------------
		
		//--------------------------------------------------------------------------------------------------------
		
		//--------------------------------------------------------------------------------------------------------
		close.setBounds(900,570,80,20);
		close.setFont(new Font("Mv Boli",Font.PLAIN,13));
		close.addActionListener(this);
		close.setForeground(new Color(0xD0961C));
		close.setBackground(new Color(0x977837));
		close.setFocusable(false);
		//--------------------------------------------------------------------------------------------------------
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
		if (e.getSource() == close) {
			f.dispose();
		}
}
}