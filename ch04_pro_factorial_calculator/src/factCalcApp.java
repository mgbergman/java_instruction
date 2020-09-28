import java.util.Scanner;

public class factCalcApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to the Factorial Calculator");

		Scanner sc = new Scanner (System.in);
		String choice = "y";
		int i;
		int fact = 1;
		int intCounter = 0;
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter an integer that's greater than 0 and less than 10");
			intCounter = sc.nextInt();
		
			for (i = 1; i <= intCounter; i++ ) {	
				fact = fact * i;
				System.out.println(fact);
				
			}
			System.out.print(fact);
			System.out.println();
			System.out.print("Continue (y/n): ");
			choice = sc.next();
		}
				
					
	}

	
	}

