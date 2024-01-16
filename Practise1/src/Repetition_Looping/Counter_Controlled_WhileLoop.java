package Repetition_Looping;
import java.util.*;
public class Counter_Controlled_WhileLoop {
	
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		
		int limit;	// number of integers
		int number;	// variable to store the number
		int sum;	// store the sum
		int counter;	//loop control
		
		
		System.out.println("Enter the number of integers:" );
		limit = sc.nextInt();
		
		sum = 0;
		counter = 0;
		int average;
		
		System.out.println("Enter " + limit + " integers.");
		
		while (counter < limit)
		{
			number = sc.nextInt();
			sum = sum + number;
			counter++;
		}
		
		System.out.println("The sum of the " + limit + " integers is = " + sum ); 
		
		if (counter != 0)
		{
			average = sum/limit;
		
		System.out.println("The average = " + average );
		}

	}

}
