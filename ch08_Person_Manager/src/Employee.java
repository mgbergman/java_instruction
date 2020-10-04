
public class Employee extends Person {
	
	private String SSN;

	public Employee() {
	}

	
	
	public Employee(String firstName, String lastName, String ssn) {
		super(firstName, lastName);
		this.SSN = ssn;
		// TODO Auto-generated constructor stub
	}



	public Employee(String sSN) {
		SSN = sSN;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}
	
	public String displayContact() {
		String str = "-------------------------------------------------\n";
		
		str +=  "You entered a new Employee \n" ;
		str += "Name: " + FirstName+" "+LastName + "\n";
		str += "SSN:   " + SSN + "\n";
		return str += "-------------------------------------------------\n";
		}
}	


