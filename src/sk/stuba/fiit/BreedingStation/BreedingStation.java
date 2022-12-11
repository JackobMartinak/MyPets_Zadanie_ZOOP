package sk.stuba.fiit.BreedingStation;

import java.util.ArrayList;
import java.util.List;
import sk.stuba.fiit.Pet.*;

public class BreedingStation {
	private final String NAME;
	private int day = 0;
	private int num_of_events;
	private int num_of_pets;
	List<Dog> dogs = new ArrayList<Dog>();
	List<Cat> cats = new ArrayList<Cat>();

	public BreedingStation(String name, int num_of_pets, List<String> names) {
		this.NAME = name;
		this.num_of_pets = num_of_pets;
		for (int i = 0; i < this.num_of_pets; i++) {
			if (i % 2 == 0) {
				dogs.add(new Dog(names.get(i), 1, 'm'));
			} else {
				dogs.add(new Dog(names.get(i), 1, 'f'));
			}
			// System.out.println(names.get(i));
		}
	}

	public void RandomEvent() {
		// TODO Create random event function
	}

	public void NextDay() {
		this.day++;
	}

	public int GetDay() {
		return this.day;
	}

	public void SetPet(int n) {
		this.num_of_pets = n;
		// TODO Code for adding or subtracting pets to/from Station
	}

	public int GetPet() {
		return this.num_of_pets;
	}

	public int GetDogs_size() {
		return dogs.size();
	}

	public Dog GetDog(int n) {
		return dogs.get(n);
	}

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
		dogs.remove(n);
	}

	public void CatRemove(int n) {
		cats.remove(n);
	}
}
