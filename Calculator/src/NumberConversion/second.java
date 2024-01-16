package NumberConversion;

import java.util.*;

 	public class second {
	 	
 		static Scanner s = new Scanner(System.in);
 					
 		public static void main(String[] args) {
 		
 // Code to Convert numbers either binary, decimal, octal, hexadecimal	
 				
 			
 		System.out.println("Select a Numbering System");
 		System.out.println("1.| Binary");
 		System.out.println("2.| Decimal");
 		System.out.println("3.| Octal");
 		System.out.println("4.| Hexadecimal");
 				
 		int first = s.nextInt();
 			
 		switch(first) {
 		
 				case 1: System.out.println("Input a Binary Number:");
 		
 						String binary = s.next();
 				
 						System.out.println("Choose to Convert:");
 						System.out.println("1.| Decimal");
 						System.out.println("2.| Octal");
 						System.out.println("3.| Hexadecimal");
 		 		
 						int binary2 = s.nextInt();
 		 		
 								switch(binary2) {
 								
 								case 1:	Decimal(binary);										
 									break;
 								case 2:	Octal(binary);
 									break;
 								case 3: Hexadecimal(binary);
 									break;
 									default:								
 								}
 								break;
 								
 				case 2: System.out.println("Input a Decimal Number");
 				
 						String decimal = s.next();
 						
 						System.out.println("Choose to Convert:");
 						System.out.println("1.| Binary");
 						System.out.println("2.| Octal");
 						System.out.println("3.| Hexadecimal"); 	
 		}}
 		
 	
 		
 		
 		
//----------------------------------------------------------------------------------------	

 		public static void Decimal(String binary) {
 			
 			int decimal = Integer.parseInt(binary, 2);
 			String binary1 = Integer.toString(decimal);
 			System.out.println(binary1);
 		}
 		
 		public static void Octal(String binary) {
 			
 			int Octal = Integer.parseInt(binary, 2); 
 			String binary1 = Integer.toOctalString(Octal);
 			System.out.println(binary1);
 		}

 		public static void Hexadecimal(String binary) {	
 			
 			int Hex = Integer.parseInt(binary, 2); 
 			String binary1 = Integer.toHexString(Hex);
 			System.out.println(binary1);
 		}
 
 //---------------------------------------------------------------------------------------
 		

 }
 		
 		
 		
 	
 	

