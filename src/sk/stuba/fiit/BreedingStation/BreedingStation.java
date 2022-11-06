package sk.stuba.fiit.BreedingStation;

import java.util.ArrayList;
import java.util.List;
import sk.stuba.fiit.Pet.*;

public class BreedingStation {
	private String name;
	private int day = 0;
	private int num_of_events;
	private int num_of_pets;
	List<Pet> pets = new ArrayList<Pet>();

	public BreedingStation(String name, int num_of_pets, List<String> names) {
		this.name = name;
		this.num_of_pets = num_of_pets;
		for (int i = 0; i < this.num_of_pets; i++) {
			pets.add(new Dog(names.get(i), 1));
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

	public void SetPet() {
		// TODO Code for adding or subtracting pets to/from Station
	}

	public int GetPet() {
		return this.num_of_pets;
	}

	public void GetName() {
		System.out.println(this.name);
	}
}
