
public class mainPersonManagerApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Person Manager");
		///Scanner sc = new Scanner (System.in);
		
		String command = "y";
		
		while (command.equalsIgnoreCase("y")) {

			
			
			
			String createAnswer = Console.getChoiceString("Create customer or employee? ", "c", "e");
			
			
			switch (createAnswer) {
			case "c":
				String FirstName = Console.getString("First Name?                 ");
				String LastName = Console.getString("Last Name?                  ");
				String CustNumber= Console.getString("Customer Number?            ");
				
				Customer c = new Customer(FirstName, LastName, CustNumber);
				System.out.println();
				System.out.println(c.displayContact());
				
				break;
				
				case "e":
				
				
				System.out.println();
				String FirstName2 = Console.getString("First Name?                 ");
				String LastName2 = Console.getString("Last Name?                  ");
				String SSN = Console.getString("SSN    ");
				
				Employee e = new Employee(FirstName2, LastName2, SSN);
				System.out.println();
				System.out.println(e.displayContact());
				
				System.out.println(); 
				
				System.out.println(); 
				break;	
			
			
				
				
				
			}	
			
			command = Console.getChoiceString("Continue (y/n)", "y", "n");	
			
		}	
		
		System.out.println("Bye");
		
			
	}

}
