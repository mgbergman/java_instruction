package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import business.Contact;

public class StreamProcessingApp {

	public static void main(String[] args) {
		System.out.println("Welcome");
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null,"800-221-5858"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com",null));
		System.out.println();
		
		contacts.stream()
			.filter(c -> c.getPhone() == null )
			.forEach(c -> System.out.println(c.getName()));
		
		List <Contact> contactsNoPhone = contacts.parallelStream()
				.filter(c -> c.getPhone() == null)
				.collect(Collectors.toList());
		
		System.out.println(contactsNoPhone.size());
		
		
		List <String> contactNames = contacts.stream()
				.map(c -> c.getName())
				.collect(Collectors.toList());
		
		contactNames.stream()
				.forEach(str -> System.out.println(str));
		
		contactNames = contacts.stream()
				.map(Contact::getName)
				.collect(Collectors.toList());
		
		contactNames.stream()
				.forEach(System.out :: println);
		
		String csv = contacts.stream()
				.map(c -> c.getName())
				.reduce("", (a, b)-> a + b + ", ");
		csv = csv.substring(0, csv.length()-2);
		System.out.println(csv);
		
		System.out.println("Bye");

	}

}
