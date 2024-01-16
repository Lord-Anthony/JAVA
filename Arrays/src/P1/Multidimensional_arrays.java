package P1;

public class Multidimensional_arrays {

	public static void main(String[] args) {
		
		/*
		 
		  int[ ][ ] sample = { {1, 2, 3}, {4, 5, 6} }; 
        int x = sample[1][0];
        System.out.println(x); 
        
        */
		
		
		/*
		 
		 String array[ ][ ] =  { {"Hey", "John", "Bye"},
				{"John", "Johnson", "Hello"} }; 
				System.out.println(array[1][1]);
		*/
		
		
		
		int[ ][ ] myArr = { {1, 2, 3}, {4}, {5, 6, 7} };
        myArr[0][2] = 42;
        int x = myArr[1][0];
        
        System.out.println(x);
	}
	

}
