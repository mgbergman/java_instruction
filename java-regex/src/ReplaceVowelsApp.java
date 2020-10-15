import java.util.Scanner;

public class ReplaceVowelsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		String newStr = "";
		char[] c = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
				str = str.replace(c[i], '*');
			}
		}
		System.out.println(str);
		
		System.out.println("try again");
		str = sc.nextLine();
		str = str.replaceAll("[aeiouAEIOU]", "*");
		System.out.println(str);
	}

}
