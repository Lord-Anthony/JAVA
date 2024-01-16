package Activities;
import java.util.*;

public class ArrayList1 {
	
	static Scanner s = new Scanner (System.in);
	
	public static void main(String[]args ) {
		
		
		ArrayList <Integer> num = new ArrayList <Integer> ();
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		
		System.out.println("[" + num.get(0) + ", " + num.get(1) + ", " + num.get(2) + ", " + num.get(3) + ", " + num.get(4) + "]");
		System.out.println(num);
		
//		System.out.println("Input limit");
//		int list = s.nextInt();
//		
//		for (int i = 0 ; i < list ; i++) {
//			System.out.println("Input number:");
//			int element = s.nextInt();
//			num.add(element);
//		}
//		for (int j = 0 ; j < num.size() ; j++) {
//			System.out.println(num.get(j));
//		}
//			// or 
//			System.out.println();
//			System.out.println(num);
		
	}

}
