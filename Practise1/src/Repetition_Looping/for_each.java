package Repetition_Looping;
import java.util.Scanner;
public class for_each {

	public static void main(String[] args) {
		
		//The enhanced for loop (sometimes called a "for each" loop) is used to traverse elements in arrays.
		
	/*	int[ ] primes = {2, 3, 5, 9};
        
        for (int t: primes) {
            System.out.println(t);  
            
            */
            
            Scanner scanner = new Scanner(System.in);
            
            int length = scanner.nextInt();
            int[] sides =  new int[length];
            
            for (int i = 0; i < length; i++) {
                sides[i] = scanner.nextInt();
           
           System.out.println(sides[i]*sides[i]);

	}

}
}
