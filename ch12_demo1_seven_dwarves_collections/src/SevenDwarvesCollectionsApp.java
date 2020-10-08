import java.util.ArrayList;

public class SevenDwarvesCollectionsApp {

	public static void main(String[] args) {
		System.out.println("Hello");
			
		ArrayList<String> dwarves = new ArrayList<>();
		dwarves.add("doc");
		dwarves.add("sleepy");
		dwarves.add("grumpy");
		dwarves.add("dopey");
		dwarves.add("happy");
		dwarves.add(0, "bashful");
		dwarves.add("sneezy");
		dwarves.add("grumpy");
		
		System.out.println(dwarves);
		
		dwarves.add("Trump");
		
		System.out.println(dwarves);
		System.out.println(dwarves.get(3));
		System.out.println(dwarves.size());
		System.out.println(dwarves.contains("Happy"));
		System.out.println(dwarves.indexOf("grumpy"));


		dwarves.remove(3);
		System.out.println(dwarves);
		
		dwarves.set(3, "temp Dwarf");
				
		System.out.println(dwarves);
		
		
		
		
		System.out.println("Bye");
	}

}
