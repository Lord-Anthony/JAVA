package P1;
import java.util.Scanner;
public class Array3 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

	       int length = scanner.nextInt();

	       int[] array =  new int[length];

	       for (int i = 0; i < length; i++) {
	           array[i] = scanner.nextInt();
	       }

	       //your code goes here

	       int sum = 0;
	       for (int i = 0; i < length; i++) {

	            if (array[i]%4==0){
	                sum+=array[i];
	            }
	       }
	            System.out.println(sum);

	}

}
