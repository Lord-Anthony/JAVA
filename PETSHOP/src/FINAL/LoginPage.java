package FINAL;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.Border;

public class LoginPage implements ActionListener{

//---------------------------------Frames-----------------------------------------
	
	JFrame frame = new JFrame();
	
//---------------------------------Buttons----------------------------------------
	
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JButton x = new JButton();
	
//---------------------------------TextField--------------------------------------
	
	JTextField userField = new JTextField();
	JPasswordField passField = new JPasswordField();
	
//-----------------------------------Labels---------------------------------------	
	JLabel userlabel = new JLabel("Username: ");
	JLabel passlabel = new JLabel("Password: ");
	JLabel messagelabel = new JLabel();
	JLabel logolabel = new JLabel();
	JLabel toplabel = new JLabel();
	JLayeredPane pane = new JLayeredPane();
	
	
//-------------------------------------PANEL---------------------------------------	
	
	JPanel toppanel = new JPanel();
	
//--------------------------------------Image--------------------------------------	
	
	ImageIcon logo = new ImageIcon("PET.png");
	ImageIcon xbtn = new ImageIcon("x.png");
	
//--------------------------------------------------------------------------------
	
	Border border = BorderFactory.createLineBorder(Color.BLACK,3);
	
										///////
	
//--------------------------------------JMEnu-------------------------------------	
	
	
	
//--------------------------------------------------------------------------------

	//---------------------------------HashMap----------------------------------------
	
	HashMap<String,String> Login = new HashMap<String,String>();  

	LoginPage(HashMap<String,String> loginInfoOriginal){ 
				
		Login =  loginInfoOriginal;
		
//----------------------------------FRAME-----------------------------------------
		frame.setTitle("Pet Shop");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,400);
//		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setUndecorated(true);	
		
//----------------------------------OTHERS-----------------------------------------		
		
		x.setText("X");
		x.setLayout(null);
		x.setFont(new Font("Mv Boli",Font.BOLD,10));
		x.setBounds(570,-5,40,40);
		x.setIcon(xbtn);
		x.setBackground(new Color(0xCCA758));
		x.setFocusable(false);
		x.setBorder(BorderFactory.createEmptyBorder());
		x.addActionListener(this);
		
		toplabel.setOpaque(true);
		toplabel.setBackground(new Color(0xCCA758));
		toplabel.setBounds(100,100,200,200);
		pane.add(toplabel, Integer.valueOf(10));
		
		toplabel.setText(" Pet Shop ");
		toplabel.setForeground(new Color(0x6E5728));
		toplabel.setFont(new Font("MV Boli",Font.BOLD,20));
		toplabel.setVerticalTextPosition(JLabel.TOP);
		
		toppanel.setBackground(new Color(0xCCA758));
		toppanel.setPreferredSize(new Dimension(600,30));		
		toppanel.add(toplabel);
		
				
		logolabel.setIcon(logo);		
		logolabel.setBounds(50,-40, 700, 400);


		
		userlabel.setBounds(50,314,75,30);
		userlabel.setFont(new Font("Mv Boli",Font.PLAIN,13));
		userlabel.setFont(new Font("Mv Boli", Font.BOLD,13));
		userlabel.setForeground(new Color(0x6E5728));
						
		passlabel.setBounds(51,345,75,30);	
		passlabel.setFont(new Font("Mv Boli",Font.PLAIN,13));
		passlabel.setFont(new Font("Mv Boli", Font.BOLD,13));
		passlabel.setForeground(new Color(0x6E5728));
		
		messagelabel.setBounds(260,295,450,20);
		
		userField.setBounds(120,320,450,20);
		userField.setFont(new Font("Mv Boli", Font.ITALIC,15));
		userField.setFont(new Font("Mv Boli", Font.BOLD,15));
		userField.setForeground(new Color(0x6E5728));
		
		passField.setBounds(120,350,450,20);
		passField.setFont(new Font("Mv Boli", Font.ITALIC,15));
		passField.setFont(new Font("Mv Boli", Font.BOLD,15));
		passField.setForeground(new Color(0x6E5728));
				
		loginButton.setBounds(120,377,80,20);  // x,y,w,h
		loginButton.setFocusable(false);
		loginButton.setFont(new Font("Mv Boli",Font.PLAIN,15));		
		loginButton.addActionListener(this);
		loginButton.setForeground(new Color(0xD0961C));
		loginButton.setBackground(new Color(0xAE852F));
		loginButton.setBorder(BorderFactory.createEmptyBorder());
		loginButton.setBorder(BorderFactory.createEtchedBorder(Color.LIGHT_GRAY,null));
		
		
		resetButton.setBounds(220,377,75,20);
		resetButton.setFocusable(false);
		resetButton.setFont(new Font("Mv Boli",Font.PLAIN,15));	
		resetButton.addActionListener(this);
		resetButton.setForeground(new Color(0xD0961C));
		resetButton.setBackground(new Color(0xAE852F));
		resetButton.setBorder(BorderFactory.createEtchedBorder(Color.LIGHT_GRAY,null));
		
		
		
		
		
//------------------------------------FRAME---------------------------------------
		
		frame.add(x);	
		frame.add(logolabel);
		frame.add(loginButton);
		frame.add(resetButton);
		frame.add(userField);
		frame.add(passField);
		frame.add(messagelabel);
		frame.add(userlabel);
		frame.add(passlabel);
		frame.add(messagelabel);
		frame.add(toppanel);
		frame.setVisible(true);
	}
//--------------------------------------------------------------------------------
				//  Condition if the user and pass are correct
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource() == x) {
			System.exit(0);
						
		}
		
		
		
		if (e.getSource()==resetButton) {
				userField.setText("");
				passField.setText("");
		}		
		
				if (e.getSource() == loginButton) {
					
					String user = userField.getText();
					String pass = String.valueOf(passField.getPassword());
			
					if (Login.containsKey(user)) {
						if(Login.get(user).equals(pass)) {
								messagelabel.setFont(new Font("Mv Boli",Font.BOLD,30));
								messagelabel.setForeground(Color.GREEN);
								messagelabel.setText("Login Successfully");					
								frame.dispose();
								WelcomePage welcome = new WelcomePage();
								
								
						}
								else {
									messagelabel.setFont(new Font("Mv Boli",Font.BOLD,20));
									messagelabel.setForeground(Color.RED);
									messagelabel.setText("Login Failed");
									
								}
								}
								else {
									messagelabel.setFont(new Font("Mv Boli",Font.BOLD,20));
									messagelabel.setForeground(Color.RED);
									messagelabel.setText("Login Failed");
				}
			}												
		}					
	
	//----------------------------------------------------------------------------
}
