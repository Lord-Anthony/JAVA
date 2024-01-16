package NEW_WINDOW;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener{
	
	JFrame frame = new JFrame ();
	JButton button = new JButton("New Window");
	

	LaunchPage(){
		
		button.setBounds(100,160,200,40);
		button.setFocusable(false);
		button.addActionListener(this);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(420,420));
		frame.setLayout(null);
		frame.add(button);
		frame.setVisible(true);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button) {
			frame.setEnabled(false);
			NewWindow window1 = new NewWindow();
			
			
		}
		
	}

}
