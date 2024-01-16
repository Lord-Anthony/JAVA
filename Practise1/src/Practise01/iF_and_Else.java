package Practise01;
import java.util.Scanner;
public class iF_and_Else {

	public static void main(String[] args) {
		
		
		int num1;
		
		Scanner Input = new Scanner(System.in);
		System.out.println("Multiply 2 by 2 is? ");
		num1 = Input.nextInt();
		
		if ( num1 == 4)
		{
		System.out.println("Correct");
		}
		else 
		{
		System.out.println("Wrong");
		}

	}

}
