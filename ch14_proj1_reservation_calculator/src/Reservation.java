import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;


public class Reservation {
	
	private static LocalDate arrivalDate;
	private static LocalDate departureDate;
	private static int price = 145;
	
	
	public Reservation(LocalDate arrivalDate, LocalDate departureDate, int price) {
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
		this.price = price;
	}
	public LocalDate getArrivalDate() {
		return arrivalDate;
	}
	public static String getArrivalDateFormatted() {
		DateTimeFormatter arrdtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		String arrivalDateFormatted = arrdtf.format(arrivalDate);
		return (arrivalDateFormatted);	
	}
	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public LocalDate getDepartureDate() {
		return departureDate;
	}
	public void setDeparture(LocalDate departure) {
		this.departureDate = departure;
	}
	public static double getNumberOfNights() {
		
		long numDays = ChronoUnit.DAYS.between(arrivalDate, departureDate);
		double totPrice = numDays *  price;
		return totPrice;
	}
	
	
	
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static String getDepartureDateFormatted() {
		DateTimeFormatter arrdtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		String departureDateFormatted = arrdtf.format(departureDate);
		return (departureDateFormatted);
	}
	
	
//	public static LocalDate getarrivalDate() {
//		return arrivalDate;
//	}
//
//	public static void setarrivalDate(LocalDate arrivalDate) {
//		Reservation.arrivalDate = arrivalDate;
//	}
//
	
//	
	
////	public setarrivalDateDate(LocalDate arrivalDateDate) {
////	}
	public static LocalDate getDepartureDate(int y, int m, int d) {
		LocalDate departure = LocalDate.of(y, m, d);
		return departure;
		
	}
//		return departure;
//	}
	public static LocalDate getArrivalDate(int yearStart, int monthStart, int dayStart) {
		LocalDate departure = LocalDate.of(yearStart, monthStart, dayStart);
		return departure;
	}
	
////	public setDepartureDate(LocalDate departureDate) {
////	}
	
	public static String getPricePerNightFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();  
		
		return currency.format(price);
	}
}
////	public double getTotalPrice() {
////		
////		
////		return 0;
////	}
////	public String getTotalPriceFormatted() {
////		return null;
////	}

