
public class PrsProduct {
	
	private int VendorID;
	private String PartNumber;
	private String PartName;
	private Double Price;
	private String Unit;
	private String PhotoPath;
	
	public PrsProduct() {
	}

	public PrsProduct(int vendorID, String partNumber, String name, Double price, String unit, String photoPath) {
		VendorID = vendorID;
		PartNumber = partNumber;
		PartName = name;
		Price = price;
		Unit = unit;
		PhotoPath = photoPath;
	}

	public int getVendorID() {
		return VendorID;
	}

	public void setVendorID(int vendorID) {
		VendorID = vendorID;
	}

	public String getPartNumber() {
		return PartNumber;
	}

	public void setPartNumber(String partNumber) {
		PartNumber = partNumber;
	}

	public String getName() {
		return PartName;
	}

	public void setName(String name) {
		PartName = name;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public String getUnit() {
		return Unit;
	}

	public void setUnit(String unit) {
		Unit = unit;
	}

	public String getPhotoPath() {
		return PhotoPath;
	}

	public void setPhotoPath(String photoPath) {
		PhotoPath = photoPath;
	}

	@Override
	public String toString() {
		return "PrsProduct [VendorID=" + VendorID + ", PartNumber=" + PartNumber + ", Name=" + PartName + ", Price=" + Price
				+ ", Unit=" + Unit + ", PhotoPath=" + PhotoPath + "]";
	}
	
	
	
	
	
	
	
	

}
