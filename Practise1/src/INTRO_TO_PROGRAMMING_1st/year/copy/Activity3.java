package INTRO_TO_PROGRAMMING_1st.year.copy;
import java.util.*;
public class Activity3 {
	
	static Scanner sc = new Scanner (System.in);
		
		//Create a flowchart to ask user for 3 integers. Display the largest of 3 numbers.
	
		
		// User Defined Methods	
		public static double larger (double x, double y)
		{
			double  max;
			
			if   (x >= y)
				max = x;
			else 
				max = y;
			
					return max;
		}	
		
		
		
		// final 
		
		public static void main(String[] args) {
			
			double maxs;
			int num;
			int count;
			
			System.out.println("Enter 3 Integers: ");
			num = sc.nextInt();
			maxs = num;
			
		for (count = 1; count < 3; count++)
		{
			num = sc.nextInt();
			maxs = larger(maxs, num);
		}
	System.out.println("The largest number is " + maxs);		
			
	}

}
