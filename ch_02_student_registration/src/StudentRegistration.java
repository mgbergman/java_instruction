import java.util.Scanner;

public class StudentRegistration {

	public static void main(String[] args) {
		 // display operational messages
        System.out.println("Student Registration Form");
        
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first name:   ");
        String firstName = sc.next();
		
        System.out.println("Enter last name:   ");
        String lastName = sc.next();
		
        System.out.println	("Enter year of birth:   ");
        int yrBirth = (int) sc.nextDouble();
		
		
        System.out.println("Welcome    " + firstName + " " + lastName + "\n");
        System.out.println("Your registration is complete" + "\n");
        System.out.println("Your temporary password is:   " + firstName + "*" + yrBirth);
		
		
		
		
		
		
		
		
		
		
		

	}

}
