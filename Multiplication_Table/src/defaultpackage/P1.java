
package defaultpackage;
import java.util.*;
public class P1 {
	
	static Scanner s = new Scanner (System.in);

	public static void main(String[] args) {
		
		
		
		// Multiplication Table
		
		int num1;
		int limit;
		int newnum;
		int i;
		
		
		
		System.out.println("Enter the number to multiply: ");
		newnum = s.nextInt();
		System.out.println();
		
		System.out.println("Enter the number for the limit: ");
		limit = s.nextInt();
		System.out.println();
		
		num1 = newnum;
		
		for (i = 1; i <= limit; i++)
		{
			newnum = num1 * i;
			System.out.print( newnum + " " );		
		}
		

	}

}
