import java.util.Scanner;

public class diceRollerApp {

	private static void displayWelcome() {
        System.out.println("Dice Roller");
        System.out.println();
	}
	
	private static void displayDoubles() {
			System.out.println("Doubles!!");
	}
	
	private static void displaySnake() {
		System.out.println("Snake Eyes!!");
}
	
	
	public static void main(String[] args) {
		
		displayWelcome();
		Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
		
        	System.out.print ("Roll the dice? y/n    ");
        	choice= sc.next();
        	
        
        	int diceOne = (int) ((Math.random() * 6 + 1));
        	int diceTwo = (int) ((Math.random() * 6 + 1));
        	int diceTot = diceOne + diceTwo;
        
        	System.out.println ("Die 1:   " + diceOne);
        	System.out.println ("Die 2:   " + diceTwo);
        	System.out.println ("Total    " + diceTot);
        	
        	if (diceOne == diceTwo) {
        		displayDoubles();        	
        	}
        	
        	if (diceOne == 1 && diceTwo == 1) {
        		displaySnake();
        	}
        		
        		
        	System.out.println();
            System.out.print("Continue (y/n): ");
            choice = sc.next();
            System.out.println();
           
        }
	
       
	
	
	
	
	
	
	
	
	
	
	}

}
