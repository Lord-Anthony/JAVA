package Examination;

public class EXAM2_2 {

	public static void main(String[] args) 
	{
		int num1;
		int num2;
		int num3;
		
		num1 = 2;
		num2 = 4;
		num3 = 6;
		
		System.out.println( num1 != num2 );
		System.out.println( num2 == num3 );
		
		if (!( num3 >= num1 && num2 >= num3 ))
			if ( num3 <= num1 || num1 == num2 )
		{
			System.out.println("True");
		}
			else
			{
				System.out.println("False");
			}
		

	}

}
