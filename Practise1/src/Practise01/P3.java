package Practise01;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class P3 {
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name: ");
		
		JOptionPane.showMessageDialog(null," Good Morning to you " + name + " !! <3 ", " HI I'M LORD ANTHONY THE PROGRAMMER " , JOptionPane.INFORMATION_MESSAGE);
	
		
		String num = JOptionPane.showInputDialog(null, " How are you? Good ,Fine ,or Bad? ", " Hi! again  " + name , JOptionPane.QUESTION_MESSAGE);
		
		String Good;
		String Fine;
		String Bad;
		
		
		
		// for print
		
		/*
		
		 
		switch (num)
		{
		
		case "Good" : System.out.println(" A great attitude is like a perfect cup of coffee, don't start your day without it. (: ");
		break;
		case "Fine" : System.out.println("  It's a great day to be alive. (: ");
		break;		
		case "Bad"  : System.out.println(" Life is tough, but so are you. (: ");
		break;
		default : System.out.println(" Start your day as a happy man (: ");
		
		}
		
		*/
		
		
		switch (num)
		{
		case "Good" : JOptionPane.showMessageDialog(null, " A great attitude is like a perfect cup of coffee, don't start your day without it. (: ", " HI " + name + " !! ",JOptionPane.INFORMATION_MESSAGE);
		break;
		
		case "Fine" : JOptionPane.showMessageDialog(null, " It's a great day to be alive. (: ", " HI "  + name + " !! ", JOptionPane.INFORMATION_MESSAGE);
		break;
		
		case "Bad"  : JOptionPane.showMessageDialog(null, " Start your day as a happy man (: ", " HI " + name + " !! ", JOptionPane.INFORMATION_MESSAGE);
 		break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
