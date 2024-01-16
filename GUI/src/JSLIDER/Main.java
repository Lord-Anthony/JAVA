package JSLIDER;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
public class Main extends JFrame implements ChangeListener{

			private static final String SwingConstant = null;
			// JSlider = let user enter a value by using adjusting sldiing knob track
	
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	
	
	Main(){
		
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0,100,50);   // min ,max, starting point
		//--------------------------------------------------------------------------
		
		slider.setPreferredSize(new Dimension(200,200));
		
		slider.setPaintTicks(true);     // little knotches
		slider.setMinorTickSpacing(10); // little lines below
		
		slider.setPaintTrack(true);     
		slider.setMajorTickSpacing(25);  // bid lines
		
		slider.setPaintLabels(true);  // paint labels
		slider.setFont(new Font("Mv Boli",Font.PLAIN,15)); // font of slider
		label.setFont(new Font("Mv Boli",Font.PLAIN,25));// font of label
		
		slider.setOrientation(SwingConstants.VERTICAL); // vertical or horizontal
		
		label.setText("C = " + slider.getValue());
		
		slider.addChangeListener(this);
			 
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(500,500);
		frame.setVisible(true);
		
		
		
		//--------------------------------------------------------------------------

	}
	public static void main(String[] args) {
		new Main();

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText("C = " + slider.getValue());
		
	}

}
