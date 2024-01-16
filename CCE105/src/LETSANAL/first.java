package LETSANAL;

 
import java.util.*;
import java.util.Arrays;

 

public class first {

private String[] StackArray;   //accepts any characters

                  private int stackSize;           //stack size

                  private int topOfStack = -1;    //indicates an empty stack

				private String input;

                  

                  first(int size){    //construct a stack

                             

                             stackSize = size;

                             StackArray = new String[size];

                             Arrays.fill(StackArray, "-1");

                  }

                  public void displayTheStack(){

                             for(int i=0; i<45;i++) { System.out.print("=");} System.out.print("\n");

                                                            

                             for(int i = 0; i < 10; i++){

                                             System.out.print("| " + StackArray[i]);

                             }

                             System.out.print("|\n");

                             for(int i=0; i<45;i++) { System.out.print("=");} System.out.print("\n");

                  }

                  

                  public void push(String input){

                           
							if (topOfStack < stackSize){

                                             topOfStack++;

                                             StackArray[topOfStack] = input;

                             }

                                             else {System.out.println("Sorry but the stack is full.");

                                                             displayTheStack();

                                                             System.out.println("PUSH " + input + " was added to the stack.");

                                         }

                             }

                                             

        public String pop() {

                 if(topOfStack >= 0) {

                     displayTheStack();

                     System.out.println("POP " + StackArray[topOfStack] + " was removed from the Stack.\n");

                     StackArray[topOfStack] = "-1";

                     return StackArray[topOfStack--];

                  } else

                                  

                               {

                                 displayTheStack();

                                 System.out.println("Sorry but the stack is empty.");

                                 return "-1";

                                 }           

                 }

  

   public String peek() {

              displayTheStack();

              System.out.println("PEEK " + StackArray[topOfStack] + " is at the top of the stack.\n");

              return StackArray[topOfStack];

   }

  

   public void pushMany(String multipleValues)  {

              String[] tempString = multipleValues.split(" ");

              for(int i = 0; i < tempString.length; i++)  {

                              pushMany(tempString[i]);

              }

    }

   

 public void popAll() {

              for(int i = topOfStack; i >= 0; i--) {

                              pop();

              }

   }

   

public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
    first thestack = new first(10);
    int choice;
    boolean exit = false;

    while (!exit) {
        System.out.println("Choose an option:");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Display");
        System.out.println("4. Push Many");
        System.out.println("5. Pop All");
        System.out.println("6. Peek");
        System.out.println("7. Exit");

        choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                System.out.print("Enter the element to push: ");
                String input = scanner.nextLine();
                thestack.push(input);
                break;
            case 2:
                thestack.pop();
                break;
            case 3:
                thestack.displayTheStack();
                break;
            case 4:
                System.out.print("Enter multiple values separated by spaces: ");
                String values = scanner.nextLine();
                thestack.pushMany(values);
                break;
            case 5:
                thestack.popAll();
                break;
            case 6:
                thestack.peek();
                break;
            case 7:
                exit = true;
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }
}
}
