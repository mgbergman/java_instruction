import java.util.Scanner;

public class greatestCommonDivisor {

	public static void main(String[] args) {
		
		System.out.println("Greatest Divisor!");
		Scanner sc = new Scanner (System.in);
	
		
		int commonDiv = 0;
		String choice = "y";
	
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter first number:    ");
			int xNumber = sc.nextInt();
			System.out.print("Enter second number:    ");
			int yNumber = sc.nextInt();
			
			while (xNumber > 0) {
				while (yNumber >= xNumber) {
					yNumber -= xNumber;
				}		
					commonDiv = yNumber;
					yNumber = xNumber;
					xNumber = commonDiv;
	
					
				}
			System.out.println(yNumber);
			System.out.println("Continue? (y/n)");
			choice = sc.next();
            System.out.println();
			
			}	
		
		
		}
}
		


