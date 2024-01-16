package FINAL;

import java.awt.Color;
import java.awt.Font;
import java.lang.System.Logger;

import javax.swing.JFrame;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class Main {

	public static void main(String[] args) {
		
		UserPassword userpassword = new UserPassword(); // instance of user and pass
		
		
		
		
		LoginPage loginpage = new LoginPage (userpassword.getLogin()); // instance of login
		
		
	}

}

