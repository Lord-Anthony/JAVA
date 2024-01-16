package Repetition_Looping;
import java.util.*;
public class For_Loop {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
										// simple for loop
	
	/*	int i;
		
		for ( i = 1; i <= 5; i++)
{
	System.out.println("Hello");
	System.out.println("*");
}

	*/
		
										// 2
		/*
		int sum = 0;
		int i;
		int newNum;
		int average;
		
		System.out.println(" Enter number ");
		for (i = 0;i < 5; i++)
		{
			newNum = sc.nextInt();
			sum = sum + newNum;
		}
		average = sum / 5;
		System.out.println("the sum is " + sum);
		System.out.println("the average is " + average);
		*/
		
		for (int i = 0; i < 10; i++)
			System.out.println(i + "");
			System.out.println();
	}

}
