import java.util.Scanner;

public class InitialMenuAPP {

	public static void main(String[] args) {
		System.out.println("Welcome to the Bootcamp Movie App!");
		Scanner sc = new Scanner (System.in);
		String firstName;
		String lastName;
		String gender;
		String birthDate;
		String movieTitle;
		String movieYear;
		String movieRating;
		String movieGenre;
		String command = "";
		
		while (!command.equalsIgnoreCase("3")) {
			System.out.println("MENU"); 	
			System.out.println("1 - Add Actor     ");
			System.out.println("2 - Add Movie     ");
			System.out.println("3 - Exit     ");
			System.out.println();	
			System.out.print("Command:  ");
			command = sc.next();
			switch (command) {
			case "1":
				System.out.println("Add an Actor:     ");
				System.out.print("First Name?                 ");
				firstName = sc.next();
				System.out.print("Last Name?                  ");
				lastName = sc.next();
				System.out.print("Gender?                     ");
				gender = sc.next();
				System.out.print("Birthdate? (YYYY-MM-DD)     ");
				birthDate = sc.next(); 
				System.out.println();
				System.out.print("Actor Summary:  ");
				System.out.print(firstName + " " + lastName + ", " + gender + ", born " + birthDate); 
				System.out.println(); 
				System.out.println(); 
				break;
			
			case "2":
				
				System.out.print("Title?              ");
				movieTitle = sc.next();
				System.out.print("Year?               ");
				movieYear = sc.next();
				System.out.print("Rating?             ");
				movieRating = sc.next();			
				System.out.print("Genre?              ");
				movieGenre = sc.next();
				System.out.println(); 
				System.out.println("Movie Summary:  ");
				System.out.println(movieTitle + " " + "(" + movieRating + ") " + "was released in " + movieYear + ".");
				System.out.println("Genre(s): " + movieGenre);
				System.out.println(); 
				break;	
			
			case "3":
				System.out.println(); 
				System.out.println("Bye!");
				break;	
			
			case "x":
			case "X":
				break;
	
		}
	}

	}
	}
