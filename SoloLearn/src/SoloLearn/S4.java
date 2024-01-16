package SoloLearn;
import java.util.Scanner;
import java.util.*;
public class S4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double amount = scanner.nextInt();
		
		for (int i = 0; i < 3; i++ )
		{
			double arrears = amount*0.1;
			amount = amount - arrears;
		}
		System.out.println((int)amount);
	}

	}



	
