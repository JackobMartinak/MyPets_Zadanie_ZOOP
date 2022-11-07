package sk.stuba.fiit.Pet;

public class Cat extends Pet {
	private int price = 300;
	private int kittens = 0;

	public Cat(String name, int age, char gender) {
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

	public void MakingKittens() {
		// TODO Do a function for this
	}
}
