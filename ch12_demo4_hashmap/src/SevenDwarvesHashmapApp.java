import java.util.HashMap;
import java.util.Map;

public class SevenDwarvesHashmapApp {

	public static void main(String[] args) {
		System.out.println("hello");
		
		HashMap<String,String>dwarves = new HashMap<>();
		
		dwarves.put("DC", "Doc");
		dwarves.put("SL", "Sleepy");
		dwarves.put("SN", "Sneezy");
		dwarves.put("HA", "Happy");
		dwarves.put("GR", "Grumpy");
		dwarves.put("BA", "Bashful");
		dwarves.put("DO", "Dopey");
		
		
		
		for (Map.Entry <String,String> dwarf: dwarves.entrySet()) {
			System.out.println(dwarf.getKey()+"\t"+dwarf.getValue());
			
			
			
		String str = "SN";
		
		System.out.println(dwarves.get(str));
			
		}
		
		
		
		
		
		
		System.out.println("goodby");

	}

}
