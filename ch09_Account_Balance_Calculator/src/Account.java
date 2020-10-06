
public class Account implements Depositable, Withdrawable, Balanceable {

	public double balance = 1000.00;
	
	public Account() {
		
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
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
