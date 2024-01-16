package Activities;
import java.util.*;

public class ArrayPrac {

	static Scanner s = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter size:");
		int size = s.nextInt();
		
		int array1 [] = new int [size];
		
		int k = 1;
			
		for (int i = 0; i < size ; i++) {
			System.out.println("Enter #" + k + ":");
			array1[i] = s.nextInt();				
			k++;		
		}
		for (int l = 0; l < array1.length; l++) {
		System.out.print(array1[l] + ",");
		}
		System.out.println("");
		System.out.println("[A] Sum: " + add(array1,size));
		System.out.println("[B] Max & Min: " + larger(array1,size) + "," + smaller(array1,size));
		System.out.println("[C] Average: " +  average(array1,size));
		System.out.println("[D] Number that ends with 1: " + end(array1,size));
		System.out.println("[E] Even, Odd: " + even(array1,size) +","+ odd(array1,size));
	}

public static int add(int array1[] , int size){
			int sum = 0;
		for (int i : array1 ) {
			sum += i;		
		
	}
			return sum;
}

public static int larger(int array1[],int size) {
		
		int larger = array1[0];
		
		for (int i = 0 ; i < size; i++) {
				if (larger < array1[i])
					larger = array1[i];	
					
	}
		return larger;
	}

public static int smaller(int array1[],int size) {
		
		int smaller = array1[0];
		
		for (int i = 0 ; i < size; i++) {
				if (smaller > array1[i])
					smaller = array1[i];	
					
	}
		return smaller;
	}

public static int average(int array1[], int size) {
		int average = 0;
		
		return add(array1,average)/ size;
}

public static int end(int array1[],int size) {
	int end = 0;
	
	for (int i = 0; i < size; i++) {
			int last = array1[i] % 10; 
			if (last == 1)
			end++;
}			
	return end;
}

public static int even(int array1[],int size) {
	int even = 0;
	
	for (int i = 0; i < size; i++) {
		int number = array1[i] % 2;
		if (number == 0) {
 			even++;
		}
	}	
	return even;
}

public static int odd(int array1[],int size) {
	int odd = 0;
	
	for (int i = 0; i < size; i++) {
		int number = array1[i] % 2;
		if (number != 0) {
			odd++;
		}
	}
	
	return odd;	
}

}

