package ui;

import java.util.Scanner;

public class ExceptionHandlingApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = 0;
		while (number!=99) {
			System.out.print("Enter a number");
			number = sc.nextInt();
			System.out.println("you entered " +number);
			System.out.println();
		}

	}

}
