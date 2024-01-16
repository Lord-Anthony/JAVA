package Activities;
import java.util.Scanner;

public class Act5 {
	
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String []args) {
			
		int countv = 0;
		int countc = 0;
		int digits = 0;
		
		System.out.println("Enter the string: 1 lov3 Pr0&ramm!n6");
		String string = s.nextLine();	
		
		findVowels(countv,string,countc,digits);
	}
	
	public static void findVowels (int countv,String string,int countc,int digits) {
		
		for (int i = 0; i < string.length(); i++) {
			
			string  = string.toLowerCase();
			char ch = string.charAt(i);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					countv++;
			}
				else if ((ch >= 'a' && ch <= 'z'))
					countc++;
			
					else if ( ch >= '0' && ch <= '9')
					digits++;
			}
		
		System.out.println("Vowels: " + countv);
		System.out.println("Consonants: " + countc);
		System.out.println("digits: " + digits);
	}
}
