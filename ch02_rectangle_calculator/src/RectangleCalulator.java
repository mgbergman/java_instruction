import java.util.Scanner;

public class RectangleCalulator {

	public static void main(String[] args) {
		 System.out.println("Welcome to the Area and Perimeter Calculator");
	        System.out.println();  // print a blank line

	        Scanner sc = new Scanner(System.in);
	        
	        String choice = "y";
	        while (choice.equalsIgnoreCase("y")) {
	        	
	        	 System.out.print("Enter Length:   ");
	             double recLength = sc.nextDouble();	
	        	
	             System.out.print("Enter width:   ");
	             double recWidth = sc.nextDouble();
	        	
	        	 double recArea;
	        	 double recPerimeter;
	        	 
	        	 recArea = recLength * recWidth;
	        	 recPerimeter = (recLength * 2) + (recWidth * 2);
	        	 
	        	   String message = "Area: " + recArea + "\n"
                           + "Perimeter  " + recPerimeter + "\n";
                                
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
	        }
	}

}
