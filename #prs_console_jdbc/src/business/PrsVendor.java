package business;

public class PrsVendor {
		private String Code;
		private String Name;
		private String Address;
		private String City;
		private String State;
		private String Zip;
		private String VendPhoneNumber;
		private String VendEmail;
		
		public PrsVendor() {
		}

		public PrsVendor(String code, String name, String address, String city, String state, String zip,
				String phoneNumber, String email) {
			Code = code;
			Name = name;
			Address = address;
			City = city;
			State = state;
			Zip = zip;
			VendPhoneNumber = phoneNumber;
			VendEmail = email;
		}

		public String getCode() {
			return Code;
		}

		public void setCode(String code) {
			Code = code;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getAddress() {
			return Address;
		}

		public void setAddress(String address) {
			Address = address;
		}

		public String getCity() {
			return City;
		}

		public void setCity(String city) {
			City = city;
		}

		public String getState() {
			return State;
		}

		public void setState(String state) {
			State = state;
		}

		public String getZip() {
			return Zip;
		}

		public void setZip(String zip) {
			Zip = zip;
		}

		public String getVendPhoneNumber() {
			return VendPhoneNumber;
		}

		public void setVendPhoneNumber(String phoneNumber) {
			VendPhoneNumber = phoneNumber;
		}

		public String getVendEmail() {
			return VendEmail;
		}

		public void setVendEmail(String email) {
			VendEmail = email;
		}

		@Override
		public String toString() {
			return "PrsVendor [Code=" + Code + ", Name=" + Name + ", Address=" + Address + ", City=" + City + ", State="
					+ State + ", Zip=" + Zip + ", PhoneNumber=" + VendPhoneNumber + ", VendEmail=" + VendEmail + "]";
		}
		
		
	
	
	
	
	
}
