
public class CheckingAccount extends Account {

	private double monthlyFee;
	
	public CheckingAccount(double mF) {
		monthlyFee = mF;
	}
	
	public void deductFee(double bal) {
		balance = balance - monthlyFee;	
		
	}
	
	public double getMonthlyFee()	{
		return monthlyFee;
		
	}

	public CheckingAccount(double balance, double monthlyFee) {
		super(balance);
		this.monthlyFee = monthlyFee;
	}
	
	
		
	
		
		
	}
	


 