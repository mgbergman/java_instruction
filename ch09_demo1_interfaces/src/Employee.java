
public class Employee extends Person implements Printable, DepartmentConstants {
	
	private String SSN;
	private int department;

	public Employee() {
	}

	
	
	public Employee(String firstName, String lastName, String ssn, int dept) {
		super(firstName, lastName);
		this.SSN = ssn;
		this.department = dept;
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



	@Override
	public void print() {
		String dept = "Unknown";
		if (department == EDITORIAL) {
			dept = "Editorial";
		}	else if (department == ADMIN) {
			dept = "Administration";
		}	else if (department == MARKETING) {
				dept = "Marketing";
			}
			
		System.out.println (FirstName + " " + LastName
								+ "(" +dept+ ")");
		}
			
		
	}



