import java.util.Scanner;

public class TableOfPowersApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Squares and Cube table!");

		Scanner sc = new Scanner (System.in);
		
		String choice = "y";
		int integerNumber = 0;
		int integerSquare = 0;
		int integerCube   = 0;
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter an integer   ");
            integerNumber = sc.nextInt();
            System.out.println();  // print a blank line
            int interNumberCounter = 1;
            System.out.println("Number      " + "Square      " + "Cubed     ");
            while (interNumberCounter <= integerNumber) {
            	integerSquare = interNumberCounter * interNumberCounter;
            	integerCube   = interNumberCounter * interNumberCounter * interNumberCounter;
            	System.out.println(interNumberCounter + "            " + integerSquare + "            " + integerCube);
           
            	interNumberCounter ++;
                     	
            }
            System.out.println();
            System.out.print("Continue (y/n): ");
            choice = sc.next();
            System.out.println();
		
		
		
        }
	}

}
