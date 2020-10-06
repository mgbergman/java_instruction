
public class CheckingAccount extends Account {

	double monthlyFee;
	
	public CheckingAccount(double mF) {
		monthlyFee = mF;
	}
	
	public void deductFee(double bal) {
		balance = bal - monthlyFee;	
		
	}
	
	public double getMonthlyFee()	{
		return monthlyFee;
		
	}
		
		
		
	}
	


 