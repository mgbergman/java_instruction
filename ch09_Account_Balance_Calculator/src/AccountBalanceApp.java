import java.text.NumberFormat;


import ui.console.Console;

public class AccountBalanceApp {
	
	private static NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();


	public static void main(String[] args) {
		
		Account User = new Account();
		CheckingAccount UserChecking = new CheckingAccount(1000, 1.0);
		SavingsAccount UserSavings = new SavingsAccount(1000,.01);
		
		
		
		System.out.println("Welcome to the Account application");
		
		System.out.println("Starting Balance:     ");
			displayBalanceSummary(UserChecking, UserSavings);	
			
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			String transType = Console.getChoiceString("withdraw/despoit", "w","d");
			String account = Console.getChoiceString("Checking or savings", "c", "a");
			
			
			double max = 0;
			Account a = null;
					if (account.equalsIgnoreCase("c")) {
						a = UserChecking;
					}
					else {
						a = UserSavings;
					}
					
			
			if (transType.equalsIgnoreCase("w"))
				max = a.getBalance();
				else
					max = Double.POSITIVE_INFINITY;
			
			double amount = Console.getDouble("Amount?", 1, max);
			
			if (transType.equalsIgnoreCase("w"))
				a.withdraw(amount);
			
			else
				a.deposit(amount);
			
		
			
			
		}
		
		
		
		
		
		choice=Console.getChoiceString("Continue? ","y","n");
		System.out.println("Continue (y/n)");
	
		UserChecking.getMonthlyFee();
		UserSavings.getMonthlyInterestPayment(0);
		

	}


	private static void displayBalanceSummary(CheckingAccount UserChecking, SavingsAccount UserSavings) {
		System.out.print("Checking:     "  );
		System.out.println(currencyFormat.format
				(UserChecking.getBalance()));
		System.out.print("Savings:      "  );
		System.out.print(currencyFormat.format
				(UserSavings.getBalance()));
		System.out.println();
	}

}
