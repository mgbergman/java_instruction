import java.math.BigDecimal;
import java.text.NumberFormat;

import ui.console.Console;

public class BattingAverageCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Batting Average Calculator");
		
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			int atBats = Console.getInt("Enter number of times at bat:");
			
			System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home\r\n"
					+ "run\r\n"
					+ "");
			
			
			int numBat = 1;
			int hits = 0;
			int bases = 0;
					
			
			for (int i =1; i < atBats + 1; i ++) {
				int eachBat = Console.getInt("Result for at-bat " + i + ":", 0, 4);
				
				if (eachBat > 0) {
					hits = hits + 1;
					bases = bases + eachBat;
					
				}
				else {
					hits = hits;
					bases = bases;
					
				}
				
				}
			
			
			
			double battingAvg = (double) hits / atBats;
			double slugAvg = bases / atBats;
			
			battingAvg = (double) Math.round(battingAvg * 10000) / 10000;
			slugAvg = (double) Math.round(slugAvg * 1000) / 1000 ;
			
			System.out.println("Batting average:   " + battingAvg);
			System.out.println("Slugging percent:  " + slugAvg);
			
			
			choice = Console.getChoiceString("Continue (y/n)", "y", "n");
		}
		
		
		
		
		
		System.out.println("Bye");

	}

}
