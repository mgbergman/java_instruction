import java.util.Scanner;

public class ChangeCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Change Calculator");
		System.out.println();  // print a blank line
		
		
		int tempCents   = 0;
		
		Scanner sc = new Scanner(System.in);
		 String choice = "y";
	        while (choice.equalsIgnoreCase("y")) {
	            System.out.print("Enter number of cents (0-99):   ");
	            tempCents = sc.nextInt();
	            System.out.println();  // print a blank line
	            
	            int numQuarters = 0;
	    		int numDimes    = 0;
	    		int numNickels  = 0;
	    		int numPennies  = 0;
	    
	    		while (tempCents >= 25) {	      
	            		numQuarters = numQuarters + 1;
	            		tempCents = tempCents - 25;	          
	    		}
	           
	    		while (tempCents >= 10) {
	            		numDimes = numDimes + 1;
	            		tempCents = tempCents - 10;	         				    		
	    		}
	            
	           
	            while (tempCents >= 5) {
	            		numNickels = numNickels + 1;
	            		tempCents = tempCents - 5;		           
	            }
	           
	             while (tempCents >= 1) {
	        	   numPennies = numPennies + 1;
	            		tempCents = tempCents - 1;
	            }	

	            System.out.println( "Quarters:   " + numQuarters);
	            System.out.println( "Dimes:      " + numDimes);
	            System.out.println( "Nickels:    " + numNickels);
	            System.out.println( "Pennies     " + numPennies);
	            System.out.println();  // print a blank line
	         
	            
	            System.out.print("Continue (y/n): ");
		            choice = sc.next();
		            System.out.println();
	        } 
	
	            
	}     
	

}

	
