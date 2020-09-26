import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class interestCalculatorApp {

	public static void main(String[] args) {
	
		System.out.println("Welcome to the Interest Calculator");
		System.out.println();  // print a blank line
		
		double loanAmt = 0;
		double intRate = 0;
		double totInt = 0;
		Scanner sc = new Scanner(System.in);
		 String choice = "y";
	        while (choice.equalsIgnoreCase("y")) {	
	        	System.out.print("Enter loan amount:    ");
	            loanAmt = sc.nextDouble();
	            System.out.print("Enter interest rate:  ");
	            intRate = sc.nextDouble();
	            System.out.println();
	            
	            NumberFormat currency = NumberFormat.getCurrencyInstance();
	            String loanString = currency.format(loanAmt);
	            	System.out.println("Loan Amount:          " + loanString);
	            
	            NumberFormat percent = NumberFormat.getPercentInstance();
	            percent.setMaximumFractionDigits(3);
	            String intString = percent.format(intRate);
	            		System.out.println("Interest Rate:        " + intString);	
	            
	            BigDecimal loanBD = new BigDecimal(loanAmt);
	            BigDecimal intBD = new BigDecimal(intRate);
	 
	            //System.out.println(loanBD);
	           // System.out.println(intBD);
	            
	            BigDecimal totBD = loanBD.multiply(intBD)
	              .setScale(2, RoundingMode.HALF_UP);
	            
	            String interestString = currency.format(totBD);
	            
	    		System.out.println("Interest:             " + interestString + "\n");
	    		
	    		System.out.print("Continue (y/n): ");
	            choice = sc.next();
	            System.out.println();
	            
		
	        }
	        
	        System.out.println("Thank you for playing       ");
	}
	
}
		
		
		

	

