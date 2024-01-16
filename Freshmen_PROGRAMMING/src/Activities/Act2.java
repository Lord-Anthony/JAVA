package Activities;
import java.util.*;
import java.util.InputMismatchException;
public class Act2 {

	static Scanner s = new Scanner(System.in);
	 	 
	private static double putUserNum() 	 	{ 
	 
	double userNum = 0;
	boolean Error = true;
	while(Error) {
	 
	try {	
	
	userNum = s.nextDouble();	
	Error = false;
	} 	 
	catch (InputMismatchException e) {
	System.out.println("Please Try Again!!");
	s.nextLine();
	}
	
	catch (Exception e) {
	System.out.println("Error");
	s.nextDouble();
	}
	}	 
	return userNum;	
	}
	
	
	
	 
	static double areaOfCircle(double radius) { 	 
	double pie = 3.14159;	 
	double circle = radius * pie;	 
	return circle;	 
	}
	
	static double area(double Length,double Width) {	 
	double rectangle = Length * Width;	 
	return rectangle;	 
	}
	 
	 
	static double area(double Length) {	 
	double square = Length + Length + Length + Length;	 
	return square;	 
	}	 
	 
	static double areaOfTriangle(double base,double height) {	 
	double halfbase = 1/2 * base;	 
	double triangle = halfbase * height;	 
	return triangle;	 
	}		 

	
	public static void main(String[]args) {	 	 
	 
	System.out.println("Area of the Figure Calculator");
	System.out.println("1]Area of the Circle 2]Area of the Rectangle 3] Square 4] Triangle");
	int menu =(int) putUserNum();
	
	switch(menu) {	 
	
	case 1: System.out.println("Input Radius:");	 
	double radius = putUserNum();
	System.out.println("The Area of the Circle is " + area(radius));
	break;
	 
	case 2: System.out.println("Input the Length:");	 
	double Length = putUserNum();
	System.out.println("Input the Width:");
	double Width = putUserNum();
	System.out.println("The Area of the Rectangle is " + area(Length,Width)); 
	break;
	 
	case 3 :System.out.println("Input Side Length:"); 
	Length = putUserNum();
	System.out.println("The Area of the Square is " + area(Length));
	break;
	 
	case 4 :System.out.println("Input Base:");
    double base = putUserNum();
	System.out.println("Input Height:");	 
	double height = putUserNum();
	System.out.println("The Area of the Traingle is " + area(base,height));
	break;
	 
}	
	}
}
	

