package Repetition_Looping;
import java.util.Scanner;
public class EOF_Controlled_WhileLoop {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int sum = 0;
		int num;
		
		System.out.println("butang number"); 
		
		while(sc.hasNext())
		{
			num = sc.nextInt();
			sum = sum + num;
		}
System.out.printf("Sum = %d%n", sum );
	}

}

