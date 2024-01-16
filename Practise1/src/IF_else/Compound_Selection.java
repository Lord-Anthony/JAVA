package IF_else;
import java.util.Scanner;
public class Compound_Selection {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int age;
		
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		
		if (age >= 18)
		{
			System.out.println("Eligible to Vote");
			System.out.println("No Longer a Minor");
		}
		else 
		{
			System.out.println("Not eligible to Vote");
			System.out.println("Still a minor");
		}
		

	}

}
