package Codes_Practice;

public class Array1 {

	public static void main(String[] args) {
		
		//
		byte value1 = 127;
		value1++;
		System.out.println(value1);		
		//
		
		int [][] iArray = {{4,10,25},{16,8,32},{50,1,17}};
		
		for (int x = 0; x < iArray.length; x++) {
			
			for (int y = 0; y < iArray[x].length; y++) {
				
				if (iArray[x][y] < 10)
					break;
				System.out.printf("%d ", iArray[x][y]);
			}
			
		}

	}

}
