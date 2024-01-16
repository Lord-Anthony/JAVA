package TrialandError;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Main implements ActionListener {

	JFrame frame;
	JLabel label,label2,label3,label4,label5,label6;
	JPanel panel, panel2,panel3,panel4;
	JButton button;
	JTextField text,text1;
	ImageIcon image;
	

	

	Main(){  //login Window
	//-------------------------------------------------------------------------------------------------------
		frame = new JFrame();
		frame.setTitle("Pet Shop");					
		frame.getContentPane().setBackground(new Color(0xECBB52));
		frame.setSize(1000,750);
		frame.setResizable(false);
		frame.setLayout(null);	
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//-------------------------------------------------------------------------------------------------------
		panel1();
		panel2();
		panel3();	
		//-------------------------------------------------------------------------------------------------------
		frame.add(button);
		frame.add(label4);
		frame.add(label5);		
		frame.add(text);
		frame.add(text1);
		frame.add(panel2);
		frame.add(panel);
		frame.add(panel4);
		frame.add(panel3);
		
		
		frame.setVisible(true);	
}
	
	public void	panel1() {
		
		panel = new JPanel();
		panel.setBounds(250,100,80,80);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		panel.setBackground(new Color(0xECBB52));
		image = new ImageIcon("dog-removebg-preview.png");
		label = new JLabel();
		label.setIcon(image);		
		panel.add(label);
		//-------------------------------------------------------------------------------------------------------
		panel2 = new JPanel();
		panel2.setBounds(500,100,400,200);
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		panel2.setBackground(new Color(0xECBB52));
		
		label2 = new JLabel();
		label3 = new JLabel();
		
		label2.setText(" PeT ShoP ");
		label2.setHorizontalAlignment(JLabel.CENTER);
		label2.setFont(new Font("MV Boli",Font.BOLD,60));
		label2.setForeground(Color.white);
		
		label3.setText(" POS SYSTEM ");
		label3.setHorizontalAlignment(JLabel.CENTER);
		label3.setVerticalAlignment(JLabel.BOTTOM);
		label3.setFont(new Font("MV Boli",Font.BOLD,30));
		label3.setForeground(Color.white);
				
		panel2.add(label2);
		panel2.add(label3);		
	}
	
	
	public void panel2() {
		//-------------------------------------------------------------------------------------------------------		
		text = new JTextField();	
		text.setBounds(525,400, 400, 25);
		text.setLayout(new FlowLayout(FlowLayout.CENTER));		
		text.setFont(new Font("MV Boli",Font.PLAIN,20));
		text.setForeground(Color.black);
		text.setBackground(Color.lightGray);
		text.setCaretColor(Color.WHITE);
		text.setText("Input username");
		text.setCaretColor(new Color(0xECBB52));
		text.addActionListener(this);
		//--------------------------------------------------------------------------------------------------------
		text1 = new JTextField();	
		text1.setBounds(525,500, 400, 25);
		text1.setLayout(new FlowLayout(FlowLayout.CENTER));		
		text1.setFont(new Font("MV Boli",Font.PLAIN,20));
		text1.setForeground(Color.black);
		text1.setBackground(Color.lightGray);
		text1.setCaretColor(Color.WHITE);
		text1.setText("Input password");
		text1.setCaretColor(new Color(0xECBB52));
		text1.addActionListener(this);
		//--------------------------------------------------------------------------------------------------------
		label4 = new JLabel();
		label4.setText("Email/Username:");
		label4.setBounds(525,370,400,25);
		label4.setFont(new Font("MV Boli",Font.PLAIN,15));
		//--------------------------------------------------------------------------------------------------------
		label5 = new JLabel();
		label5.setText("Password:");
		label5.setBounds(525,470,400,25);
		label5.setFont(new Font("MV Boli",Font.PLAIN,15));
		//--------------------------------------------------------------------------------------------------------
		panel3 = new JPanel();
		panel3.setBounds(50,300,950,5);
		panel3.setBackground(Color.LIGHT_GRAY);
		panel3.setBorder(BorderFactory.createEtchedBorder());
		
		label6 = new JLabel();
		label6.setText(" Login ");		
		label6.setFont(new Font("MV Boli",Font.PLAIN,20));
		label6.setBounds(200, 200, 200, 200);
		
		panel4 = new JPanel();
		panel4.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		panel4.setBounds(200,285,100,100);
		panel4.setBackground(new Color(0xECBB52));
		panel4.add(label6);				
}
		public void panel3(){
			
			button = new JButton(" Login ");
			button.setBounds(670,600,100,25);
			button.addActionListener(this);
		}	
		
			
		public static void main(String[] args) {		
		Main main = new Main();
		
	}

		@Override
		public void actionPerformed(ActionEvent e) {
					}
					
				}
				
		

