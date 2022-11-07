package sk.stuba.fiit.Pet;

public class Pet {
	private String name;
	private int age;
	private int health = 100;
	private int happiness = 100;
	private boolean isClean = true;
	private boolean isInCage = false;
	private char gender;
	private boolean goingForWalk = false;
	private boolean hungry = false;
	private boolean hydrated = true;

	public Pet(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

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

	// Getting the age of the Pet
	public int GetAge() {
		return this.age;
	}

	// Getting the Health of the Pet
	public int GetHealth() {
		return this.health;
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

	// Setting the value of Health
	public void SetHealth(int hp) {
		if (hp <= 100 && hp > 0) { // Checking if the value is correct
			this.health = hp;
		} else {
			System.out.println("Incorrect Value");
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
}
