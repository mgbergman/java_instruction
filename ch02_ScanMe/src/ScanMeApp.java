import java.util.Scanner;

public class ScanMeApp {

	public static void main(String[] args) {
		//prompt user for 3 numbers on one line
		
		System.out.print("Enter 3 ints separated by a space: ");
		Scanner sc= new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		
		System.out.println("Sum or all of them: "+(n1+n2+n3));
	}

}
