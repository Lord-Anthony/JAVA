package FINAL;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class WelcomePage extends JFrame implements ActionListener{
private static final float TOP = 0;
//-----------------------------------------------------------------------------------	
	JFrame frame = new  JFrame();	
//-----------------------------------------------------------------------------------
	
	
	JButton info = new JButton(" Project Info ");
	JButton listpets = new JButton(" Pet List ");
	JButton listfood = new JButton( " Food List " );
	JButton salesreport = new JButton( "Sales Report" );
	JButton medicine = new JButton(" Medicine ");
	JButton logout = new JButton( " Logout " );	

	
	
	JPanel toppanel = new JPanel();
	JLabel toplabel = new JLabel();
	
	JPanel toppanel1 = new JPanel();
	
	JPanel midpanel = new JPanel();
	JLabel midlabel = new JLabel();
	
	
	
	
//----------------------------------------------------------------------------------
	WelcomePage (){
	
//------------------------------------------Top-------------------------------------------	
		
	toplabel.setText("Welcome Pet Shop");
	toplabel.setForeground(new Color(0xD0961C));
	toplabel.setFont(new Font("Mv Boli",Font.BOLD,11));	
	

	toppanel.add(toplabel);
	toppanel.setBackground(new Color(0xAE852F));
	toppanel.setBounds(0,0,1000,20);
	toppanel.setLayout(new FlowLayout());	
	
	
	
//----------------------------------------top1---------------------------------------------	
	
	info.setFont(new Font("Mv Boli",Font.BOLD,13));	
	listpets.setFont(new Font("Mv Boli",Font.BOLD,13));
	listfood.setFont(new Font("Mv Boli",Font.BOLD,13));
	salesreport.setFont(new Font("Mv Boli",Font.BOLD,13));
	logout.setFont(new Font("Mv Boli",Font.BOLD,13));
	
	
	info.setForeground(new Color(0xD0961C));
	listpets.setForeground(new Color(0xD0961C));
	listfood.setForeground(new Color(0xD0961C));
	salesreport.setForeground(new Color(0xD0961C));
	logout.setForeground(new Color(0xD0961C));
	
	
	info.setBackground(new Color(0x977837));
	listpets.setBackground(new Color(0x977837));
	listfood.setBackground(new Color(0x977837));
	salesreport.setBackground(new Color(0x977837));
	logout.setBackground(new Color(0x977837));
	
	
	info.setBorder(BorderFactory.createLineBorder(Color.white,1));
	listpets.setBorder(BorderFactory.createLineBorder(Color.white,1));
	listfood.setBorder(BorderFactory.createLineBorder(Color.white,1));
	salesreport.setBorder(BorderFactory.createLineBorder(Color.white,1));
	logout.setBorder(BorderFactory.createLineBorder(Color.white,1));
	
	info.addActionListener(this);
	listpets.addActionListener(this);
	listfood.addActionListener(this);
	salesreport.addActionListener(this);
	logout.addActionListener(this);
	
	
	toppanel1.add(info);
	toppanel1.add(listpets);
	toppanel1.add(listfood);
	toppanel1.add(salesreport);
	toppanel1.add(logout);
	
	
	toppanel1.setBackground(new Color(0xD0961C));
	toppanel1.setLayout(new FlowLayout(FlowLayout.CENTER, 100,7)); //  x,y
	toppanel1.setBounds(25, 20, 950, 40);
	
//----------------------------------------MIDpanel---------------------------------------
	
	midlabel.setText(" Pet Shop  POS System " );
	midlabel.setFont(new Font("Mv Boli",Font.BOLD,35));
	midlabel.setForeground(new Color(0x6A4F15));
	midlabel.setBounds(0,0,200,200);
	
	midpanel.add(midlabel);
	midpanel.setBackground(new Color(0xD0961C));
	midpanel.setLayout(new FlowLayout(FlowLayout.LEFT));
	midpanel.setBounds(40, 80, 925, 550);
	
	
	

//-----------------------------------------------------------------------------------
	
	
	frame.add(toppanel1);
	frame.add(toppanel);
	frame.add(midpanel);
	
//----------------------------------------------------------------------------------
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	frame.setSize(1000,650);
	frame.setLayout(null);	
	frame.setLocationRelativeTo(null);	
	frame.setTitle("Pet Shop");
	frame.setUndecorated(true);	
	frame.setVisible(true);	
	}
//----------------------------------------------------------------------------------



//---------------------------------------------------------------------------------
	@Override
	public void actionPerformed(ActionEvent e) {
			
				if (e.getSource()==info) {
					
						ProjectInfo info = new ProjectInfo();
						
								
			}
					if (e.getSource()==listpets) {
					
						Pet pet = new Pet();
						
			}	
					if (e.getSource()==listfood) {
						
						Food food = new Food();
						
			}	
					
					if (e.getSource()==salesreport) {
						
						Sales sale = new Sales();
						
			}	
					if (e.getSource()==logout) {
						System.exit(0);
						
			}					
	}
	
	 	 		
//------------------------------------------------------------------------------------		
}