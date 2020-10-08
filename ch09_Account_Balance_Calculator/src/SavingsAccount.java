
public class SavingsAccount extends Account {

	double monthlyInterestRate;
	double monthlyInterestPayment;
	
	
	
	public SavingsAccount(double mIR) {
		monthlyInterestRate = mIR;
	}
	
	public void calMonthlyPayment(double balance) {
		monthlyInterestPayment = monthlyInterestRate * balance;
		balance = balance + monthlyInterestPayment;
	}
	
	public double getMonthlyInterestPayment (double balance) {
		
		monthlyInterestPayment = monthlyInterestPayment * balance;
		return monthlyInterestPayment;	
		
	}

	public SavingsAccount(double balance, double monthlyInterestRate) {
		super(balance);
		this.monthlyInterestRate = monthlyInterestRate;
		this.monthlyInterestPayment = monthlyInterestPayment;
	}
	
	

}
