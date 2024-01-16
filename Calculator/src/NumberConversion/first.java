package NumberConversion;
import java.util.Scanner;


public class first {			
		static Scanner s = new Scanner (System.in);
		
		public static void main(String[] args) {
			
	// Please Select a Numbering System:
			
			System.out.println("Please Select a Numbering System:");
			System.out.println("1.| Decimal ");
			System.out.println("2.| Binary ");
			System.out.println("3.| Octal ");
			System.out.println("4.| Hexadecimal ");
			
			int pick = s.nextInt();
		
			System.out.println("Please enter the value to convert:");
			
			int pick1 = s.nextInt();
			
				
			String decimal = Integer.toString(pick1);
			String binary = Integer.toBinaryString(pick1);
			String octal = Integer.toOctalString(pick1); ;
			String hexadecimal = Integer.toHexString(pick1); 
			
			switch(pick) {
			
			case 1: System.out.println("The value in decimal is: " + decimal);
			break;
			case 2: System.out.println("The value in binary is: " + binary);
			break;
			case 3: System.out.println("The value in octal is: " + octal);
			break;
			case 4: System.out.println("The value in hexadecimal is " + hexadecimal);
			break;
			case 5: System.out.println("The value in decimal is: " + decimal);
					System.out.println("The value in decimal is: " + binary);
					System.out.println("The value in decimal is: " + octal);
					System.out.println("The value in hexadecimal is " + hexadecimal);
			break;
				default:
					
				
			}}}
