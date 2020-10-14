package business;

import java.time.LocalDate;

public class Actor {
	
	private int ID;
	private String firstName;
	private String lastName;
	private String gender;
	private LocalDate birthDate;

	
	public Actor() {
	}
	
	
	public Actor(int ID, String firstName, String lastName, String gender, LocalDate birthDate) {
		super();
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDate = birthDate;
	}




	public int getID() {
		return ID;
	}

	public void setID(int actorID) {
		this.ID = ID;
	}

	public Actor(int ID) {
		this.ID = ID;
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

	
	public LocalDate getBirthDate() {
		
		
		return birthDate;
	}


	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}


	

	@Override
	public String toString() {
		return ("actorID=" + ID + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
				+ gender + ", birthDate=" + birthDate);
	}

	public String displayContact() {
		String str = "-------------------------------------------------\n";
		str += "-------------------------------------------------\n";
		str +=  ID + " " + firstName + " " + lastName+ "\n" ;
		str += "is "+ (gender.equalsIgnoreCase("M")? "Male":"Female") + " and was born on " + birthDate + "\n";
		str += "-------------------------------------------------\n";
		
		return str;
	}
	}
	
	
	
	
	
	
	
	


