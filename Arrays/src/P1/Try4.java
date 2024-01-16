package P1;
import java.util.Scanner;
public class Try4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// INPUT THE LENGTH OF ARRAY

			System.out.println("Enter the length:");
	       int length = scanner.nextInt();
	       System.out.println("");

	       int[] array =  new int[length];

	     /*            for (int i = 0; i < length; i++) {
	                       array[i] = scanner.nextInt();                  */
	           
	    // SUMMING ELEMENTS
	           
	     /* System.out.println("Enter the numbers:");
	           int sum = 0;
	           for (int i = 0; i < length; i++) {
	        	   array[i] = scanner.nextInt();	        
	        	   sum += array[i];
	           }
	        	   System.out.print("Sum of all numbers:");
	        	   System.out.println(sum);
	     */
	       
	       
	       // SUMMING ELEMENTS BUT ONLY THE MULTIPLES OF 2
	       	       
	       int sum = 0;
	       
	       for (int i = 0; i < length; i++) {
	    	   array[i] = scanner.nextInt();
	    	   if (array[i]%2==0)
	    		   sum += array[i];
	       }
	       System.out.println("");
	       System.out.println("The sum with only numbers that mutliplies by 2:");
	       System.out.println(sum);
	}

}
