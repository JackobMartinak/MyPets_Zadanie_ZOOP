package sk.stuba.fiit.Pet;

public class Dog extends Pet {
	private int price = 500;
	private int puppies = 0;

	public Dog(String name, int age, char gender) {
		super(name, age, gender);
	}

	public boolean IsInCage(String name) {
		if (this.IsInCage()) {
			System.out.printf("%s is in cage!", this.GetName());

		} else {
			System.out.printf("%s is not in cage!", this.GetName());
		}
		return this.IsInCage();
	}

	public int GetPrice() {
		return this.price;
	}

	@Override
	public void SetPrice(int pr) {
		if (pr > 0) {
			this.price = pr;
		} else {
			System.out.println("Incorrect price");
		}
	}

	public Dog MakePuppies(String name, char gender) {
		// UPCASTING

		DogBabies newborn = new DogBabies(name, 0, gender);
		Dog upcastedNewBorn = (Dog) newborn;

		return upcastedNewBorn;
	}

}
