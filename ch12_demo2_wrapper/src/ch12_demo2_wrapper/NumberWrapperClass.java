package ch12_demo2_wrapper;

import java.util.ArrayList;

public class NumberWrapperClass {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(15);
		numbers.add(20);
		numbers.add(25);
		
		System.out.println(numbers);
		
		numbers.add(1,10);
		System.out.println(numbers);
		
		
		
		
		
		System.out.println("Bye");

	}

}
