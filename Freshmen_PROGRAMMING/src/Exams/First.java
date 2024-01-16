package Exams;
import java.util.*;
public class First {
	
	static Scanner s = new Scanner(System.in);
		
	public static void main(String[]args) {	
		System.out.println("1 or 2");
		int pick = s.nextInt();
		
		int [] a = {2,2,2,2,2,2};
		
		if (pick == 1) {
			System.out.println(addArray(a));
			}
		else {
			System.out.println(" Enter limit: ");
			int limit = s.nextInt();
			System.out.println(addFibo(limit));
			}	
	}
			
	public static int addArray(int a[]) {
		
		int sum = 0;
		
		for (int i : a) {
			  sum += i;
		}
		System.out.println("sum is" + sum );
		return sum;	
	}
	
	
	public static int addFibo(int limit) {
		
		
		int num1 = 0;
		int num2 = 1;
		
		for (int i = 1 ; i <= limit; i++ )
		{				
			System.out.print( num1 +  " ");
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
		return limit;
		
		
	}
	
	
}