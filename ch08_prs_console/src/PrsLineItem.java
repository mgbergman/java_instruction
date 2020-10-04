
public class PrsLineItem {
	
		private int RequestID;
		private int ProductID;
		private int Quantity;
		
		public PrsLineItem() {
		}

		public PrsLineItem(int requestID, int productID, int quantity) {
			RequestID = requestID;
			ProductID = productID;
			Quantity = quantity;
		}

		public int getRequestID() {
			return RequestID;
		}

		public void setRequestID(int requestID) {
			RequestID = requestID;
		}

		public int getProductID() {
			return ProductID;
		}

		public void setProductID(int productID) {
			ProductID = productID;
		}

		public int getQuantity() {
			return Quantity;
		}

		public void setQuantity(int quantity) {
			Quantity = quantity;
		}

		@Override
		public String toString() {
			return "PrsLineItem [RequestID=" + RequestID + ", ProductID=" + ProductID + ", Quantity=" + Quantity + "]";
		}
		
		
		
		
		
		
	

}
