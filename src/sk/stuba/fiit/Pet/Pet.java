package sk.stuba.fiit.Pet;

public abstract class Pet {
	private String name;
	private int age;
	private static int health = 100;
	private int happiness = 100;
	private boolean isClean = true;
	private boolean isInCage = false;
	private char gender;
	private boolean goingForWalk = false;
	private boolean isHungry = false;
	private boolean isHydrated = true;
	private int bowlOfWater = 100;

	public Pet(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (this.getClass() != o.getClass())
			return false;
		else {
			return false;
		}
	}

	public abstract void SetPrice(int pr);

	public void GoingForWalk(boolean l) {
		this.goingForWalk = l;
	}

	public boolean IsInCage() {
		return this.isInCage;
	}

	// Getting the name of the Pet
	public String GetName() {
		return this.name;
	}

	public String toString() {
		return this.name;
	}

	// Getting the age of the Pet
	public int GetAge() {
		return this.age;
	}

	// Getting the Health of the Pet
	public int GetHealth() {
		return health;
	}

	public boolean GetHydration() {
		return this.isHydrated;
	}

	public void SetHydration(boolean hd) {
		this.isHydrated = hd;
	}

	public boolean GetHunger() {
		return this.isHungry;
	}

	public void SetHunger(boolean h) {
		this.isHungry = h;
	}

	// Setting the value of Health
	public void SetHealth(int hp, String a) {
		if (a.equalsIgnoreCase("+")) {
			health += hp;
			if (health > 100) {
				health = 100;
			}
		}
		if (a.equalsIgnoreCase("-")) {
			health -= hp;

		}

	}

	// Getting the value if Pet is clean
	public boolean GetCleanliness() {
		return this.isClean;
	}

	// Setting the value if Pet is Clean
	public void SetCleanliness(boolean cl) {
		this.isClean = cl;
	}

	// Getting the happiness of Per
	public int GetHappiness() {
		return this.happiness;
	}

	// Setting Happiness of Pet and then printing the Text value of the int
	public void SetHappiness(int happ) {
		if (happ > 0 && happ <= 100) {
			this.happiness = happ;
			if (this.happiness >= 90 && this.happiness <= 100) {
				System.out.println("Very Happy!");
			} else if (this.happiness < 90 && this.happiness >= 60) {
				System.out.println("Happy!");
			} else if (this.happiness < 60 && this.happiness >= 30) {
				System.out.println("Could be better!");
			} else {
				System.out.println("The Worst!");
			}
		} else {
			System.out.println("Incorrect Value");
		}
	}

	public void SetHappiness() {
		this.happiness = 100;
	}

	public int GetBowlOfWater() {
		return this.bowlOfWater;
	}

	public void SetBowlOfWater(int n) {
		this.bowlOfWater = n;
	}

}
