import java.util.Scanner;

public class InitialMenuAPP {

	public static void main(String[] args) {
		System.out.println("Welcome to the Bootcamp Movie App!");
		///Scanner sc = new Scanner (System.in);
		
		String command = "";
		
		while (!command.equalsIgnoreCase("3")) {
			System.out.println("MENU"); 	
			System.out.println("1 - Add Actor     ");
			System.out.println("2 - Add Movie     ");
			System.out.println("3 - Exit     ");
			System.out.println();	
			
			command = Console.getString("Command?   ");
			switch (command) {
			case "1":
				System.out.println("Add an Actor:     ");
				
				String firstName = Console.getString("First Name?                 ");
				String lastName = Console.getString("Last Name?                  ");
				String gender = Console.getString("Gender?                     ");
				String birthDate = Console.getString("Birthdate? (YYYY-MM-DD)     ");
				
				
				Actor a = new Actor(firstName, lastName, gender, birthDate);
				System.out.println();
				System.out.println(a.displayContact());
				
				
				break;
			
			case "2":
				
				
				System.out.println();
				String movieTitle = Console.getLine("Title?   ");
				String movieYear = Console.getString("Year?   ");
				String movieRating = Console.getString("Rating?     ");
				String movieGenre = Console.getString("Genre?     ");
				
				Movie m = new Movie(movieTitle, movieYear, movieRating, movieGenre);
				System.out.println();
				System.out.println(m.displayContact());
				
				System.out.println(); 
				
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
