package DRAGNDROP;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {
	
	DragPanel drag = new DragPanel();
	
	
	Main(){
		
		this.setTitle("Drag n Drop");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		//-------------------------------------------------------------------
		
		//-------------------------------------------------------------------
		this.add(drag);
		this.setVisible(true);
	}
}
