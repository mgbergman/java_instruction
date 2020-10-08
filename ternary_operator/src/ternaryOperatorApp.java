
public class ternaryOperatorApp {

	public static void main(String[] args) {
		
		String gender = "F";
		String genderDisplay = "";
		
		if (gender.equalsIgnoreCase("M")) {
			genderDisplay = "Male";
			
		} else {
			genderDisplay = "Female";
		}

		System.out.println("The actor gender is " + genderDisplay);
		
		System.out.println("Ternary");
		
		genderDisplay = "";
		
		genderDisplay = gender.equalsIgnoreCase("M") ? "Male" : "Female";
		
		System.out.println("The actor gender is " + genderDisplay);

	}

}
