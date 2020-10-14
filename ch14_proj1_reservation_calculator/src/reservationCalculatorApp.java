import java.time.LocalDate;
import java.time.Month;

import ui.console.Console;

public class reservationCalculatorApp {

	private static LocalDate arrival;
	private static LocalDate departure;

	public static void main(String[] args) {
		System.out.println("hello");
		
		
		System.out.println("Reservation Calculator");
		
		int monthStart = Console.getInt("Enter the arrival month (1-12): ");
		int	dayStart = Console.getInt("Enter the arrival day (1-31): ");
		int yearStart = Console.getInt("Enter the arrival year: ");
		
		System.out.println();
		arrival = Reservation.getArrivalDate(yearStart, monthStart, dayStart);
		LocalDate arrivalDate = LocalDate.of(yearStart, monthStart, dayStart);
		
		int monthEnd = Console.getInt("Enter the departure month (1-12): ");
		int	dayEnd = Console.getInt("Enter the departure day (1-31): ");
		int yearEnd = Console.getInt("Enter the departure year: ");
		
		departure = Reservation.getDepartureDate(yearEnd, monthEnd, dayEnd);
		LocalDate departureDate = LocalDate.of(yearEnd, monthEnd, dayEnd);
		
		
		System.out.println();
		System.out.println("Arrival Date: " + Reservation.getArrivalDateFormatted());
		System.out.println("Departure Date " + Reservation.getDepartureDateFormatted());
		System.out.println("Price:  " + Reservation.getPricePerNightFormatted() + " per night");
		System.out.println("Total Price" + Reservation.getNumberOfNights()+ Reservation.getNumberOfNights() +" nights");
		
		
		
		System.out.println("bye");

	}

}
