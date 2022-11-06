package sk.stuba.fiit.Pet;

public class Cat extends Pet {
	private int price = 300;
	private char gender;
	private boolean hungry = false;
	private boolean hydrated = true;
	private boolean isInCage = false;
	private boolean goingForWalk = false;
	private int kittens = 0;
	

	public Cat(String name, int age, char gender) {
		super(name, age);
		this.gender = gender;
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
	public boolean GetHunger() {
		return this.hungry;
	}
	public void MakingKittens() {
		// TODO Do a function for this
	}
}
