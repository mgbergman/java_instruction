import ui.console.Console;

public class pigLatinTranslatorApp {

	public static void main(String[] args) {
		System.out.println("Pig Latin Translator");
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			String line = Console.getLine("Enter a line: ");
			
			String[] words = line.split(" ");
//			String[] translation = new String[words.length];
			for (String str: words) {
				str.toLowerCase();
				
				
				
				
			}
			
			
			
			
			
			
			
			
			
			choice = Console.getChoiceString("Another line", y, n);
		}
		
		
		
		
		
		
		System.out.println("Bye");
		
	}
		
		private static boolean isAllLetters (String str) {
			boolean allLetters = true;
			char [] chars = str.toCharArray();
			for (int i = 0; i <chars.length; i++ ) {
				char c = chars[i];
				if (!Character.isLetter(c) && ()!i==chars.length - 1) {
					
				}
				
			}
			
			return allLetters;
			
			private static void removePunctuation(String str) {
				char c = str.charAt(str.length()-1);
				if (c=='.' || c=='!' || c=='?') {
					str=str.substring(0, c, str.length()-1);
					return str;
					
				}
			}
		}	
			
		}
		
	


 