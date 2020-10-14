
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import business.Actor;
import business.Movie;

import db.ActorTextFile;
import db.DAO;

import ui.console.Console;


public class BmbdApp {
	
	private static DAO<Actor> actorDAO = new ActorTextFile();
	static List<Actor>actors = new ArrayList<>();
	static List<Movie>movies = new ArrayList<>();
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Bootcamp Movie App!");
		
//		actors.add(new Actor("1", "Marc", "Bergman", "M", LocalDate.parse("1960-12-23")));
//		actors.add(new Actor("2", "Harrison", "Ford", "M", LocalDate.parse("1960-02-23")));
//		actors.add(new Actor("3", "Katrina", "Bowling", "F", LocalDate.parse("1972-10-25")));
//		movies.add(new Movie(1, "Star Wars", "1976", "PG", "SciFi"));
		
		
		String command = "";
		
		while (!command.equalsIgnoreCase("7")) {
			System.out.println("MENU"); 	
			System.out.println("1 - Add Actor     ");
			System.out.println("2 - List Actor");
			System.out.println("3 - Find Actor");
			System.out.println("4 - Add Movie     ");
			System.out.println("5 - List Movies");
			System.out.println("6 - Find Movies");
			System.out.println("7 - Exit     ");
			
			System.out.println();	
			
			command = Console.getString("Command?   ");
			switch (command) {
			
			case "1":
				System.out.println("Add an Actor:     ");
				
				int ID = Console.getInt("Actor ID?                ");
				String firstName = Console.getString("First Name?                 ");
				String lastName = Console.getString("Last Name?                  ");
				String gender = Console.getString("Gender?                     ");
				String birthDate = Console.getString("Birthdate? (YYYY-MM-DD)");
				LocalDate ld = LocalDate.parse(birthDate);
				
				Actor a = new Actor(ID, firstName, lastName, gender, ld);
				if (actorDAO.add(a)) {
					System.out.println("Actor added successfully!");
				}
				else {
					System.out.println("Issue adding Actor");
				}
				System.out.println();
				break;

				
			case "2":
				System.out.println ("List of all Actors:");
//				for (Actor act : actors)  {
//					if (act!=null) {
//					System.out.println(act.displayContact());
//					}
//				}
				
				List<Actor> actors = actorDAO.getAll();
				for (Actor a1: actors) {
					System.out.println(a1);
				}
				System.out.println();
				break;
				
				
				
			
			
//			case "3":
//				System.out.println("Find Actor");
//				actorID = Console.getString("ID?  ");
//				for (Actor a1: actors) {
//					if (a1!=null && a1.getActorID()==actorID) {
//						System.out.println ("Found it");
//						System.out.println (a1.displayContact());
				}
				}
//			break;
			
//			case "4":
//				System.out.println();
//				int movieID = Console.getInt("Movie ID?       ");
//				String movieTitle = Console.getLine("Title?   ");
//				String movieYear = Console.getString("Year?   ");
//				String movieRating = Console.getString("Rating?     ");
//				String movieGenre = Console.getString("Genre?     ");
//				
//				Movie m = new Movie(movieID, movieTitle, movieYear, movieRating, movieGenre);
//
//				movies.add(m);
//				
//				System.out.println(m.displayContact());
//				
//				System.out.println(); 
//
//				break;	
//			
//			case "5":
//				System.out.println ("List of all Movies:");
//				for (Actor act : actors)  {
//					if (act!=null) {
//					System.out.println(act.displayContact());
//					}
//				}
//				break;		
//			
//			case "6":
//				System.out.println("Find Movie");
//				movieID = Console.getInt("ID?  ");
//				for (Movie mov : movies) {
//					if (mov!=null && mov.getMovieID()==movieID) {
//						System.out.println ("Found it");
//						System.out.println (mov.displayContact());
//					}
//					break;
//				}
//			
//			case "7":
//				System.out.println(); 
//				System.out.println("Bye!");
//				break;	
//		
//				}
//		}
	}

}
	
	
		
	
