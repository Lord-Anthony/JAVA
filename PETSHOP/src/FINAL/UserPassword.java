package FINAL;
import java.util.HashMap;

public class UserPassword {
	
	HashMap <String,String> Login = new HashMap <String,String> ();  // create Hashmap
	
	UserPassword(){
		
		Login.put( "Pet" , "Shop" ); // input the right user and password
				
	}
	
		protected HashMap getLogin(){  // method to call the hashmap method
			return Login;
			
			
		}
}
