package Activities;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Activity7_Acuña {

	private JFrame frmCalculatorAcua;
	private JTextField textField = new JTextField();
	private JTextField textField_1 = new JTextField();
	private JTextField textField_2 = new JTextField();
	JButton btnNewButton = new JButton("-");
	JButton btnNewButton_1 = new JButton("+");
	JButton btnNewButton_2 = new JButton("x");
	JButton btnNewButton_3 = new JButton("÷");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Activity7_Acuña window = new Activity7_Acuña();
					window.frmCalculatorAcua.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Activity7_Acuña() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculatorAcua = new JFrame();
		frmCalculatorAcua.setTitle("Calculator Acuña");
		frmCalculatorAcua.setResizable(false);
		frmCalculatorAcua.setBounds(100, 100, 367, 383);
		frmCalculatorAcua.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculatorAcua.getContentPane().setLayout(null);
		
		
		textField.setBounds(10, 11, 328, 31);
		frmCalculatorAcua.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		textField_1.setBounds(10, 53, 328, 31);
		frmCalculatorAcua.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		textField_2.setEnabled(false);
		
	
		textField_2.setBounds(10, 95, 328, 31);
		frmCalculatorAcua.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField.getText();
				String s2 = textField_1.getText();
				int a = Integer.parseInt(s1);
				int b = Integer.parseInt(s2);
				int c = 0;
				
				c = a - b;
				
				String result = String.valueOf(c);
				textField_2.setText(result);
			}
		});
		
		
		btnNewButton.setBounds(49, 253, 71, 62);
		frmCalculatorAcua.getContentPane().add(btnNewButton);
		btnNewButton.setFocusable(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField.getText();
				String s2 = textField_1.getText();
				int a = Integer.parseInt(s1);
				int b = Integer.parseInt(s2);
				int c = 0;
				
				c = a + b;
				
				String result = String.valueOf(c);
				textField_2.setText(result);
				
			}
		});
		
		
		btnNewButton_1.setBounds(49, 162, 71, 62);
		frmCalculatorAcua.getContentPane().add(btnNewButton_1);
		btnNewButton_1.setFocusable(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField.getText();
				String s2 = textField_1.getText();
				int a = Integer.parseInt(s1);
				int b = Integer.parseInt(s2);
				int c = 0;
				
				c = a * b;
				
				String result = String.valueOf(c);
				textField_2.setText(result);
			}
		});
		
		
		btnNewButton_2.setBounds(223, 162, 71, 62);
		frmCalculatorAcua.getContentPane().add(btnNewButton_2);
		btnNewButton_2.setFocusable(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = textField.getText();
				String s2 = textField_1.getText();
				int a = Integer.parseInt(s1);
				int b = Integer.parseInt(s2);
				int c = 0;
				
				c = a / b;
				
				String result = String.valueOf(c);
				textField_2.setText(result);
			}
		});
		
		
		btnNewButton_3.setBounds(223, 253, 71, 62);
		frmCalculatorAcua.getContentPane().add(btnNewButton_3);
		btnNewButton_3.setFocusable(false);
	}
}

