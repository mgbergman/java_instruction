import java.util.ArrayList;

public class productCollectionApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		ArrayList<Product> products = new ArrayList<>();
		products.add(new Product("java", "Murachs Java", 57.50));
		products.add(new Product("andr", "Murachs Java", 59.50));
		products.add(new Product("mysql", "Murachs Java", 800.50));
		
		String code = "andr";
		
		for (Product p: products) {
			if (p.getCode().equalsIgnoreCase(code)) {
				System.out.println(p.toString());
			}
		}
		
		
		
		System.out.println("Bye");
	}

}
 