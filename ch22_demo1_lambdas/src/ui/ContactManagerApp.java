package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import business.Contact;
import business.TestContact;

public class ContactManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome");
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null,"800-221-5858"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com",null));
		System.out.println();
		System.out.println("Contacts without phone numbers");
		
		List<Contact> contactsWithoutPhone = new ArrayList<>();
		for (Contact c: contacts) {
			if (c.getPhone()==null) {
				contactsWithoutPhone.add(c);
			}
			
		}
		displayContact(contactsWithoutPhone);
		
		System.out.println("=====using Lambda++++++++");
		contactsWithoutPhone = filterContactsPredicate(contacts, c -> c.getPhone()==null);
		displayContact(contactsWithoutPhone);
		processContacts(contacts, c -> System.out.println(c.getName()));
		
		List<String> contactPhoneNumbers = transformContacts(contacts,
							c -> {String phone = (c.getPhone()== null) ? "n/a" : c.getPhone();
							return c.getName() + ": " + phone;
							});
		System.out.println(contactPhoneNumbers);
		
		System.out.println("Bye");
	}
	private static void displayContact(List<Contact> contacts) {
		for (Contact c: contacts) {
			System.out.println(c);
			
		}
		System.out.println();
		
	}
	public static List<Contact> filterContacts(List<Contact> contacts,
										TestContact condition) {
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c: contacts) {
			if(condition.test(c)) {
				filteredContacts.add(c);
			}
		}
	return filteredContacts;
	}
	
	public static List<Contact> filterContactsPredicate(List<Contact> contacts,
			Predicate<Contact> condition) {
			List<Contact> filteredContacts = new ArrayList<>();
			for (Contact c: contacts) {
			if(condition.test(c)) {
				filteredContacts.add(c);
}
}
		return filteredContacts;
	}
		public static void processContacts(List<Contact> contacts, 
			Consumer<Contact> consumer) {
			for (Contact c : contacts) { 
				consumer.accept(c);
			}
			}
		
		public static List<String> transformContacts(List<Contact> contacts,
										Function<Contact, String> function) {
								List <String> strings = new ArrayList<>();
								for (Contact c : contacts) {
									strings.add(function.apply(c));
								}
								return strings;
		}
		
}	


