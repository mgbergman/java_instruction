package db;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import business.Actor;
import business.Movie;

public class MovieTextFile implements DAO<Movie> {
	private List<Movie> movies = null;
	private Path moviesPath = null;
	private File moviesFile = null;
	private final String FIELD_SEP = "\t";

	public MovieTextFile() {
		moviesPath = Paths.get("movies.txt");
		moviesFile = moviesPath.toFile();
		movies = getAll();
	}


	// get all actors from text file if our list is null
	@Override
	public List<Movie> getAll() {
		if (movies != null) {
			return movies;
		}
		movies = new ArrayList<>();
		if (Files.exists(moviesPath)) {
			try (BufferedReader in = new BufferedReader(new FileReader(moviesFile))) {
				// read actors from file into our list
				String line = in.readLine();
				while (line != null) {
					String[] fields = line.split(FIELD_SEP);
					String idStr = fields[0];
					int id = Integer.parseInt(idStr);
					String title = fields[1];
					String year = fields[2];
					String rating = fields[3];
					String genre = fields[4];
				
					
					Movie p = new Movie(id, title, year, rating, genre);
					movies.add(p);
					line = in.readLine();
				}
			} catch (IOException ioe) {
				System.out.println(ioe);
				return null;
			}

		} else {
			System.out.println(moviesPath.toAbsolutePath() + " doesn't exist.");
			return null;
		}

		return movies;
	}

	@Override
	public boolean add(Movie p) {
		movies.add(p);
		return saveAll();
	}

//	@Override
//	public boolean update(Movie a) {
//		// get old actor and remove it
//		Movie oldMovie = this.get(a.getTitle());
//		int i = movies.indexOf(oldMovie);
//		movies.remove(i);
//		movies.add(i, a);
//		return saveAll();
//	}

	@Override
	public boolean delete(Movie a) {
		movies.remove(a);
		return saveAll();
	}
	
	private boolean saveAll() {
		// after every maintenance (add, update, delete) function,
		// rewrite the text file
		try (PrintWriter out = new PrintWriter(
				  			   new BufferedWriter(
				  			   new FileWriter(moviesFile)))) {
			// write all actors in the list to the file
			for (Movie m: movies) {
			
				out.print(m.getTitle()+FIELD_SEP);
				out.print(m.getYear()+FIELD_SEP);
				out.print(m.getRating()+FIELD_SEP);
				out.println(m.getDirector());
			}
			return true;
		}
		catch (IOException ioe) {
			System.out.println(ioe);
			return false;
		}
	}


	@Override
	public Movie get(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean update(Movie t) {
		// TODO Auto-generated method stub
		return false;
	}
}

	

//	@Override
//	public Movie get(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}


