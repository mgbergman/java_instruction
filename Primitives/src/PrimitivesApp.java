import java.util.Scanner;

public class PrimitivesApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter a character number   "  ); 
			int charNum = sc.nextInt();
			char charVal = (char)charNum;
			
			System.out.println("Character equilivent: "  +charVal);
			System.out.println ();
			
			System.out.println("Again?");
			 choice = sc.next();
			 
		}
		sc.close();	
		}

	}


