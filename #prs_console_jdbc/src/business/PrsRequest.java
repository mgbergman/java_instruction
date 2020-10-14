package business;

public class PrsRequest {
	
	
		private int UserID;
		private String Description;
		private String Justification;
		private String DateNeeded;
		private String DeliveryMode;
		private String Status;
		private Double Total;
		private String SubmittedDate;
		private String ReasonForRejection;
		
		public PrsRequest() {
		}

		public PrsRequest(int userID, String description, String justification, String dateNeeded, String deliveryMode,
				String status, Double total, String submittedDate, String reasonForRejection) {
			UserID = userID;
			Description = description;
			Justification = justification;
			DateNeeded = dateNeeded;
			DeliveryMode = deliveryMode;
			Status = status;
			Total = total;
			SubmittedDate = submittedDate;
			ReasonForRejection = reasonForRejection;
		}

		public int getUserID() {
			return UserID;
		}

		public void setUserID(int userID) {
			UserID = userID;
		}

		public String getDescription() {
			return Description;
		}

		public void setDescription(String description) {
			Description = description;
		}

		public String getJustification() {
			return Justification;
		}

		public void setJustification(String justification) {
			Justification = justification;
		}

		public String getDateNeeded() {
			return DateNeeded;
		}

		public void setDateNeeded(String dateNeeded) {
			DateNeeded = dateNeeded;
		}

		public String getDeliveryMode() {
			return DeliveryMode;
		}

		public void setDeliveryMode(String deliveryMode) {
			DeliveryMode = deliveryMode;
		}

		public String getStatus() {
			return Status;
		}

		public void setStatus(String status) {
			Status = status;
		}

		public Double getTotal() {
			return Total;
		}

		public void setTotal(Double total) {
			Total = total;
		}

		public String getSubmittedDate() {
			return SubmittedDate;
		}

		public void setSubmittedDate(String submittedDate) {
			SubmittedDate = submittedDate;
		}

		public String getReasonForRejection() {
			return ReasonForRejection;
		}

		public void setReasonForRejection(String reasonForRejection) {
			ReasonForRejection = reasonForRejection;
		}

		@Override
		public String toString() {
			return "PrsRequest [UserID=" + UserID + ", Description=" + Description + ", Justification=" + Justification
					+ ", DateNeeded=" + DateNeeded + ", DeliveryMode=" + DeliveryMode + ", Status=" + Status
					+ ", Total=" + Total + ", SubmittedDate=" + SubmittedDate + ", ReasonForRejection="
					+ ReasonForRejection + "]";
		}
		
		

}
