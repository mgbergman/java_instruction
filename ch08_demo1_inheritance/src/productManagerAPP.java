
public class productManagerAPP {

	public static void main(String[] args) {
		System.out.println("hello");
		
		Product p1 = new Product("java", "Murducts", 70.00);
		System.out.println(p1.toString());
		
		
		Book b1 = new Book ("mySql", "Murachs", 67.98, "Marc Bergmman");
		System.out.println(b1.toString());
		
		Software s1 = new Software ("eclispe", "sts Eclispe", 0.00, "Version 4.6.1");
		System.out.println(s1);
			
			
			
			
			
			
			
			
			
			
			Product p2 = s1;
			System.out.println("p2 toString...");
			System.out.println(p2);
			
			
			if (p2 instanceof Book) {
				System.out.println("ps is a book");
			}
				
				else if (p2 instanceof Software) {
					System.out.println("ps is instance of software");
					
				}
			
			Software s2 = new Software ("eclispe", "sts Eclispe", 0.00, "Version 4.6.1");
			System.out.println ("s1:  " + s1);
			System.out.println ("s1:  " + s2);
			if (s1==s2) {
				System.out.println ("s1 is the same as s2");	
			}
			else if (s1.equals(s2)) {
					System.out.println("s1 and s2 have the same values");
			}
			else {
					System.out.println("NOT THE SAME");
			}
		
			
			
			System.out.println("Bye");	
				
			}
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
	

	


