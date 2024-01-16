package Activities;
import java.util.Scanner;
public class Act3 {
static Scanner s = new Scanner(System.in);

public static void main(String[] args) {
	
	System.out.println("Input Limit:");
	int limit = s.nextInt();
	
	System.out.println("Input Starting Number:");
	int a = s.nextInt();
	
	for(int i =1 ; i <= limit ; i++) {
	System.out.print( a + " ");
	a+=2;
	}
}
}

