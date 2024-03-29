package sk.stuba.fiit.BreedingStation;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
import java.util.Scanner;

import sk.stuba.fiit.Human.Customer;
import sk.stuba.fiit.Pet.*;

public class BreedingStation {
	private final String NAME;
	private int day = 0;
	private int numOfEvents;
	private int numOfPets;
	List<Dog> dogs = new ArrayList<Dog>();
	List<Cat> cats = new ArrayList<Cat>();
	List<String> eventList = new ArrayList<String>();
	Customer John = Customer.createCustomer("John", 500000, 0);

	public BreedingStation(String name, int numOfPets, List<String> names) {
		this.NAME = name;
		this.numOfPets = numOfPets;
		for (int i = 0; i < this.numOfPets; i++) {
			if (i % 2 == 0) {
				dogs.add(new Dog(names.get(i), 1, 'm'));
			} else {
				dogs.add(new Dog(names.get(i), 1, 'f'));
			}
			// System.out.println(names.get(i));
		}
		eventList.add("Broke something in the house");
		eventList.add("Hurt yourself");
		eventList.add("Need to eat");
		eventList.add("Is Agressive at people");
		eventList.add("Bit you");
		eventList.add("had New babies");
		eventList.add("Human came to buy");
		eventList.add("You were gifted a cat");
		numOfEvents = eventList.size();
	}

	/**
	 * An function for creating and executing Random Event for Every Day in game
	 * 
	 * @param rn       Argument which holds the random number
	 * @param dogOrCat Argument to determinig for whom will the random event happen
	 * @return will return the Event which took place
	 */
	public String RandomEvent(int rn, int dogOrCat) {
		int rand = (int) (Math.random() * eventList.size()) + 1;

		Scanner nameScanner = new Scanner(System.in);

		if (rand == 0) {
			if (dogOrCat == 1) {
				dogs.get(rn).SetHealth(10, "-");
			} else {
				cats.get(rn).SetHealth(5, "-");
				cats.get(rn).SetHappiness();
			}
		}

		if (rand == 1) {
			if (dogOrCat == 1) {
				dogs.get(rn).SetHealth(24, "-");
			} else {
				cats.get(rn).SetHealth(20, "-");
			}

		}

		if (rand == 2) {
			if (dogOrCat == 1) {
				dogs.get(rn).SetHunger(true);
			} else {
				cats.get(rn).SetHunger(true);
			}
		}

		if (rand == 3) {
			if (dogOrCat == 1) {
				dogs.get(rn).SetHappiness(60);
			} else {

			}
		}

		if (rand == 4) {
			if (dogOrCat == 1) {
				dogs.get(rn).SetHappiness(40);
			} else {
				cats.get(rn).SetHappiness(20);

			}

		}

		if (rand == 5) {
			if (dogOrCat == 1) {

				System.out.println("One of the dog is having puppy. What do you want to name the puppy: ");
				String newBornName = nameScanner.nextLine();
				int nwrand = (int) (Math.random() * 2) + 1;
				if (nwrand == 1) {
					dogs.add(dogs.get(rn).MakePuppies(newBornName, 'm'));

				} else {
					dogs.add(dogs.get(rn).MakePuppies(newBornName, 'f'));
				}

			} else {

				System.out.println("One of the cat is having kitten. What do you want to name the kitten: ");
				String newBornName = nameScanner.nextLine();
				int nwrand = (int) (Math.random() * 2) + 1;
				if (nwrand == 1) {
					cats.add(cats.get(rn).MakeKittens(newBornName, 'm'));

				} else {
					cats.add(cats.get(rn).MakeKittens(newBornName, 'f'));
				}
			}
		}

		if (rand == 6) {
			if (dogOrCat == 1) {
				System.out.println("He bought the dog.");
				John.SetMoney(John.GetMoney() - dogs.get(rn).GetPrice());
				dogs.remove(rn);
			} else {
				System.out.println("He bought the cat.");
				John.SetMoney(John.GetMoney() - cats.get(rn).GetPrice());
				cats.remove(rn);
			}
		}

		if (rand == 7) {

			System.out.println("You were gifted a cat, what would you name her: ");
			String catName = nameScanner.nextLine();
			cats.add(new Cat(catName, (int) (Math.random() * 4) + 1, 'f'));
		}

		return eventList.get(rand);
	}

	public int GetRandomEvents() {
		return numOfEvents;
	}

	public void NextDay() {
		this.day++;
	}

	public int GetDay() {
		return this.day;
	}

	public void SetPet(int n) {
		this.numOfPets = n;
	}

	public int GetPet() {
		return this.numOfPets;
	}

	public int GetDogs_size() {
		return dogs.size();
	}

	/**
	 * Returns an Dog object that can then be called with methods
	 *
	 * @param n Argument is an POSITIONAL INDEX OF THE SPECIFIC DOG object
	 * @return
	 */

	public Dog GetDog(int n) {
		return dogs.get(n);
	}

	/**
	 * Returns an Cat object that can then be called with methods
	 * 
	 * @param n Argument is an POSITIONAL INDEX OF THE SPECIFIC CAT object
	 * @return
	 */

	public Cat GetCat(int n) {
		return cats.get(n);
	}

	public int GetCats_size() {
		return cats.size();
	}

	public void GetName_station() {
		System.out.println(this.NAME);
	}

	public String toString() {
		return this.NAME;
	}

	public void GetPetInfo(int n, String p) {
		if (p.equalsIgnoreCase("d")) {
			System.out.printf("Dog %S INFO: %n", dogs.get(n).GetName());
			System.out.printf("Has %s happiness %n", dogs.get(n).GetHappiness());
			System.out.printf("Has %s health %n", dogs.get(n).GetHealth());
			System.out.printf("Has %s hunger %n", dogs.get(n).GetHunger());
			if (dogs.get(n).GetCleanliness()) {
				System.out.printf("%s is clean %n", dogs.get(n).GetName());
			} else {
				System.out.printf("%s needs to be showered %n", dogs.get(n).GetName());
			}
			if (dogs.get(n).GetHydration()) {
				System.out.printf("%s is hydrated. %n", dogs.get(n).GetName());
			} else {
				System.out.printf("%s need his bowl of water refilled. %n", dogs.get(n).GetName());
			}
			System.out.printf("Has %s happiness %n", dogs.get(n).GetHappiness());

		}
		if (p.equalsIgnoreCase("c")) {
			System.out.printf("Cat %S INFO: %n", cats.get(n).GetName());
			System.out.printf("Has %s happiness %n", cats.get(n).GetHappiness());
			System.out.printf("Has %s health %n", cats.get(n).GetHealth());
			System.out.printf("Has %s hunger %n", cats.get(n).GetHunger());
			if (cats.get(n).GetCleanliness()) {
				System.out.printf("%s is clean %n", cats.get(n).GetName());
			} else {
				System.out.printf("%s needs to be showered %n", cats.get(n).GetName());
			}
			if (cats.get(n).GetHydration()) {
				System.out.printf("%s is hydrated. %n", cats.get(n).GetName());
			} else {
				System.out.printf("%s need his bowl of water refilled. %n", cats.get(n).GetName());
			}
			System.out.printf("Has %s happiness %n", cats.get(n).GetHappiness());
		}
	}

	public void DogRemove(int n) {
		System.out.printf("%s has died. age: %s", dogs.get(n).GetName(), dogs.get(n).GetAge());
		dogs.remove(n);

	}

	public void CatRemove(int n) {
		System.out.printf("%s has died. age: %s", cats.get(n).GetName(), cats.get(n).GetAge());
		cats.remove(n);
	}
}
