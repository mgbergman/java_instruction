package business;

public class PrsUser {

	private int ID;
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

	public PrsUser(int id, String userName, String password, String firstName, String lastName, String phoneNumber,
			String email, String reviewer, String admin) {
		ID = id;
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
		return "PrsUser [ID=" + ID + ", UserName=" + UserName + ", Password=" + Password + ", FirstName=" + FirstName
				+ ", LastName=" + LastName + ", UserPhoneNumber=" + UserPhoneNumber + ", UserEmail=" + UserEmail
				+ ", Reviewer=" + Reviewer + ", Admin=" + Admin + "]";
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String displaySummary() {
		// TODO Auto-generated method stub
		String str = ("id: "+ ID + ", "+FirstName +" "+LastName);
		return str;
	}

	
	
	
	
	
	
	
	
	
	
}
