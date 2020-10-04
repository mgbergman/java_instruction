
public class Customer extends Person {
	
	private String CustNumber;

	
	
	public Customer() {
	}


	


	public Customer(String firstName, String lastName, String custNumber) {
		super(firstName, lastName);
		this.CustNumber = custNumber;
		
	}

	public String getCustNumber() {
		return CustNumber;
	}


	public void setCustNumber(String custNumber) {
		CustNumber = custNumber;
	}
	
	public String displayContact() {
	String str = "-------------------------------------------------\n";
	str +=  "You entered a new Customer \n" ;
	str += "Name: " + FirstName+" "+LastName + "\n";
	str += "Customer Number:      " + CustNumber + "\n";
	return str += "-------------------------------------------------\n";
	
}
}

