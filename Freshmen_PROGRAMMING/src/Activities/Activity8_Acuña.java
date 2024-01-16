package Activities;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.Checkbox;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Activity8_Acuña {

	private JFrame frmCheckboxExample;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Activity8_Acuña window = new Activity8_Acuña();
					window.frmCheckboxExample.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Activity8_Acuña() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCheckboxExample = new JFrame();
		frmCheckboxExample.setTitle("CheckBox Example");
		frmCheckboxExample.setBounds(100, 100, 400, 400);
		frmCheckboxExample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCheckboxExample.getContentPane().setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("True");
		chckbxNewCheckBox.setBounds(134, 91, 97, 23);
		frmCheckboxExample.getContentPane().add(chckbxNewCheckBox);
		chckbxNewCheckBox.setFocusable(false);
		
		JCheckBox chckbxFalse = new JCheckBox("False");
		chckbxFalse.setBounds(134, 176, 97, 23);
		frmCheckboxExample.getContentPane().add(chckbxFalse);
		chckbxFalse.setFocusable(false);
		
	}
}
