package PANNELS;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		
	//JPanel = GUI that functions as container to hold other components
	
	ImageIcon icon = new ImageIcon("paws.png");
	
	
		
		
	JLabel label = new JLabel();
	label.setText("Tanginamo");
//	label.setIcon(icon);
	label.setVerticalAlignment(JLabel.TOP);
	label.setHorizontalAlignment(JLabel.CENTER);
	label.setBounds(0, 0, 75, 75);
		
	JPanel bluepanel = new JPanel();	 // set a panel
	bluepanel.setBackground(Color.blue);
	bluepanel.setBounds(0,0,250,250);
	
	
	JPanel redpanel = new JPanel();	 // set a panel
	redpanel.setBackground(Color.red);
	redpanel.setBounds(250,0,250,250);
	
	JPanel greenpanel = new JPanel();	 // set a panel
	greenpanel.setBackground(Color.green);
	greenpanel.setBounds(0,250,500,500);
	greenpanel.setLayout(new BorderLayout());
	
	
	JFrame frame = new JFrame();
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(null);
	frame.setSize(750,750);	
	frame.setVisible(true);	
	bluepanel.add(label);
	frame.add(bluepanel);
	frame.add(redpanel);
	frame.add(greenpanel);
	
	
	}
	

}
