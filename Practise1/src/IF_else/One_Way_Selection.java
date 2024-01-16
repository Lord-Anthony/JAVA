package IF_else;
import javax.swing.JOptionPane;
public class One_Way_Selection {

	public static void main(String[] args) {
		
		int num;
		int num1;
		String str;
		
		str = JOptionPane.showInputDialog("Enter an Integer:");
		
		num = Integer.parseInt(str);
		num1 = num;
		
		if (num < 0)
			num = -num;
		
		JOptionPane.showMessageDialog(null, "The absolute value of " + num1 + " is " + num, "Absolute Value",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

	
	
	
}
