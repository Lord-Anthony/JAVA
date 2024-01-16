package IF_else;
import java.util.*;
public class My_Try {
	
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		
		double grade;
		
		System.out.println("Enter your Grade: ");
		grade = sc.nextDouble();
		System.out.println();
		
		if ( grade >= 96 && grade <= 100)
			System.out.println("Your Grade is 4.0");
		else if ( grade >= 90  && grade <= 95)
			System.out.println("Your Grade is 3.5");
		else if ( grade >= 85 && grade <= 89)
			System.out.println("Your Grade is 3.0");
		else if ( grade >= 80 && grade <= 84)
			System.out.println("Your Grade is 2.5");
		else if ( grade >= 75 && grade <= 70)
			System.out.println("Your Grade is 2.0 ");
		else 
			System.out.println("You Failed");
		

	}

}
