import java.util.InputMismatchException;
import java.util.Scanner;

public class rectangleCalulatorValidated {
	
	 public static double checkRecLength(double recLength) {	
		Scanner sc = null;
		try {
        	 System.out.print("Enter Length:   ");
             recLength = sc.nextDouble();
         }
         catch (InputMismatchException e) {
        	System.out.print("Error");
        	System.out.println();
        	sc.next(); 
         }
		return recLength;
	    }
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Area and Perimeter Calculator");
        System.out.println();  // print a blank line

        Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {	
             double recLength = 0;
             
             checkRecLength;
             
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
