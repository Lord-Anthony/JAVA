package FinalProject;

import java.util.Scanner;

public class try1 {

	public static int start(int start) {
		Scanner s = new Scanner(System.in);
		
		 System.out.println("Enter 1 to start");
		 start = s.nextInt(); 
		 
		 if (start == 1)
			 System.out.println(" Hello");

		 	return start;
			
			}
public static void main(String[] args)
{
	int start = 1;
	start(start);
}
}
