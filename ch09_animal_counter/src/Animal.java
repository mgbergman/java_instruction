
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
		// TODO Auto-generated method stub
		return animalCount;
	}

	@Override
	public String getCountString() {
		// TODO Auto-generated method stub
		return animalCount + "animal";
	}
	
	

}
