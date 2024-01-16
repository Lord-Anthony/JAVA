package Activities;

import java.util.Scanner;

public class Act1_2 {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
			
		// input all items
		
		System.out.println("Input the number of items:");
		double num = s.nextInt();
		System.out.println("Passing score is " + findPassingScore(num));
		
		System.out.println("Input your Score: ");
		double score = s.nextInt();
		
		if (score > findPassingScore(num))
		System.out.println("Congratulations!! You have " + findMistakes(score, num) + " mistakes. ");
		else
			System.out.println("sorry!! You have " + findMistakes(score, num) + " mistakes. ");
	}	

	//passing score
	public static double findPassingScore(double num) {
		num *= .7;
		return num;
	}
	
	public static double findMistakes(double score,double num) {
		double mistakes = num - score;		
		return mistakes;
	}
	
}	


