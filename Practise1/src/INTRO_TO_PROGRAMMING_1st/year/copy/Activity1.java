package INTRO_TO_PROGRAMMING_1st.year.copy;
import java.util.Scanner;
public class Activity1 {

	public static void main(String[] args) {
		
		// sum of two numbers
		// Create a flowchart to ask user for two input numbers.  Display the sum of the two numbers.
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		int sum;

		
		System.out.println("Enter 1st digit: ");
		num1 = sc.nextInt();
		
		System.out.println("Enter 2nd Digit: ");
		num2 = sc.nextInt();
		
		sum = num1 + num2;
		
		System.out.println(" The sum of " + num1 + " and " + num2 + " is " + sum);
				
		
				
	}

}
