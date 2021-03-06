import java.text.NumberFormat;

public class NumberFormatApp {

	public static void main(String[] args) {
	
			double astinMartinPrice = 245789.20;
			double interestPct = .025879;
			
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			NumberFormat pct = NumberFormat.getPercentInstance();
			pct.setMaximumFractionDigits(2);
			
			System.out.println("Car finance info:");
			System.out.println("Price:\t" +pct.format(interestPct));

	}

}
