package Activities;
import java.util.Scanner;
public class Act1 {

	static Scanner s = new Scanner(System.in);
		
	public static void main(String[] args) {
			
		// input all items
		
		System.out.println("Input the number of items:");
		double num = s.nextInt();
		
		//passing score
		double pass = num * 0.7;
		
		System.out.println("Passing score is " + pass);
		
		System.out.println("Input your score:");
		double score = s.nextInt();
		
		double mistake = num - score;
		
		if( score > pass)
			System.out.println("Congratulations!! You passed. You have " + mistake + " mistakes. ");
		else
			System.out.println("Sorry, You Failed. You have " + mistake + " mistakes. ");
		

	}	
}
