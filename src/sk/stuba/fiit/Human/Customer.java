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

	/**
	 * Method for creating instance of Customer, which has private Constructor
	 * 
	 * @param name  argument for the name of the Customer
	 * @param money argumnet for money that the Customer has
	 * @param pets  argumnet fot how many pets he already owns
	 * @return will return new Instance of Customer
	 */
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

}
