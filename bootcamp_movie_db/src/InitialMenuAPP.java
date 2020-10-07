import java.util.Arrays;
import java.util.Scanner;

import business.Product;
import ui.console.Console;

public class InitialMenuAPP {
	private static Actor[] actor = new Actor[100];
	public static void main(String[] args) {
		System.out.println("Welcome to the Bootcamp Movie App!");
		
		actor[0] = new Actor(0, "Marc", "Bergman", "Male", "12-23-1960");
		actor[1] = new Actor(1, "Harrison", "Ford", "Male", "01-01-1950");
		actor[2] = new Actor(2, "Katrina", "Bowling", "Female", "10-25-1972");
		
		String command = "";
		
		while (!command.equalsIgnoreCase("3")) {
			System.out.println("MENU"); 	
			System.out.println("1 - Add Actor     ");
			System.out.println("2 - Add Movie     ");
			System.out.println("3 - Exit     ");
			System.out.println("4 - List Actor");
			System.out.println("5 - Find Actor");
			System.out.println();	
			
			command = Console.getString("Command?   ");
			switch (command) {
			case "1":
				System.out.println("Add an Actor:     ");
				
				int actorID = Console.getInt("Actor ID?                ");
				String firstName = Console.getString("First Name?                 ");
				String lastName = Console.getString("Last Name?                  ");
				String gender = Console.getString("Gender?                     ");
				String birthDate = Console.getString("Birthdate? (YYYY-MM-DD)     ");
				
				Actor a = new Actor(actorID, firstName, lastName, gender, birthDate);
				
				actor = Arrays.copyOf(actor, actor.length + 1);
				
				
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
				
			case "4":
				for (Actor i : actor)  {
					System.out.println(i);
				}
				break;
				
			case "5":
			String code="";
			
			while (!code.equalsIgnoreCase("x")) {
				System.out.println("Search for a Actor");
				code = Console.getString("Enter id:    ");
				Actor a1 = getActor(code);
				if (a1!=null ) {
					System.out.println("Actor not found    " + a1);
					
				}
				else {
					System.out.println("No Product Found");
					
				}
		}
	}

	}
	}
	private static Actor getActor(String code) {
		Actor a = null;
		for (Actor actor: actor) {
			if (actor.getActorID().equalsIgnoreCase(code)) {
				a = actor;
				break;
			}
		}
		return null;
		}
	}
