import java.util.ArrayList;
import java.util.List;

import ui.console.Console;

public class wizardInventoryApp {

	private static List<String> wizItems = new ArrayList<>();
	
	public static void main(String[] args) {

			initalizeItems();
			
			String command = "";
			
			while (!command.equalsIgnoreCase("exit")) {
				initialCommand();
				command = Console.getString("Command?   ");
				System.out.println();	
		
				switch (command) {
				
				case "show":
					for (String wizItem : wizItems) {
						System.out.println(wizItems.indexOf(wizItem) + " " + wizItem);
					}
					System.out.println();
					break;
					
				case "grab":
					if (wizItems.size() > 3 ) {
						System.out.println("You can't carry any more items. "
								+ "Drop something first.");
						System.out.println();
						break;
					}
					
					System.out.println();
					String addItem = Console.getLine("Name:   ");
					wizItems.add(addItem);
					System.out.println(addItem + " was added");
					System.out.println();
							
						break;
					
					case "edit":
						int editItem = Console.getInt("Number:   ");
					
						if (editItem > wizItems.size()) {
							System.out.println("error-cannot be located");
							System.out.println();
							break;
						}
						
						String replaceItem = Console.getLine("Updated name:   ");
						
						wizItems.set(editItem, replaceItem);
						System.out.println(editItem + " was updated");
						System.out.println();
							
							break;		
							
					case "drop":
						int dropItem = Console.getInt("Number:   ");
					
						if (dropItem > wizItems.size()) {
							System.out.println("error-cannot be located");
							System.out.println();
							break;
						}
						
						wizItems.remove(dropItem);
						System.out.println(dropItem + " was dropped");
						System.out.println();
							
						break;	
							
					case "exit":
						System.out.println(); 
						System.out.println("Bye!");
						break;	
				
				
				}
		
		
		
		
	}

}

	private static void initialCommand() {
		System.out.println("COMMAND  MENU"); 	
		System.out.println("show - Show All items     ");
		System.out.println("grab - Grab an item ");
		System.out.println("edit - Edit an item");
		System.out.println("drop - Drop an item");
		System.out.println("exit - Exit program");
		System.out.println();
	}

	private static void initalizeItems() {
		wizItems.add("wooden staff");
		wizItems.add("wizard hat");
		wizItems.add("cloth shoes");
	}
}
