
public class PrsUser {

	private String UserName;
	private String Password;
	private String FirstName;
	private String LastName;
	private String UserPhoneNumber;
	private String UserEmail;
	private String Reviewer;
	private String Admin;
	
	public PrsUser() {
	}

	public PrsUser(String userName, String password, String firstName, String lastName, String phoneNumber,
			String email, String reviewer, String admin) {
		UserName = userName;
		Password = password;
		FirstName = firstName;
		LastName = lastName;
		UserPhoneNumber = phoneNumber;
		UserEmail = email;
		Reviewer = reviewer;
		Admin = admin;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getUserPhoneNumber() {
		return UserPhoneNumber;
	}

	public void setUserPhoneNumber(String phoneNumber) {
		UserPhoneNumber = phoneNumber;
	}

	public String getUserEmail() {
		return UserEmail;
	}

	public void setUserEmail(String email) {
		UserEmail = email;
	}

	public String getReviewer() {
		return Reviewer;
	}

	public void setReviewer(String reviewer) {
		Reviewer = reviewer;
	}

	public String getAdmin() {
		return Admin;
	}

	public void setAdmin(String admin) {
		Admin = admin;
	}

	@Override
	public String toString() {
		return "PrsUser [UserName=" + UserName + ", Password=" + Password + ", FirstName=" + FirstName + ", LastName="
				+ LastName + ", PhoneNumber=" + UserPhoneNumber + ", Email=" + UserEmail + ", Reviewer=" + Reviewer + ", Admin="
				+ Admin + ", getUserName()=" + getUserName() + ", getPassword()=" + getPassword() + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName() + ", getPhoneNumber()=" + getUserPhoneNumber()
				+ ", getEmail()=" + getUserEmail() + ", getReviewer()=" + getReviewer() + ", getAdmin()=" + getAdmin()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
}
