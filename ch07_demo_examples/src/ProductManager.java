
public class ProductManager {

	public static void main(String[] args) {

			System.out.println("Hello");
			
			Product p1 = new Product();
			System.out.println("p1 " + p1);
			
			printProductData(p1);
			p1.setCode("Java");
			p1.setDescription("Murach's Java Programming");
			p1.setPrice(59.5);
			printProductData(p1);
			System.out.println("p1 " + p1);
			
			Product p2 = new Product("mysql", "Murachs MySQL", 54.40);
			
			printProductData (p2);
			
			System.out.println ("print using to string");
			System.out.println (p1.toString());
			System.out.println (p2);
			
			
			System.out.println("Bye");
			
			


	}
	private static void printProductData (Product prod) {
		System.out.println("Product Data:  ");
		System.out.println(prod.getCode());
		System.out.println(prod.getDescription());
		System.out.println(prod.getPriceFormatted());
		
	}
}
