import java.text.NumberFormat;
import java.util.Scanner;

public class tipCalculatorApp {

	public static void main(String[] args) {
	
		System.out.println("Tip Calculator");
		Scanner sc = new Scanner (System.in);
		String choice = "y";
		double mealTip;
		double totalCost;
		
		
		  while (choice.equalsIgnoreCase("y")) {
	            System.out.print("Cost of meal:   ");
	            double mealCost= sc.nextDouble();
	            mealTip = mealCost * .15;
	            totalCost = mealCost + mealTip;
	            System.out.println();
	            System.out.println("15%");
	            
	            NumberFormat currency = NumberFormat.getCurrencyInstance();
	            String tipCost = currency.format(mealTip);
	            
	            NumberFormat currency1 = NumberFormat.getCurrencyInstance();
	            String totalCostCurr = currency1.format(totalCost);
	            
	            System.out.println("Tip Amount     " +  tipCost );
	            System.out.println("Total Amount   " + totalCostCurr );
	            System.out.println();
		  
	            mealTip = mealCost * .20;
	            totalCost = mealCost + mealTip;
	            System.out.println("20%");
	            
	            NumberFormat currency11 = NumberFormat.getCurrencyInstance();
	            String tipCost1 = currency11.format(mealTip);
	            
	            NumberFormat currency111 = NumberFormat.getCurrencyInstance();
	            String totalCostCurr1 = currency111.format(totalCost);
	            
	            System.out.println("Tip Amount     " +  tipCost1 );
	            System.out.println("Total Amount   " + totalCostCurr1 );
	            System.out.println();
	            
	            mealTip = mealCost * .25;
	            totalCost = mealCost + mealTip;
	            System.out.println("25%");
	            
	            NumberFormat currency1111 = NumberFormat.getCurrencyInstance();
	            String tipCost11 = currency1111.format(mealTip);
	            
	            NumberFormat currency11111 = NumberFormat.getCurrencyInstance();
	            String totalCostCurr11 = currency11111.format(totalCost);
	            
	            
	            System.out.println("Tip Amount      " +  tipCost11 );
	            System.out.println("Total Amountt   " + totalCostCurr11 );
	            
	              System.out.println();
	              System.out.print("Continue (y/n): ");
	              choice = sc.next();
	              System.out.println();
		  }  
		  
		
		 }

}
