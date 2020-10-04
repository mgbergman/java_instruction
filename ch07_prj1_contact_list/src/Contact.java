import java.util.Scanner;

public class Contact {
	
	private String firstName;
	private String lastName;
	private String eMail;
	private String phone;
	
	public Contact() {
		
	}

	public void setFirstName(String firstname) {
		this.firstName = firstname;
		}	
			
	public String getFirstName() {
		return firstName;	
		}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
		}
				
	public String getLastName() {;
		
		
		return lastName;
		}
	
	public void setEmail(String eMail) {
		this.eMail = eMail;
		}	
			
	public String getEmail() {
		return eMail;
		}	
	
	public void setPhone(String phone) {
		this.phone = phone;
		}	
		
	public String getPhone() {
		return phone;
		}	
	
	
	public String displayContact() {
		String str = "-------------------------------------------------\n";
		str += "-------Current Contact---------------------------\n";
		str += "-------------------------------------------------\n";
		str += "Name:          "+ firstName + " " + lastName+ "\n" ;
		str += "Email Address: "+ eMail + "\n";
		str += "Phone Number:  "+ phone + "\n";
		str += "-------------------------------------------------\n";
		
		return str;
	}

	public Contact(String firstName, String lastName, String eMail, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.phone = phone;
	}
	
	
	
	
	}	

	

