import java.util.Scanner;

public class StringsApp {

	public static void main(String[] args) {
		String firstname = "Bob";
		String lastname = "Marley";
		int age = 36;
		String message = "";
		
		message = firstname;
		message = message + " ";
		message += lastname;
		message += " was "+age+" years \nold when he passed.";
		System.out.println(message);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine();
		
		System.out.println("Enter a int");
		int number = sc.nextInt();
		
		
	}

}
