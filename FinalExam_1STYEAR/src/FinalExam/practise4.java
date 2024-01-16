package FinalExam;
import java.util.*;
public class practise4 {

	public static void showGreetings(String firstname) {
		
		String msg = " Welcome ";
		
		msg += firstname.substring(0,1).toUpperCase()+ firstname.substring(1).toLowerCase();
		
		System.out.println(msg);
	}

	public static void main (String [] args) {
		
		
		String firstname = "lnthony";		
			showGreetings(firstname);
		
				
		
	}
		
			
	}
		
		
	
