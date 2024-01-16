package MOUSELISTENER;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Main extends JFrame implements MouseListener{
	
	
	
	JLabel label;
	
	Main(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		//------------------------------------------------------
		label = new JLabel();
		label.setBounds(0,0,100,100);
		label.setBackground(Color.blue);
		label.setOpaque(true);
		label.addMouseListener(this);
//		this.addMouseListener(this);
		
		//------------------------------------------------------
		this.add(label);
		this.setVisible(true);
	}

	
	
	
	public static void main(String[] args) {
		new Main();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//  has been clicked (pressed or released)
//		System.out.println("you clicked the mouse");
	}




	@Override
	public void mousePressed(MouseEvent e) {
		//  has been pressed
		System.out.println("you pressed the mouse");
		label.setBackground(Color.black);
	}




	@Override
	public void mouseReleased(MouseEvent e) {
		// has been released
		System.out.println("you released the mouse");
		label.setBackground(Color.green);
	}




	@Override
	public void mouseEntered(MouseEvent e) {
		//  enters an area
		System.out.println("you entered the component");
		label.setBackground(Color.blue);
	}




	@Override
	public void mouseExited(MouseEvent e) {
		// exits an area
		System.out.println("you exited the component");
		label.setBackground(Color.red);
	}

}
