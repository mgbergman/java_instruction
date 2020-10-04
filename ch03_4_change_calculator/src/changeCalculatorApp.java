import java.util.Scanner;

public class changeCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Change Calculator");
		String choice = "y";
		int tempCents = 0;
		 while (choice.equalsIgnoreCase("y")) {
			 int numQuarters = 0;
			 int numDimes = 0;
			 int numNickles = 0;
			 int numPennies = 0;
			 
			 
			 
			 Scanner sc = new Scanner(System.in);
			 	System.out.print("Enter number of cents (0-99):   ");
	            tempCents = sc.nextInt();
	            while (tempCents >= 25) {
	            	numQuarters ++;
	            	tempCents = tempCents - 25;
	            }
	            while (tempCents >=10) {
	            	numDimes ++;
	            	tempCents = tempCents - 10;
	            }
	            while (tempCents >=5) {
	            	numNickles ++;
	            	tempCents = tempCents - 5;
	            }
	            numPennies = tempCents;
	            
	            System.out.println(numQuarters + " " +numDimes + " " + numNickles + " " + numPennies);
	            
	            
		
		
		
		
		
		
		
		
		
		System.out.println("Bye");
		 }
	}

}
