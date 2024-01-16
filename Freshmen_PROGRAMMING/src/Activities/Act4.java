package Activities;
import java.util.*;

public class Act4 {

	
	
public static void main(String []args) {
	
	Scanner s1 = new Scanner(System.in);
	Scanner s2 = new Scanner(System.in);
	
	String [] name = new String [3];
	int [] age = new int[3];	
	
	for (int l = 0 ; l < 3 ; l++) {
		System.out.println("Input Name:");
		name[l] = s1.nextLine();
		System.out.println("Input " + name[l] + "'s Age");
		age[l] = s2.nextInt();
		System.out.println();
	}
	
			
	for (int i = 0 ; i < 3 ; i++) 
	{
		System.out.println(name[i]);
		System.out.println(age[i]);
		System.out.println("");
	}
}
}

