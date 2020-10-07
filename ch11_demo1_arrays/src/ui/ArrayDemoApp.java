package ui;

import java.util.Arrays;

import business.Product;

public class ArrayDemoApp {

	public static void main(String[] args) {
		System.out.println("hello");
		
		int[] numbers = new int [5];
		numbers [0] = 5;
		numbers [1] = 15;
		numbers [2] = 50;
		numbers [3] = 57;
		numbers [4] = 500;
		
		for (int i =0; i < numbers.length; i ++) {
			System.out.println(numbers[i]);
		}
		
		int[] randNbrs = new int[100];
		for (int i=0;i < randNbrs.length; i++) {
			int r = (int)(Math.random()*100)+1;
			randNbrs[i]=r;	
			System.out.println(r);
		}		
		
		String[] names = {"sean", "jack", "adam"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			
		
		}
		Product p1 = new Product ("java", "Murachs Java", 57.50);
		Product p2 = new Product ("mySqL", "Murdachs MySQL", 50.00);
		Product p3 = new Product ("android", "Murdachs Android", 59.00);
		Product [] products = {p1, p2, p3};
		for (Product product: products) {
			System.out.println(product);
		}
		
		Arrays.sort(names);
		for (String name: names) {
			System.out.println(name);
		}
		
		int position = Arrays.binarySearch(names, "adam");
		System.out.println(position);
		
		Arrays.sort(products);
		for (Product p: products) {
			System.out.println(p);
		}
		
		System.out.println("bye");
		}
		
		
		

	}


