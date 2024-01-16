package try1;
import java.util.*;
public class try1 {
	
	static Scanner s = new Scanner (System.in);

	public static void main(String[] args) {
		

		// Fibonacci Sequence
		
		System.out.println("FIBONACCI SEQUENCE");
		System.out.println();
		System.out.println(" Enter limit: ");
		int limit = s.nextInt();
		
		int num1 = 0;
		int num2 = 1;
		
		for (int i = 1 ; i <= limit; i++ )
		{				
			System.out.print( num1 +  " ");
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			
		}
	}

}
