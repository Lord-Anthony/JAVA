package Practise01;
import java.util.*;
public class try1 {
	
	public static void main(String[] args)
	{
		
		String password;
		String Username; 
		
		
		Scanner Input = new Scanner (System.in);
		
		System.out.println("Type the Username:");
		Username = Input.nextLine();
		// input username
		
		System.out.println("Type the Password:");
		password = Input.nextLine();
		// input password
		
		if ( Username.equals("Tite")&& password.equals("Dako"))
		{
			System.out.println("Access Allowed");
		}
		else 
		{
			System.out.println("Access Denied");
		}
		// if else statement
	}

}
