package Repetition_Looping;

public class Matrix {

	public static void main(String[] args) {
		
		int[][] matrix = {
	               {8, 1, 6},
	               {3, 5, 7},
	               {4, 9, 0},
	       };
	       //output the numbers

	       for (int i = 0; i < 3; i++){
	    	   for (int j = 0; j <3 ; j++) {

	           System.out.println(matrix[i][j]);
	       }
	       }

	       int array[ ][ ] =  {{3, 5, 8}, {7, 54, 1, 12, 4}}; 
	       System.out.println(array[0][2]);
	}

}
