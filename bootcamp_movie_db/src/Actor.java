
public class Actor {
	
	private static int actorID;
	private String firstName;
	private String lastName;
	private String gender;
	private String birthdate;
	
	public Actor() {
	}
	
	public Actor(int actorID, String firstName, String lastName, String gender, String birthdate) {
		this.actorID = actorID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthdate = birthdate;
	}


	public static int getActorID() {
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

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "Actor [actorID=" + actorID + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
				+ gender + ", birthdate=" + birthdate + "]";
	}

	public String displayContact() {
		String str = "-------------------------------------------------\n";
		str += "-------------------------------------------------\n";
		str +=  firstName + " " + lastName+ "\n" ;
		str += "is "+ gender + "and was born on " + birthdate + "\n";
		str += "-------------------------------------------------\n";
		
		return str;
	}
	}
	
	
	
	
	
	
	
	


