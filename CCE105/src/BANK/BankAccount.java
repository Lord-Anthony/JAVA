package BANK;

import java.util.*;

public class BankAccount{

static Scanner console = new Scanner(System.in);
 float acclimit = (float) 0.00;
 public void bankaccount(){ acclimit = 10000; }
 public void Deposit(float gallons) { acclimit = acclimit + gallons; }
 public void Withdraw(float gallons) { acclimit = acclimit - gallons; }
 public float Account_Balance() { return acclimit; }
 public boolean isMoreThanLimit() { if (acclimit == 250000) return true; else return false; }
 public boolean isLessThanLimit() { if (acclimit == 0.00) return true; else return false; }
 
 
 
 public static void main(String[] args) {
 BankAccount bankacc = new BankAccount();
int choice; char Ans;
 float money;
 
 
 
 do {
	 
System.out.println("=======Bank Account=======");
System.out.println("You have " + bankacc.Account_Balance()+ " in your Bank Account");
System.out.println("Bank account Empty: "+ bankacc.isMoreThanLimit());
System.out.println("Bank account in limit : " + bankacc.isLessThanLimit());
System.out.println("\n\n");
System.out.print("MENU OPTIONS\n");
System.out.print("[1] Deposit \n");
System.out.print("[2] Withdraw \n");
System.out.print("[3] Exit \n");
System.out.print("Select <1,2,3> : ");
choice = console.nextInt();



//condition
		switch(choice){
				case 1:
					System.out.println("You have "+ bankacc.Account_Balance()+ " money in you Bank Account");
					System.out.print("Enter Deposit Value: ");
					money = console.nextFloat();
				if (money+bankacc.Account_Balance()>250000)
						System.out.println("Your Balance is on limit");
				else bankacc.Deposit(money);
					break;
					
				case 2:
					System.out.println("You have "+ bankacc.Account_Balance() + " money in you Bank Account");
					System.out.print("Enter Withdraw Value: ");
					money = console.nextFloat();
				if (bankacc.Account_Balance() - money < 0) System.out.println("You have no balance in your Bank Account");
				
				else bankacc.Withdraw(money);
					break;
					
				case 3: System.exit(0);


}

System.out.print("\n\n");
System.out.print("Try again? Press Y or y: ");
Ans = console.next().charAt(0);

} while(Ans == 'y' || Ans == 'Y');
 
 }
 
 }
