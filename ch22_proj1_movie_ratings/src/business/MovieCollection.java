package business;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MovieCollection {
	
	private List<Movie> movies;
	
	public MovieCollection(List<Movie> movies) {
		this.movies = movies;
	}

	public MovieCollection () {
		movies = new ArrayList<>();
		
	}



	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	public List <Movie> getMovies(){
		return movies;
	}

	public void add(Movie movie) {
		movies.add(movie);
		
	}
	

	
	
	public List<Movie> filterMovies(Predicate<Movie> condition){
		return movies.stream().filter(condition).collect(Collectors.toList());
	}
	public double getLowestRating() {
		return movies.stream().mapToDouble(x -> x.getRating()).min().getAsDouble();
	}
	public double getHighestRating() {
		return movies.stream().mapToDouble(x -> x.getRating()).max().getAsDouble();
	}
	public double getAverageRating() {
		return movies.stream().mapToDouble(x -> x.getRating()).average().getAsDouble();
	}
	public int getSize() {
		return movies.size();
	}

}
	