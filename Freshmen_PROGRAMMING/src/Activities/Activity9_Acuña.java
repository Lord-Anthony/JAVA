package Activities;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class Activity9_Acuña {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Activity9_Acuña window = new Activity9_Acuña();
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
	public Activity9_Acuña() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		JButton btnNewButton = new JButton("1");
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("2");
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("3");
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("4");
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_2 = new JButton("5");
		frame.getContentPane().add(btnNewButton_2);
	}

}
