package EXERCISE;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Component;
import java.awt.Container;

import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.DropMode;
import java.awt.Panel;


public class WaterTankGUI {
	

	private static final Container INPUTs = null;
	protected static final String Horizontal = null;
	private JFrame frame;
	private ImageIcon image;
	private JTextField textField;
	private Panel panel_4;
	private JTextField textField_1;
	private JTextField textField_2;
	public int wateramount = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
				 
				 

				 EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WaterTankGUI window = new WaterTankGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WaterTankGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);
		
		JLabel watertank = new JLabel("");
		watertank.setIcon(new ImageIcon(WaterTankGUI.class.getResource("/EXERCISE/img/1.png")));
		watertank.setBounds(24, 194, 203, 180);
		frame.getContentPane().add(watertank);
		
		JLabel water = new JLabel("");
		water.setIcon(new ImageIcon(WaterTankGUI.class.getResource("/EXERCISE/img/2.png")));
		water.setBounds(72, 325, 111, 38);
		frame.getContentPane().add(water);
		
		JLabel grass = new JLabel("");
		grass.setIcon(new ImageIcon(WaterTankGUI.class.getResource("/EXERCISE/img/3.png")));
		grass.setBounds(-213, 361, 486, 139);
		frame.getContentPane().add(grass);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(0, 0, 273, 206);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WATER TANK");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setBounds(29, 11, 208, 132);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\t     By: \r\nAnthony Acuña");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(67, 104, 143, 26);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBounds(0, 205, 72, 158);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_2.setBackground(new Color(224, 255, 255));
		panel_2.setBounds(72, 194, 35, 30);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_2_1.setBackground(new Color(224, 255, 255));
		panel_2_1.setBounds(148, 194, 35, 30);
		frame.getContentPane().add(panel_2_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1_1.setBackground(new Color(224, 255, 255));
		panel_1_1.setBounds(214, 205, 59, 158);
		frame.getContentPane().add(panel_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_3.setBackground(new Color(224, 255, 255));
		panel_3.setBounds(180, 205, 35, 158);
		frame.getContentPane().add(panel_3);
		
		JPanel INPUTs = new JPanel();
		INPUTs.setBackground(new Color(47, 79, 79));
		INPUTs.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), null));
		INPUTs.setBounds(271, 0, 429, 500);
		frame.getContentPane().add(INPUTs);
		INPUTs.setLayout(null);
		
		JLabel tankcurrentlvl = new JLabel("Water Tank Maximum Capacity: 10,000 gallons of Water");
		tankcurrentlvl.setHorizontalAlignment(SwingConstants.CENTER);
		tankcurrentlvl.setFont(new Font("Sitka Text", Font.BOLD, 15));
		tankcurrentlvl.setForeground(new Color(46, 139, 87));
		tankcurrentlvl.setBounds(0, 0, 429, 66);
		INPUTs.add(tankcurrentlvl);
		
		JLabel lblNewLabel_3 = new JLabel("Water Tank Current Level:");
		lblNewLabel_3.setForeground(new Color(46, 139, 87));
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(79, 43, 267, 60);		
		INPUTs.add(lblNewLabel_3);
//------------------------------------------------------------	
		// amount of water
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setBounds(170, 83, 86, 20);
		INPUTs.add(textField);
		textField.setColumns(10);
		textField.setText("0");
		textField.setText(String.valueOf(wateramount));
	
	
		
		
		
		
//-------------------------------------------------------------		
		JButton btnNewButton = new JButton("ADD WATER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int add;
				
				add = Integer.parseInt(textField_1.getText());
				wateramount += add;
				
				textField.setText(String.valueOf(wateramount));
				
				if (wateramount > 10000)
				{
					JTextField textField_3 = new JTextField();
					textField_3.setForeground(new Color(139, 0, 0));
					textField_3.setFont(new Font("Tahoma", Font.BOLD, 14));
					textField_3.setBackground(new Color(47, 79, 79));
					textField_3.setVisible(true);
					textField_3.setEditable(false);
					textField_3.setBounds(66, 332, 296, 20);
					INPUTs.add(textField_3);
					textField_3.setColumns(10);
					textField_3.setText("Water Tank is full!!");
					textField_3.setBorder(null);
					textField_3.setHorizontalAlignment(JTextField.CENTER);
					
				}
				
				
				
				
				
			}
		});
			
			
		
		
		

		
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton.setBackground(new Color(102, 153, 255));
		btnNewButton.setForeground(new Color(0, 206, 209));
		btnNewButton.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btnNewButton.setBounds(10, 364, 151, 60);
		INPUTs.add(btnNewButton);
		
		
		
		
		
		
		JButton btnRemoveWater = new JButton("REMOVE WATER");
		btnRemoveWater.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int remove;
				
				remove = Integer.parseInt(textField_1.getText());
				wateramount -= remove;
				
				textField.setText(String.valueOf(wateramount)); 
				
				if (wateramount == 0)
				{
					JTextField textField_3 = new JTextField();
					textField_3.setForeground(new Color(139, 0, 0));
					textField_3.setFont(new Font("Tahoma", Font.BOLD, 14));
					textField_3.setBackground(new Color(47, 79, 79));
					textField_3.setVisible(true);
					textField_3.setEditable(false);
					textField_3.setBounds(66, 332, 296, 20);
					INPUTs.add(textField_3);
					textField_3.setColumns(10);
					textField_3.setText("Water Tank is empty!!");
					textField_3.setBorder(null);
					textField_3.setHorizontalAlignment(JTextField.CENTER);
				}
			}
		});
		
		
		btnRemoveWater.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnRemoveWater.setBackground(new Color(255, 99, 71));
		btnRemoveWater.setForeground(new Color(255, 0, 0));
		btnRemoveWater.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btnRemoveWater.setBounds(268, 364, 151, 60);
		INPUTs.add(btnRemoveWater);
		
		JButton btnNewButton_1 = new JButton("EXIT");
		btnNewButton_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton_1.setForeground(new Color(165, 42, 42));
		btnNewButton_1.setBackground(new Color(204, 0, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						System.exit(0);
			}
		});
		btnNewButton_1.setBounds(170, 459, 86, 30);
		INPUTs.add(btnNewButton_1);
		frame.setBackground(Color.WHITE);
		
		panel_4 = new Panel();
		panel_4.setBackground(new Color(46, 139, 87));
		panel_4.setBounds(10, 250, 409, 66);
		INPUTs.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("How many of gallons of water will you add / remove?");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 5, 389, 25);
		panel_4.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(104, 35, 197, 20);
		panel_4.add(textField_1);
		textField_1.setColumns(10);		
	}					
		}
	

	
		
	


