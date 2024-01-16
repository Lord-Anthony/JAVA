package P1;

public class Try3 {

	public static void main(String[] args) {
		
		int[] arr  = {1,2,3,4,5,6,7,8};
		
		// length of the array
		System.out.println(arr.length);

		// sum of all elements in an array
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		System.out.println(sum);
	}

}
