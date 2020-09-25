import java.util.Scanner;

public class ControlApp {

	public static void main(String[] args) {
		// ch2 pages 65 - 69
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter traffic light color:");
		String color = sc.nextLine();
		
		if (color.equalsIgnoreCase("red")) {
			System.out.println("Red Light - stop!");
		}
	
		else if (color.equalsIgnoreCase("yellow")) {
			System.out.println("Yellow Light - slow down!");
		}
		
		else  {
			System.out.println("Green Light - go!!");
		}
	
	
	
	
	
	}
	

}
