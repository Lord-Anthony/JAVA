package JCOLORCHOOSER;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener{
	
	JButton button;
	JLabel label;
	
	Main(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		//--------------------------------------------------------
		
		button = new JButton("choose a color");
		button.addActionListener(this);
		
		label = new JLabel();
		label.setBackground(Color.LIGHT_GRAY);
		label.setOpaque(true);
		label.setText("HI HI HI");
		label.setFont(new Font("Mv Boli",Font.PLAIN,50));
		
		
		
		
		
		
		
		//--------------------------------------------------------------
		this.add(button);
		this.add(label);
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
	new Main();	
		
	

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getSource()== button) {
			JColorChooser chooser = new JColorChooser();
			
			Color color = JColorChooser.showDialog(null,"pick a color,",Color.BLACK);			
//			label.setForeground(color);
			label.setBackground(color);
			
		}
		
	}

}
