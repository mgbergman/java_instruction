
public class Account implements Depositable, Withdrawable, Balanceable {

	protected double balance;
	
	
	public Account(double balance) {
		this.balance = balance;
	}
	
	public Account() {
		
	}
	@Override
	public double getBalance() {
		
		return balance;
	}
	
	@Override
	public void setBalance(double amount) {
		balance = amount;
	}

	@Override
	public void withdraw(double amount) {
		balance = balance - amount;	
		
	}

	@Override
	public void deposit(double amount) {
		balance = balance + amount;
		
	}

}
