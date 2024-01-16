package FinalProject;
import java.util.*;
import java.util.Scanner;
public class FinalProject {
	
	// Basic Hero Costumization
	// BY LORD ANTHONY ACUÑA
	
	
	// Loading Screen 1
	public static String LoadingScreen(String game)	{
		
		game = "  Battle Blade ";
		System.out.println("___()xxxxx[[{:::::::::::>___");
		System.out.println("|                          |");
		System.out.println("|        Welcome To        |");
		System.out.println("|	                   |");
		System.out.println("|     " + game + "      |");
		System.out.println("|            ⚔️            |");
		System.out.println("|__________________________|");
		return game;								}		
	// Enter number to Start 2	
	public static int start(int start) {
	Scanner s = new Scanner(System.in);
	
	 System.out.println("");
	 System.out.println("🗡🗡  Enter  any 1 digit number 🗡🗡");
	 System.out.println("                  to      ");
	 System.out.println("               !!START!!   ");
	 System.out.println("");
	 start = s.nextInt(); 
	 
	 
	 if (start == 1)
		 System.out.println(" ⚔︎ Welcome to the Battle Blade ⚔︎ ");	
	 else
		 System.out.println(" ⚔︎ Welcome to the Battle Blade ⚔︎ ");	
	 return start;					}			
	// choose Gender/Sex 3
	public static void GenderPick(String sex)
	{
	Scanner n = new Scanner(System.in);
	
	System.out.println();
	System.out.println();
	System.out.println("     🚻 Choose your Gender 🚻       ");
	System.out.println("          Male or Female        ");
	sex = n.nextLine();
	
	switch (sex)
	{
	case "Male":
		System.out.println();
		System.out.println("            You are a Male: 🧔🏽‍♂️");
		System.out.println();
		break;
	case "male":
		System.out.println();
		System.out.println("            You are a Male: 🧔🏽‍♂️");
		System.out.println();
		break;
	case "Female": 
		System.out.println();
		System.out.println("👩🏾");
		System.out.println();
		break;
	case "female": 
		System.out.println();
		System.out.println("👩🏾");
		System.out.println();
		break;
	}	}
	// show Character class 4
	public static void Classes(int HeroClass) 
	{
		Scanner n = new Scanner(System.in);
		
		System.out.println();
		System.out.println("         🏹 Choose a Class 🗡️     ");
		System.out.println();
		System.out.println("   1.|🗡️Warrior 2.|🏹Archer 3.|🪄Mage 4.|🪄Healer");
		System.out.println();
		System.out.println(" Type the number to see Class stats you have 5 limit to show" );
		System.out.println();
		
		int limit = 6;
		for (int i = 1; i < limit; i++) {
		
		int Hero1 = n.nextInt();
		System.out.println("      Type the number to see Class stats " + i + " show spent");
		switch(Hero1)
		{
		case 1: System.out.println("Warrior");
				System.out.println("Strength: 4");
				System.out.println("Intellect: 1");
				System.out.println("Endurance: 5");
				System.out.println("Dexterity: 3");
				System.out.println("Wisdom: 2");
				System.out.println("Luck: 1 ");
				break;
		case 2: System.out.println("Archer");
				System.out.println("Strength: 2");
				System.out.println("Intellect: 5");
				System.out.println("Endurance: 3");
				System.out.println("Dexterity: 6 ");
				System.out.println("Wisdom: 1 ");
				System.out.println("Luck: 1");
				break;
		case 3: System.out.println("Mage");
				System.out.println("Strength: 1");
				System.out.println("Intellect: 5");
				System.out.println("Endurance: 3");
				System.out.println("Dexterity: 2 ");
				System.out.println("Wisdom: 2 ");
				System.out.println("Luck: 2");
				break;
		case 4: System.out.println("Healer");
				System.out.println("Strength: 1");
				System.out.println("Intellect: 6");
				System.out.println("Endurance: 4");
				System.out.println("Dexterity: 1 ");
				System.out.println("Wisdom: 4 ");
				System.out.println("Luck: 4");
				break;
		}		
				if (i == 5) {
					System.out.println();
					System.out.println("Done!");
					System.out.println();		}
		}
		}
		
