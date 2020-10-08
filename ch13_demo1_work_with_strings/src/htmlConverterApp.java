
public class htmlConverterApp {

	public static void main(String[] args) {
		System.out.println("HTML Converter");

		
		String html = "<h1>Grocery List</h1>\n" +
				 "<ul>\n" +
				 " <li>Eggs</li>\n" +
				 " <li>Milk</li>\n" +
				 " <li>Butter</li>\n" +
				 "</ul>";
		
		
		html = html.replace("<h1>", "");
		html = html.replace("<li>", "* ");
		html = html.replace("</h1>", "");
		html = html.replace("</li>", "");
		html = html.replace("<ul>", "");
		html = html.replace("</ul>", "");
		html = html.trim();
		
		System.out.println(html);
		
		System.out.println("bye");
	}

}
