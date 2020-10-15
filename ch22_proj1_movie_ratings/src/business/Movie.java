package business;

import java.util.ArrayList;
import java.util.List;

public class Movie {

	private String title;
	private int year;
	private double rating;
	
	public Movie(String title, int year, double rating) {
		this.title = title;
		this.year = year;
		this.rating = rating;
	}

	public Movie() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", year=" + year + ", rating=" + rating + "]";
	}
	
	


	
	


		
	}


