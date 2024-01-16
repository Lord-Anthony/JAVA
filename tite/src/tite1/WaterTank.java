package tite1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

abstract class WaterTank {
	public abstract void watertank();
	public abstract void addWater(float gallons);
	public abstract void removeWater(float gallons);
	public abstract float currentLevel();
	public abstract boolean isFull();
	public abstract boolean isEmpty();
}

class WaterTankGUI extends WaterTank implements ActionListener {
	
	static JFrame frame;
	static JLabel title, text1, text2, text3, text4;
	static JPanel panel1, panel2;
	static JButton button1, button2, button3;
	float level = 0;
	static WaterTankGUI Tank = new WaterTankGUI();
	
	@Override
	public void watertank() {
		level = 10000;	
	}

	@Override
	public void addWater(float gallons) {
		 level = level + gallons; 
	}

	@Override
	public void removeWater(float gallons) {
		 level = level - gallons; 	
	}

	@Override
	public float currentLevel() {
		return level;
	}

	@Override
	public boolean isFull() {
		if(level == 10000) return true; 
		 else return false; 
	}

	@Override
	public boolean isEmpty() {
		 if(level == 0.00) return true; 
		 else return false; 
	}
	
	public static void main(String[] args) {
		//-------------------------------------------------------------------- MAIN FRAME
		frame = new JFrame("Water Tank GUI");
		frame.setSize(300,300);
		frame.setLayout(null);
		frame.getContentPane().setBackground(new Color(0x292929));
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//-------------------------------------------------------------------- METHODS
		homeGUI();
		//-------------------------------------------------------------------- TURN FRAME ON
		frame.setVisible(true);
	}
	
	private static void homeGUI() {
		//-------------------------------------------------------------------- TOP PANEL
		panel1 = new JPanel();
		panel1.setBounds(0, 0, 292, 80);
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER,0,10));
		panel1.setBackground(new Color(0xffa31a));
		panel1.setBorder(BorderFactory.createEtchedBorder());
		
		title = new JLabel("Water Tank");
		title.setFont(new Font("Impact",Font.PLAIN,40));
		title.setForeground(Color.WHITE);
		//-------------------------------------------------------------------- MIDDLE PANEL
		panel2 = new JPanel();
		panel2.setBounds(0, 80, 292, 118);
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		panel2.setBackground(new Color(0x292929));
		panel2.setBorder(BorderFactory.createEtchedBorder());
		
		text1 = new JLabel("Maximum Capacity: 10,000 gallons");
		text1.setFont(new Font("Arial",Font.BOLD,13));
		text1.setForeground(Color.WHITE);
		
		text2 = new JLabel();
		text2.setText("Current Level: " + Tank.currentLevel() + " gallons");
		text2.setFont(new Font("Arial",Font.BOLD,13));
		text2.setForeground(Color.WHITE);
		
		text3 = new JLabel();
		text3.setText("Water Tank Empty: " + Tank.isEmpty());
		text3.setFont(new Font("Arial",Font.BOLD,13));
		text3.setForeground(Color.WHITE);
		
		text4 = new JLabel();
		text4.setText("Water Tank Full: " + Tank.isFull());
		text4.setFont(new Font("Arial",Font.BOLD,13));
		text4.setForeground(Color.WHITE);
		//-------------------------------------------------------------------- BUTTONS
		button1 = new JButton("Add Water");
		button1.setFont(new Font("Helvetica",Font.BOLD,12));
		button1.setBounds(15, 215, 120, 33);
		button1.setBackground(new Color(0x808080));
		button1.setForeground(Color.WHITE);
		button1.setFocusable(false);
		button1.setCursor(new Cursor(12));
		button1.addActionListener(new WaterTankGUI());
		
		button2 = new JButton("Remove Water");
		button2.setFont(new Font("Helvetica",Font.BOLD,12));
		button2.setBounds(152, 215, 120, 33);
		button2.setBackground(new Color(0x808080));
		button2.setForeground(Color.WHITE);
		button2.setFocusable(false);
		button2.setCursor(new Cursor(12));
		button2.addActionListener(new WaterTankGUI());
		//-------------------------------------------------------------------- ADD COMPONENTS TO FRAME
		panel1.add(title);
		frame.add(panel1);
		frame.add(panel2);
		panel2.add(text1);
		panel2.add(text2);
		panel2.add(text3);
		panel2.add(text4);
		frame.add(button1);
		frame.add(button2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//-------------------------------------------------------------------- FUNC FOR BUTTONS
		button1Func(e);
		button2Func(e);
	}
	
	private void button1Func(ActionEvent e) {
		//-------------------------------------------------------------------- ADD WATER BUTTON
		if(e.getSource() == button1) {
			try {
				int temp = Integer.parseInt(JOptionPane.showInputDialog(null, "Input amount of gallons to be added:"));
				if((Tank.currentLevel() + temp) > 10000) {
					JOptionPane.showMessageDialog(null, "Cannot exceed 10,000 gallons", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Successfully added " + temp + " gallons!");
					Tank.addWater(temp);
					resetText();
				}
			} catch(NumberFormatException nfe) {
				System.out.println("Input an Integer");
			}
		}
	}
	
	private void button2Func(ActionEvent e) {	
		//-------------------------------------------------------------------- REMOVE WATER BUTTON
		if(e.getSource() == button2) {
			try {
				int temp = Integer.parseInt(JOptionPane.showInputDialog(null, "Input amount of gallons to be removed:"));
				if(temp > Tank.currentLevel()) {
					JOptionPane.showMessageDialog(null, "Not enough gallons of water!", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Successfully removed " + temp + " gallons!");
					Tank.removeWater(temp);
					resetText();
				}
			} catch(NumberFormatException nfe) {
				System.out.println("Input an Integer");
			}
		}
	}
	private void resetText() {
		//-------------------------------------------------------------------- RESET ALL TEXT
		text2.setText("Current Level: " + Tank.currentLevel() + " gallons");
		text3.setText("Water Tank Empty: " + Tank.isEmpty());
		text4.setText("Water Tank Full: " + Tank.isFull());
	}
}
