package RADIOBUTTON;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener{
	
	
		JRadioButton rb1;
		JRadioButton rb2;
		JRadioButton rb3;
		ImageIcon caticon, dogicon,birdicon;
		
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		
		
		ImageIcon logo = new ImageIcon("paws.png");
		this.setIconImage(logo.getImage());
		
	 caticon = new ImageIcon("cat (1).png");
	 dogicon = new ImageIcon("dog (1).png");
	 birdicon = new ImageIcon("bird.png");
		
		rb1 = new JRadioButton("CAT");
		rb1.setFocusable(false);
		rb2 = new JRadioButton("DOG");
		rb2.setFocusable(false);
		rb3 = new JRadioButton("BIRD");
		rb3.setFocusable(false);
		
		ButtonGroup b = new ButtonGroup();
		b.add(rb1);
		b.add(rb2);
		b.add(rb3);
		
		rb1.addActionListener(this);
		rb2.addActionListener(this);
		rb3.addActionListener(this);
		
		
		rb1.setIcon(caticon);
		rb2.setIcon(dogicon);
		rb3.setIcon(birdicon);
		
		
		this.add(rb1);
		this.add(rb2);		
		this.add(rb3);	
		
		this.pack();
		this.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource()==rb1)
			System.out.println("You have Cat");
		else if (e.getSource()==rb2)
			System.out.println("You have DOG");
		else if (e.getSource()==rb3)
			System.out.println("You have Bird");
		
	}

}
