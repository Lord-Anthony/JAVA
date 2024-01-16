package IF_else;
import java.util.*;
public class Switch_Structure {
	

		static Scanner sc = new Scanner(System.in);
		
	public static void main (String[] args) 
	{
		
		int X;
		
		System.out.println("Enter number with corresponding grades: 1.|96-100 2.|90-95 3.|85-89 4.|80-84 5.|75-79 6.|NA");
		X = sc.nextInt();
		System.out.println();
		
		switch (X) {
		case 1: 
			System.out.println("Your Grade is 4.0");
		case 2:
			System.out.println("Your Grade is 3.5");
		case 3: 
			System.out.println("Your Grade is 3.0");
		case 4: 
			System.out.println("Your Grade is 2.5");
		case 5:
			System.out.println("Your Grade is 2.0");
		default: 
				System.out.println("You Failed");
		}
		
		
		
		

	}

	}
