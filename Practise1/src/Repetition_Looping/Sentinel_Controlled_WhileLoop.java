package Repetition_Looping;
import java.util.*;
import java.util.Scanner;
public class Sentinel_Controlled_WhileLoop {
	
	static final int Sentinel = -999;

		
		static Scanner sc = new Scanner (System.in);
		
		public static void main(String[] args) {

			
			int number;	// variable to store the number
			int sum = 0 ;	// store the sum
			int counter = 0 ;	//loop control
			int average;
			
			
			System.out.println("Enter positive integers ending with " + Sentinel );
			number = sc.nextInt();
			
			
			
			while (number != Sentinel)
			{
				
				sum = sum + number;
				counter++;
				number = sc.nextInt();
			}
			
			System.out.println("The sum of " + ++counter + " integers is = " + sum ); 
			
			if (counter != 0)
			{
				average = sum / counter ;
				
			
			System.out.println("The average = " + average );
			}

		}


	}


