import java.util.Scanner;

public class GradeConverter {

	public static void main(String[] args) {
		 
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
		
		
		System.out.println("Welcome to the Letter Grade Converter");
	        System.out.println();  // print a blank line
	        System.out.println();  // print a blank line
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter numerical grade:      ");
            int grade = sc.nextInt();

           
            String letterGrade;
            if (grade >= 87) {
                letterGrade = "A";
            }
            else if (grade >= 79) {
            	letterGrade = "B";
            } else if (grade >= 66) {
                letterGrade = "C";
            } else if (grade >= 59) {
            	letterGrade = "D";
            }	else letterGrade = "F";
            
            
            System.out.print("Letter grade:  " + letterGrade + "\n"); 
           
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
          
            }
	}  

	}


