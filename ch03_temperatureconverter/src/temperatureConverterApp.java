import java.text.NumberFormat;
import java.util.Scanner;

public class temperatureConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Converter");
		System.out.println();  // print a blank line
		
		double tempF = 0;
		double tempC = 0;
		Scanner sc = new Scanner(System.in);
		 String choice = "y";
	        while (choice.equalsIgnoreCase("y")) {
	            System.out.print("Enter degrees in Fahrenheit ");
	            tempF = sc.nextDouble();
	            tempC = (tempF - 32) * 5/9;
	             
	      
	      
	             
	        NumberFormat number = NumberFormat.getNumberInstance();
	        number.setMaximumFractionDigits(2); 
	        String tempCString = number.format(tempC);
	        
	          System.out.println( "Degrees in Celsius   " + tempCString + "\n");
	          System.out.print("Continue (y/n): ");
	            choice = sc.next();
	            System.out.println();
	        }
	        
	        }
	       
	        
	}


