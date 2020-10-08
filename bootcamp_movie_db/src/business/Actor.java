package business;

public class Actor {
	
	private int actorID;
	private String firstName;
	private String lastName;
	private String gender;
	private String birthDate;
	
	public Actor() {
	}
	
	public Actor(int actorID, String firstName, String lastName, String gender, String birthDate) {
		this.actorID = actorID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDate = birthDate;
	}


	public int getActorID() {
		return actorID;
	}

	public void setActorID(int actorID) {
		this.actorID = actorID;
	}

	public Actor(int actorID) {
		this.actorID = actorID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getbirthDate() {
		return birthDate;
	}

	public void setbirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Actor [actorID=" + actorID + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
				+ gender + ", birthDate=" + birthDate + "]";
	}

	public String displayContact() {
		String str = "-------------------------------------------------\n";
		str += "-------------------------------------------------\n";
		str +=  actorID + " " + firstName + " " + lastName+ "\n" ;
		str += "is "+ (gender.equalsIgnoreCase("M")? "Male":"Female") + " and was born on " + birthDate + "\n";
		str += "-------------------------------------------------\n";
		
		return str;
	}
	}
	
	
	
	
	
	
	
	


