package sk.stuba.fiit.Pet;

public class Dog extends Pet {
	private int price = 500;
	private int hunger = 100;
	char[] gender = {'m', 'f'};
	private boolean hydrated = true;
	private boolean isInCage = false;
	private boolean goingForWalk = false;
	private int puppies = 0;
	
	public Dog(String name, int age) {
		super(name, age);
	}
	
	public boolean IsInCage() {
		return this.isInCage;
	}
	public boolean GoingForWalk() {
		return this.goingForWalk;
	}
	public int GetPrice() {
		return this.price;
	}
	public void SetPrice(int pr) {
		if(pr > 0) {
			this.price = pr;
		} else {
			System.out.println("Incorrect price");
		}
	}
	public boolean GetHydration() {
		return this.hydrated;
	}
	public void SetHydration(boolean hd) {
		this.hydrated = hd;
	}
	public int GetHunger() {
		return this.hunger;
	}
	public void MakingPuppies() {
		// TODO do function for this
	}
}
