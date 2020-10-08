import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Reservation {
	
	private static LocalDate arrival;
	private static LocalDate departure;
	private static int price = 145;
	
	public static LocalDate getArrival() {
		return arrival;
	}

	public static void setArrival(LocalDate arrival) {
		Reservation.arrival = arrival;
	}

	public static LocalDate getArrivalDate(int y, int m, int d) {
		LocalDate arrival = LocalDate.of(y, m, d);
		
		return arrival;
	}
	
	public static String getArrivalDateFormatted() {
		DateTimeFormatter arrdtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		return arrdtf.format(arrival);
		
		
		}
//	public setArrivalDate(LocalDate arrivalDate) {
//	}
	public static LocalDate getDepartureDate(int y, int m, int d) {
		LocalDate departure = LocalDate.of(y, m, d);
		
		return departure;
	}
//	public String getDepartureDateFormatted() {
//		return null;
	
//	public setDepartureDate(LocalDate departureDate) {
//	}
	public static int getNumberOfNights() {
		int numDays = Period.between(arrival, departure).getDays();
		return (int) numDays;
	}
	public static String getPricePerNightFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();  
		currency.format(price);
		return currency.format(price);
	}
//	public double getTotalPrice() {
//		
//		
//		return 0;
//	}
//	public String getTotalPriceFormatted() {
//		return null;
//	}

	

}
