package IF_else;
import  java.util.Scanner;
public class Multiple_Selections {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		
		double balance;
		double interestrate;
		double Interest;
		
		System.out.println("Enter your Balance: ");
		balance = sc.nextDouble();
		
		if (balance >= 50000.00)
			interestrate = 0.05;
		else if 
			(balance >= 25000.00)
			interestrate = 0.04;
		else if
			(balance >=  10000.00)
			interestrate = 0.03;
		else 
			interestrate = 0.00;
		
		Interest = balance * interestrate;

		System.out.println("Your Interest is " + Interest);

	}

}
