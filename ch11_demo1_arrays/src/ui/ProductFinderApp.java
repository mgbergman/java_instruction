package ui;

import business.Product;
import ui.console.Console;

public class ProductFinderApp {
private static Product[] products = new Product[3];
	public static void main(String[] args) {
		System.out.println("hi");
		
		
		products[0] = new Product("java", "Murachs", 57.5);
		products[1] = new Product("mysql", "Murachs", 50.5);
		products[2] = new Product("android", "Murachs", 95.5);
		
		
		String code="";
		
		while (!code.equalsIgnoreCase("x")) {
			System.out.println("Search for a product");
			code = Console.getString("Enter code:    ");
			Product p = getProduct(code);
			if (p!=null ) {
				System.out.println("Product Found    " + p);
				
			}
			else {
				System.out.println("No Product Found");
				
			}
		
		
		}
		
		System.out.println("bye");

	}
	
	private static Product getProduct(String code) {
		Product p = null;
		for (Product product: products) {
			if (product.getCode().equalsIgnoreCase(code)) {
				
				p = product;
				break;
				
			}
			
		}
		
		return p;
	}

}
