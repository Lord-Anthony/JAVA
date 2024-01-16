package INTRO_TO_PROGRAMMING_1st.year.copy;
import java.util.Scanner;
public class Activity2 {

	
		static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// Display Loss or Gain
		/* 
		Create a flowchart to ask user for the cost price and selling price of a product.  
		If the Cost price is greater than the selling price, print the loss.  
		If the cost price is lesser than the selling price, print the gain.
		*/
		
		
		int num1;
		int num2;
		int gain;
		int loss;
		
		//Cost Price 
		System.out.println("Enter Cost Price: ");
		num1 = input.nextInt();
		
		// Selling Price
		System.out.println("Enter Selling Price");
		num2 = input.nextInt();
		
		gain = (num1 - num2) * -1;
		loss = num2 - num1 ; 
		
		
		
		// if else
		
		if ( num1 >= num2 )
		{
			System.out.println(" You Loss " + loss + " Pesos ");
		}
		else 
		{
			System.out.println(" You Gain " + gain + " Pesos ");
		}

	}

}
