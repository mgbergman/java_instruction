
public class Movie {

	private String movieTitle;
	private String movieYear;
	private String movieRating;
	private String movieGenre;
	
	public Movie(String movieTitle, String movieYear, String movieRating, String movieGenre) {
		this.movieTitle = movieTitle;
		this.movieYear = movieYear;
		this.movieRating = movieRating;
		this.movieGenre = movieGenre;
	}

	public Movie() {
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getMovieYear() {
		return movieYear;
	}

	public void setMovieYear(String movieYear) {
		this.movieYear = movieYear;
	}

	public String getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(String movieRating) {
		this.movieRating = movieRating;
	}

	public String getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}

	@Override
	public String toString() {
		return "Movie [movieTitle=" + movieTitle + ", movieYear=" + movieYear + ", movieRating=" + movieRating
				+ ", movieGenre=" + movieGenre + "]";
	}
	
	
	
	public String displayContact() {
		String str = "-------------------------------------------------\n";
		str += "-------------------------------------------------\n";
		str +=  movieTitle + " " + "(" + movieRating + ") " + "was released in " + movieYear + "." + "\n" ;
		str += "Genre(s): " + movieGenre + "\n";
		str += "-------------------------------------------------\n";
		
		return str;
	}
	
	
	
	
	
	
	
}
