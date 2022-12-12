package sk.stuba.fiit.Human;

public class Customer extends Human {

	private boolean isBuying = true;
	private int pets;
	private int money;

	private Customer(String name, int money, int pets) {
		super(name, money, pets);
		this.pets = pets;
		this.money = money;
	}

	public static Customer createCustomer(String name, int money, int pets) {
		return new Customer(name, money, pets);
	}

	public void SetIsBuying(boolean ib) {
		this.isBuying = ib;
	}

	public boolean GetIsBuying() {
		return this.isBuying;
	}

	public void CheckHealth(int hpOfPet) {
		if (hpOfPet >= 90) {
			System.out.println("This Pet is very healthy!");
		} else if (hpOfPet < 90 && hpOfPet >= 60) {
			System.out.println("This Pet is Healthy, but you should get him checked!");
		} else if (hpOfPet < 60) {
			System.out.println("You should go visit a vet with this Pet");
		}
	}

	public void PrintStatus(int pet) {
		System.out.printf("%s has %s pets and %s in his account");
		// TODO Finish naming for OVERRIDE METHOD
	}

}
