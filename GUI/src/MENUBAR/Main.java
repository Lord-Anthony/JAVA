package MENUBAR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.event.*;

public class Main extends JFrame implements ActionListener {
	
	
	
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	
	ImageIcon icon1,icon2,icon3;
	
	Main(){		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		//-----------------------------------------------------------------------
		
		icon1 = new ImageIcon("load.png");
		icon2 = new ImageIcon("sabe]]ve.png");
		icon3 = new ImageIcon("exit.png");
		
		
		JMenuBar bar = new JMenuBar();
		
		fileMenu = new JMenu("file");
		editMenu = new JMenu("edit");
		helpMenu = new JMenu("help");
		
		loadItem = new JMenuItem("load");
		saveItem = new JMenuItem("save");
		exitItem = new JMenuItem("exit");
		
		
		loadItem.setMnemonic(KeyEvent.VK_L);  // SHORTCUT KEYS item
		saveItem.setMnemonic(KeyEvent.VK_S);
		exitItem.setMnemonic(KeyEvent.VK_E);
		
		fileMenu.setMnemonic(KeyEvent.VK_F);  // Alt f			// SHORTCUT KEYS menu
		editMenu.setMnemonic(KeyEvent.VK_E);  // alt e
		helpMenu.setMnemonic(KeyEvent.VK_H);  // alt h
		
		loadItem.setIcon(icon1);
		saveItem.setIcon(icon2);
		exitItem.setIcon(icon3);

						
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		
		bar.add(fileMenu);
		bar.add(editMenu);
		bar.add(helpMenu);
		
		
		
		this.setJMenuBar(bar);			
		//------------------------------------------------------------------------		
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Main();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == loadItem) {
			System.out.println("LOADING");
		}
		if (e.getSource() == saveItem) {
			System.out.println("Saving");
	}
		if (e.getSource() == exitItem) {
			System.exit(0);  // exit 
}
}
}