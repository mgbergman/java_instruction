package ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import business.Actor;
import business.Movie;
import db.ActorTextFile;
import db.DAO;
import db.MovieDB;
import ui.console.Console;
import db.ActorDB;
public class BmdbApp {
	
	//private static List<Actor> actors = new ArrayList<>();
	private static DAO<Actor> actorDAO = new ActorDB();
	private static DAO<Movie> movieDAO = new MovieDB();
	public static void main(String[] args) {
		System.out.println("Welcome to the bmdb app!");

		
		int command = 0;
		
		while (command!=9) {
			System.out.println("Command Menu:");
			System.out.println("1 - Add Actor");
			System.out.println("2 - List Actors");
			System.out.println("3 - Find Actor");
			System.out.println("4 - Delete Actor");
			System.out.println("5 - Add Movie");
			System.out.println("6 - List Movies");
			System.out.println("7 - Find Actors for Last Name");
			System.out.println("9 - Exit");
			System.out.println();
			
			command = Console.getInt("Command:  ");
			System.out.println();
			
			int id;
			switch(command) {
			case 1:
				//add Actor
				System.out.println("Add an Actor:  ");
				
				String fn = Console.getString("First Name? ");
				String ln = Console.getString("Last Name? ");
				String g = Console.getString("Gender? ");
				String bdStr = Console.getString("Birth Date? ");
				LocalDate bd = LocalDate.parse(bdStr);
				
				Actor actor = new Actor(fn,ln,g,bd);
				actorDAO.add(actor);
				System.out.println("Actor Added!");
				System.out.println(actor.displaySummary());
				System.out.println();
				break;
			case 2:
				// List Actors
				System.out.println("List of all Actors:");
				for (Actor a: actorDAO.getAll()) {
					if (a!=null) { 
						System.out.println(a.displaySummary());
					}
				}
				System.out.println();
				break;
			case 3:
				// Find Actor
//				System.out.println("*** Not yet implemented *** ");
				id = Console.getInt("ID? ");
				Actor a = actorDAO.get(id);
				if (a!= null) { 
					System.out.println(a.displaySummary());
				}
				else {
					System.out.println("No Actor Found");
				}
				System.out.println();
				break;
			
			case 4:
				// Delete Actor
				System.out.println("*** Delete *** ");
				id = Console.getInt("ID? ");
			    
				
				a = actorDAO.get(id);
				if (a!= null) { 
					if (actorDAO.delete(a)) {
						System.out.println("Delete Succesful");
					}
				}
				else {
					System.out.println("No Actor Found");
				}
				System.out.println();
				break;
	
			case 5:
				// add Movie
				System.out.println("Add a Movie:  ");
				int id1 = Console.getInt("ID?    ");
				String t = Console.getLine("Title? ");
				String y = Console.getString("Year? ");
				String r = Console.getString("Rating? ");
				String gr = Console.getString("Director? ");
				
				Movie movie = new Movie(id1,t,y,r,gr);
				movieDAO.add(movie);
				System.out.println(movie.displaySummary());
				System.out.println();
				break;
			case 6:
				System.out.println("List of all Movies:");
				for (Movie m: movieDAO.getAll()) {
					if (m!=null) { 
						System.out.println(m.displaySummary());
					}
				}
				System.out.println();
				break;
			case 7:
				System.out.println("Find Actor by Last Name");
				String lastName = Console.getRequiredString(" lastName? ");
				
				List<Actor> actors = actorDAO.findByLastName(lastName);
				for (Actor act: actors) {
					System.out.println(act.displaySummary());
				}
				
				break;
				
			
			
			
			
			
			
			case 9:
				// exit..  do nothing
				break;
			default:;
				System.out.println("Invalid Command.  Try Again.");
				break;
			
			}
			
		}

		System.out.println("bye");
	}

}
