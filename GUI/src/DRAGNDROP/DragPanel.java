package DRAGNDROP;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DragPanel extends JPanel{
	
	ImageIcon image = new ImageIcon("penis (2).png");
	final int width = image.getIconWidth();
	final int heigth = image.getIconHeight();
	Point imageCorner, prevPt;
	
	DragPanel(){
		
	imageCorner = new Point(0,0);
	ClickListener clicklistener = new ClickListener();
	DragListener draglistener = new DragListener();
	this.addMouseListener(clicklistener);
	this.addMouseMotionListener(draglistener);
	
	}
	
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		image.paintIcon(this, g, (int)imageCorner.getX(),(int)imageCorner.getY());
		
	}
	
	private class ClickListener extends MouseAdapter{
		
		public void mousePressed(MouseEvent e) {
			
			prevPt =e.getPoint();
		}	
	}
	
	private class DragListener extends MouseMotionAdapter{
			public void mouseDragged(MouseEvent e) {
				
				Point currentPt = e.getPoint();
				
				imageCorner.translate(
						(int)(currentPt.getX() - prevPt.getX()),
						(int)(currentPt.getY() - prevPt.getY())
								);
				prevPt = currentPt;
				repaint();
			}
		
	}
}
