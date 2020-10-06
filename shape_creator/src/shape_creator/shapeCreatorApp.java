package shape_creator;

import ui.console.Console;

public class shapeCreatorApp {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("Welcome to the shape creator app");
	System.out.println("Create a rectangle");
	
	int length = Console.getInt("Enter Length   ");
	int width = Console.getInt("Enter width     ");
	
	for (int i =0; i < width; i++ ) {
		System.out.println();
		for (int j = 0; j < length ; j++) {
			System.out.print("*");
		}
		
		
	}
		
		
		
		
		
		
		
		

	}

}
