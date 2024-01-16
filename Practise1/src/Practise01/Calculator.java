package Practise01;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		
      int num1, num2 ;
      
      Scanner input = new Scanner (System.in);
      
      System.out.println("Insert 1st number:");
      num1 = input.nextInt();
      
      System.out.println("Insert 2nd number");
      num2 = input.nextInt();
      
      int Addition = num1 + num2 ;
      int Subtraction = num1 - num2 ;
      int Multiplication = num1 * num2 ;
      int Division = num1 / num2 ; 
      int Modulus = num1 % num2 ;
      
      System.out.println("Addition: " + Addition);
      System.out.println("Subtraction: " + Subtraction);
      System.out.println("Multiplication: " + Multiplication);
      System.out.println("Division: " + Division);
      System.out.println("Modulus: " + Modulus);
      
      
 
	}

}
