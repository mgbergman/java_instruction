
public class Sheep extends Animal implements Cloneable {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getCountString() {
	
		return super.getCountString();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}
	
	

}
