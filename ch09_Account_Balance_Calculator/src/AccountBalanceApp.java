import java.text.NumberFormat;

import ui.console.Console;

public class AccountBalanceApp {

	public AccountBalanceApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Account User = new Account();
		CheckingAccount UserChecking = new CheckingAccount(1);
		SavingsAccount UserSavings = new SavingsAccount(.01);
		
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		
		System.out.println("Welcome to the Account application");
		String choice = "y";
		System.out.println("Starting Balance:     ");
			System.out.print("Checking:     "  );
			System.out.println(currencyFormat.format
					(UserChecking.getBalance()));
			System.out.print("Savings:      "  );
			System.out.print(currencyFormat.format
					(UserSavings.getBalance()));
		
		while (choice.equalsIgnoreCase("y")) {
			
			
			
			
			
			
			
			
			
			
			
		}
		choice=Console.getString("Continue? ");
		
		
		
		
		
		
		System.out.println("Continue (y/n)");

	}

}
