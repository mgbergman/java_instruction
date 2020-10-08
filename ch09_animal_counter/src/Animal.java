
public abstract class Animal implements Countable {

	int animalCount = 0;

	@Override
	public void incrementCount() {
		animalCount++;
		
	}

	@Override
	public void resetCount() {
		animalCount = 1;
		
	}

	@Override
	public int getCount() {
	
		return animalCount;
	}

	@Override
	public String getCountString() {
		
		return animalCount + "  animal";
	}
	
	

}
