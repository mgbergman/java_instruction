import java.util.Scanner;

public class InvoiceApp {

    public static void main(String[] args) {
        // welcome the user to the program
        System.out.println("Welcome to the Invoice Total Calculator");
        System.out.println();  // print a blank line

        // create a Scanner object named sc
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int numInvoices = 0;
        double avgInvoice = 0;
        double avgDiscount = 0;

        // perform invoice calculations until choice isn't equal to "y" or "Y"
        String choice = "y";
        while (!choice.equalsIgnoreCase("N")) {
            // get the invoice subtotal from the user
            System.out.print("Enter subtotal:   ");
            double subtotal = sc.nextDouble();

            // calculate the discount amount and total
            double discountPercent;
            if (subtotal >= 500) {
                discountPercent = .25;
            }
            else if (subtotal >= 200) {
                discountPercent = .2;
            } else if (subtotal >= 100) {
                discountPercent = .1;
            } else {
                discountPercent = 0.0;
            }
                    
            double discountAmount = subtotal * discountPercent;
            double total = subtotal - discountAmount;
            numInvoices = numInvoices + 1;
            avgInvoice = total + avgInvoice;
            avgDiscount = avgDiscount + discountAmount;
            

            // display the discount amount and total
            String message = "Discount percent: " + discountPercent + "\n"
                           + "Discount amount:  " + discountAmount + "\n"
                           + "Invoice total:    " + total + "\n";
                      
            
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
            
         
         
        }
        
        String message2 = "Number of Invoices    " + numInvoices + "\n"
				+ "Average Invoice     "	  + avgInvoice/numInvoices + "\n"
				+ "Average Discount    "   + avgDiscount/numInvoices + "\n";
        	System.out.println(message2);
        
    } 
    
}