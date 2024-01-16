package TEXTFIELD;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{

	JButton button; 
	JTextField field;
	
	MyFrame(){	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		
		button = new JButton("Submit");		
		button.addActionListener(this);
		
		field = new JTextField();
		field.setPreferredSize(new Dimension(250,30));
		field.setFont(new Font("Ariel",Font.BOLD,25));
		field.setForeground(Color.black);
		field.setBackground(Color.lightGray);
		field.setCaretColor(Color.WHITE);
		field.setText("username");
		//field.setEditable(false);
		
		this.add(button);
		this.add(field);
		this.pack();
		this.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button) {
			System.out.println("Pakyu ka Paul" + field.getText());
			button.setEnabled(false);
			field.setEditable(false);
		}
		
	}
	
	
}
