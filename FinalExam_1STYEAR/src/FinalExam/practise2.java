package FinalExam;

public class practise2 {

	public static void main(String[] args) {
		
		String firstname = "Christoper";
		firstname = firstname.substring(0,5);
		
		//String output = String.format("%s is %d characters long", firstname,firstname.length());
				//System.out.println(output);
		
		String output = (firstname + " is " + firstname.length() + " characters long ");
			      System.out.println(output);
		

	}

}
