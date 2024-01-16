package KEYLISTENER;

import javax.swing.*;

import org.eclipse.ui.internal.dialogs.cpd.TreeManager.CheckListener;
import org.eclipse.ui.internal.dialogs.cpd.TreeManager.TreeItem;

import java.awt.*;
import java.awt.event.*;


public class Main extends JFrame implements KeyListener{
	
	JLabel label;
	ImageIcon icon;
	
	Main(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		//-------------------------------------------------------------------------
		
		icon = new ImageIcon("penis (2).png");
		
		
		label = new JLabel();
		label.setBounds(0,0,100,100);
		label.setIcon(icon);
//		label.setBackground(Color.blue);
//		label.setOpaque(true);
		
		
		//-------------------------------------------------------------------------
		
		this.add(label);
		this.addKeyListener(this);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Main();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// invoked when key is typed. uses KeyChar, char Output
		switch (e.getKeyChar()) {
		case 'a':
			label.setLocation(label.getX()-10,label.getY());
				break;	
		case 'w':
			label.setLocation(label.getX(),label.getY()-10);
				break;
		case 's':
			label.setLocation(label.getX(),label.getY()+10);
				break;
		case 'd':
			label.setLocation(label.getX()+10,label.getY());
				break;
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//  invoked when a physical key is pressed down, uses KeyCode, int ouput
		switch (e.getKeyCode()) {
		case 37:
			label.setLocation(label.getX()-10,label.getY());
				break;	
		case 38:
			label.setLocation(label.getX(),label.getY()-10);
				break;
		case 40:
			label.setLocation(label.getX(),label.getY()+10);
				break;
		case 39:
			label.setLocation(label.getX()+10,label.getY());
				break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// called whenever a button is released
		System.out.println("You released key char: " + e.getKeyChar());
		System.out.println("You released key code: " + e.getKeyCode());
		
	}
}