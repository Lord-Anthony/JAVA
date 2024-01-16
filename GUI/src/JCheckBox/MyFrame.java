package JCheckBox;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
public class MyFrame extends JFrame implements ActionListener {

	
	JCheckBox box;
	JButton button;
	ImageIcon icon1;
	ImageIcon icon2;
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
							
		button = new JButton();
		button.setText("Submit");
		button.addActionListener(this);
		
		button.setFocusable(false);
		
		box = new JCheckBox();
		box.setText("Tangina mo");
		box.setFocusable(false);
		box.setFont(new Font("Consolas",Font.PLAIN,35));
		
		
		this.add(button);
		this.add(box);
		this.pack();		
		this.setVisible(true);
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button) {
			System.out.println(box.isSelected());
		}
		
	}
}
