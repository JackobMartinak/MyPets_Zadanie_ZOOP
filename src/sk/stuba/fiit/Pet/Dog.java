package sk.stuba.fiit.Pet;

public class Dog extends Pet {
	private int price = 500;
	private int puppies = 0;

	public Dog(String name, int age, char gender) {
		super(name, age, gender);
	}

	public int GetPrice() {
		return this.price;
	}

	public void SetPrice(int pr) {
		if (pr > 0) {
			this.price = pr;
		} else {
			System.out.println("Incorrect price");
		}
	}

	public void MakingPuppies() {
		// TODO do function for this
	}
}