	//pick a class 5 
	public static void Choose(int choose) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		System.out.println("            So you already know the classes");
		System.out.println();
		System.out.println("            Now choose 1 class that you want");
		System.out.println();
		System.out.println("           Pick a number for the chosen Class");
		System.out.println();
		System.out.println("   1.|🗡️Warrior 2.|🏹Archer 3.|🪄Mage 4.|🪄Healer");
		System.out.println();
		
		choose = s.nextInt();
		
		switch(choose)
		{
		case 1:	System.out.println();
				System.out.println("🎉Congratulations🎉" );						
				System.out.println("  You are now a ");
				System.out.println();
				System.out.println("  ⚔️ WARRIOR ⚔️");
				break;
		case 2: System.out.println();
				System.out.println("🎉Congratulations🎉" );						
				System.out.println("  You are now a ");
				System.out.println();
				System.out.println("  🏹 Archer 🏹");
				break;
		case 3: System.out.println();
				System.out.println("🎉Congratulations🎉" );						
				System.out.println("  You are now a ");
				System.out.println();
				System.out.println("  🪄 Mage 🪄");
		break;
		case 4: System.out.println();
				System.out.println("🎉Congratulations🎉" );						
				System.out.println("  You are now a ");
				System.out.println();
				System.out.println("  📖 Healer 📖");
		break;
		}
		
		
		
		
		
		
	}
	//input character name 6
	public static void Name(String name)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		System.out.println("What's your Hero name?");
		name = s.nextLine();
		
		System.out.println("Good Morning " + name );
		System.out.println();
		System.out.println("When is your Birth Year?");
		
		int year = s.nextInt();
		
		if (year == 1990 || year == 2002 || year == 2014 || year == 2026 )
			System.out.println("Your Zodiac sign is Horse");
		else if (year == 1991 || year == 2003 || year == 2015 || year == 2027 )
			System.out.println("Your Zodiac sign is Goat");
		else if (year == 1992 || year == 2004 || year == 2016 || year == 2028 )
			System.out.println("Your Zodiac sign is Monkey");
		else if (year == 1981 || year == 2005 || year == 2017 || year == 2029 )
			System.out.println("Your Zodiac sign is Rooster");
		else if (year == 1982 || year == 2006 || year == 2018 || year == 2030 )
			System.out.println("Your Zodiac sign is Dog");
		else if (year == 1983 || year == 2007 || year == 2019 || year == 2031 )
			System.out.println("Your Zodiac sign is Pig");
		else if (year == 1984 || year == 2008 || year == 2020 || year == 2032 )
			System.out.println("Your Zodiac sign is Rat");
		else if (year == 1985 || year == 2009 || year == 2021 || year == 2033 )
			System.out.println("Your Zodiac sign is Ox");
		else if (year == 1986 || year == 2010 || year == 2022 || year == 2034 )
			System.out.println("Your Zodiac sign is Tiger");
		else if (year == 1987 || year == 2011 || year == 2023 || year == 2035 )
			System.out.println("Your Zodiac sign is Rabbit");
		else if (year == 1988 || year == 2012 || year == 2024 || year == 2036 )
			System.out.println("Your Zodiac sign is Dragon");
		else if (year == 1989 || year == 2013 || year == 2025 || year == 2037 )
			System.out.println("Your Zodiac sign is Snake");
						
	}
	// Outputs
	public static void main(String[] args){
	{
		//1	
		String Game = "yes";
		LoadingScreen(Game);
		//2		
		int start = 1;
		start(start);
		//3
		String sex = "1";
		GenderPick(sex);
		//4
		int Class = 2;
		Classes(Class);
		//5 
		int choose = 3;
		Choose(choose);
		//6
		String name ="2";
		Name(name);
		
	}	
	}		
}



