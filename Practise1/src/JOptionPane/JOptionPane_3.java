package JOptionPane;
import javax.swing.*;
public class JOptionPane_3 {

	public static void main(String[] args) 
	
	
	// USE COMMENTS TO DISSALLOW CODE TO NOT RUN
	{
		//JOptionPane.showMessageDialog(null, "Hello this is my first time using JOptionPane", "Greeting to the Reader!!", JOptionPane.PLAIN_MESSAGE );
		//JOptionPane.showMessageDialog(null, "Hello this is my first time using JOptionPane", "Greeting to the Reader!!", JOptionPane.INFORMATION_MESSAGE );
		//JOptionPane.showMessageDialog(null, "Hello this is my first time using JOptionPane", "Greeting to the Reader!!", JOptionPane.WARNING_MESSAGE );
		//JOptionPane.showMessageDialog(null, "Hello this is my first time using JOptionPane", "Greeting to the Reader!!", JOptionPane.QUESTION_MESSAGE );
		//JOptionPane.showMessageDialog(null, "Hello this is my first time using JOptionPane", "Greeting to the Reader!!", JOptionPane.ERROR_MESSAGE );	
	
	
        // while(true) {} scary code do not use
		
		
		
		
		
		// yes or no 
		
		//JOptionPane.showConfirmDialog(null," Do you like cock?" , "Hello!!", JOptionPane.YES_NO_CANCEL_OPTION);
		//JOptionPane.showConfirmDialog(null," Do you like cock?" , "Hello!!", JOptionPane.YES_OPTION);
		
		//System.out.println( JOptionPane.showConfirmDialog (null," Do you like cock?" , "Hello!!", JOptionPane.YES_NO_CANCEL_OPTION));
		
		//int answer = JOptionPane.showConfirmDialog(null," Do you like cock?" , "Hello!!", JOptionPane.YES_NO_CANCEL_OPTION); 
		String name = JOptionPane.showInputDialog("What is your name?" ) ;
		JOptionPane.showMessageDialog(null, "HI!! " + name , "HI", JOptionPane.INFORMATION_MESSAGE);
		
		
		
		
	}
	
	
	
	
}