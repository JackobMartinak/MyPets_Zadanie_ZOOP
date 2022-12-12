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

	public boolean IsInCage(String name) {
		if (this.IsInCage()) {
			System.out.printf("%s is in cage!", this.GetName());

		} else {
			System.out.printf("%s is not in cage!", this.GetName());
		}
		return this.IsInCage();
	}

	public void SetPrice(int pr) {
		if (pr > 0) {
			this.price = pr;
		} else {
			System.out.println("Incorrect price");
		}
	}

	public Cat MakeKittens(String name, char gender) {
		CatBabies newborn = new CatBabies(name, 0, gender);
		Cat upcastedNewBorn = (Cat) newborn;

		return upcastedNewBorn;
	}
}
