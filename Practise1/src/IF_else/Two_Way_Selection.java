package IF_else;
import java.util.Scanner;
public class Two_Way_Selection {
	
		static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int num;
		
		
		
		System.out.println(" Enter your Grade: ");
		num = sc.nextInt();
		
		if (num >= 85)
			System.out.println("Your Grade is " + num);
		else
			System.out.println(" You didn't pass ");
		
		
		
		
		

	}

}
