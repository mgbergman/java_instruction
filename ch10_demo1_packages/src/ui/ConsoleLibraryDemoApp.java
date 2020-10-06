
package ui;

import ui.console.Console;

public class ConsoleLibraryDemoApp {

	


	public static void main(String[] args) {
		System.out.println("hello");
		
		String str = Console.getLine("Enter   ");
		
		int n = Console.getInt("enter a number between one and ten:  ", 0
				, 10);
		System.out.println(str);
		System.out.println(n);
		
		
		
		System.out.println("Bye");

	}

}
