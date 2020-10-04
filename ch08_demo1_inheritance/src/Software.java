
public class Software extends Product {
	
	private String Version;

	public Software() {
		super();
		
	}

	public Software(String code, String description, double price, String Version) {
		super(code, description, price);
		this.Version = Version;
		
	}

	public String getVersion() {
		return Version;
	}

	public void setVersion(String version) {
		Version = version;
	}
	
	public String toString() {
		return "Software [version=" + Version + ", toString()=" + super.toString() + "]";
	
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Software) {
			Software software2 = (Software)obj;
			if (this.getCode().equalsIgnoreCase(software2.getCode())) {
				return true;
			}
		}
		return false;
	}
	
	
	
	

}
