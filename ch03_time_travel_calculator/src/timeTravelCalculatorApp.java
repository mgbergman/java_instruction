import java.util.Scanner;

public class timeTravelCalculatorApp {

	public static void main(String[] args) {
		
		System.out.println ("Welcome to the Travel Time Calculator");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		int totMiles = 0;
		int milesPerHour = 0;
		int totHours = 0;
		double totMinutes = 0;
	        while (choice.equalsIgnoreCase("y")) {
	      
	        	
	        	
	        	System.out.print("Enter Miles:                ");
		            totMiles = sc.nextInt();
		         System.out.println(); 
		         System.out.print("Enter miles per hour:       ");
		         	milesPerHour = sc.nextInt();
		         	
		         	while (totMiles >= milesPerHour) {
		         		totHours ++;
		         		totMiles = totMiles - milesPerHour;
		         		System.out.println(totHours);
			         	System.out.println(totMiles);	
		         		
		         	}
		         	
		         	totMinutes = (totMiles / milesPerHour) *60 ;
		         	
		         	System.out.println(totHours);
		         	System.out.println(totMinutes);
	        	
	        	
	        	
	        	
	        	
	        }

	}

}
