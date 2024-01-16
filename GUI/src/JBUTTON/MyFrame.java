
package JBUTTON;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;



public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	JLabel label;
		
	MyFrame(){
		
		ImageIcon icon = new ImageIcon("paws.png");
		ImageIcon icon1 = new ImageIcon("logo.jpg");
		
		
		label = new JLabel();
		
		label.setIcon(icon1);
		label.setBounds(100,400, 300,300);
		label.setVisible(false);
		
		
		
		
		
		button = new JButton();
		button.setBounds(100,100,300,300);
		button.addActionListener(this);
		button.setText("Paul");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Ariel",Font.BOLD,25));
		button.setIconTextGap(25);
		button.setForeground(Color.BLACK);
		button.setBackground(Color.lightGray);
		button.setBorder(BorderFactory.createEtchedBorder());
		
				
		this.setVisible(true);		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.add(button);
		this.add(label);
		
				
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button)
			System.out.println("Tanginamo");
		button.setEnabled(false);
		label.setVisible(true);
		
		
	}


}

