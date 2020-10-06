
public class SavingsAccount extends Account {

	double monthlyInterestRate;
	double monthlyInterestPayment;
	
	
	
	public SavingsAccount(double mIR) {
		monthlyInterestRate = mIR;
	}
	
	public void calMonthlyPayment(double bal) {
		monthlyInterestPayment = monthlyInterestRate * bal;
		balance = balance + monthlyInterestPayment;
		
	}
	
	public double getMonthlyInterestPayment (double bal) {
		
		monthlyInterestPayment = monthlyInterestPayment * bal;
		return monthlyInterestPayment;
		
		
		
	}

}
