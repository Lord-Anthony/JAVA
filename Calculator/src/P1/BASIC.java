package P1;
import java.util.*;
public class BASIC {

	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		System.out.println("Enter First Number: ");
		int num1 = s.nextInt();
		System.out.println();
		
		
		System.out.println("Enter Second Number: ");
		int num2 = s.nextInt();
		System.out.println();
		
		int add = num1 + num2;
		int sub = num1 - num2;
		int multiply = num1 * num2;
		int divide = num1 / num2;
		int modulus = num1 % num2;
		
	
		System.out.println("Addition: " + add );
		System.out.println("Subtraction: " + sub );
		System.out.println("Multiplication: " + multiply );
		System.out.println("Division: " + divide );
		System.out.println("Modulus: " + modulus );
		
		
		
		
		

	}
}
