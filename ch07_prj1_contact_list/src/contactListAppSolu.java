
public class contactListAppSolu {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Contact List application");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println();
			String firstName = Console.getString("Enter first name");
			String lastName = Console.getString("Enter last name");
			String eMail = Console.getString("Enter eMail name");
			String phone = Console.getString("Enter phone name");
			
			System.out.println();
			
			Contact c = new Contact(firstName,lastName,eMail,phone);
			
			System.out.println(c.displayContact());
			
			
			
			
			
			
			
			
			
			choice=Console.getString("Continue? ");
			
			
			
			
			
			
			
			
		}
		
		
		
		
		System.out.println("Bye");
	}

}
