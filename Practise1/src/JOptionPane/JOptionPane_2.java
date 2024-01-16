package JOptionPane;
import javax.swing.JOptionPane;
public class JOptionPane_2 {

	public static void main (String [] args )
	{

		int number;
		int temp;
		String numString;
		
		numString = JOptionPane.showInputDialog("Enter an Integer:  ");
		number = Integer.parseInt(numString);
		temp = number;
		
		if ( number < 0 )
		{
			
			number = -number;
		}
		JOptionPane.showMessageDialog(null, "The absolute value of " + temp + " is " + number, "Absolute Value", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
		
		
		
		
	}

}

	