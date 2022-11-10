package sk.stuba.fiit.hlavny_loop;

import sk.stuba.fiit.BreedingStation.*;
import sk.stuba.fiit.Human.*;
import sk.stuba.fiit.Pet.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class GameLoop {

	public static void taskLogicForWalk(String n, BreedingStation station) {
		String converted = n.toLowerCase().replaceAll("\\s+", "");
		String allDogs = "alldogs";
		String allCats = "allcats";
		if (converted.equals(allDogs)) {
			for (int i = 0; i < station.GetDogs_size(); i++) {
				station.GetDog(i).GoingForWalk(true);
			}
			System.out.println("Going for walk with ALL DOGS");
		} else if (converted.equals(allCats)) {
			for (int j = 0; j < station.GetCats_size(); j++) {
				station.GetCat(j).GoingForWalk(true);
			}
			System.out.println("Going for walk with ALL CATS");
		} else {
			if (station.GetDogs_size() > 0) {
				for (int i = 0; i < station.GetDogs_size(); i++) {
					if (converted.equals(station.GetDog(i).GetName().toLowerCase().replaceAll("\\s+", ""))) {
						station.GetDog(i).GoingForWalk(true);
						System.out.printf("You took %s for a walk. %n", station.GetDog(i).GetName());
						break;
					}
				}
			}
			if (station.GetCats_size() > 0) {
				for (int j = 0; j < station.GetCats_size(); j++) {
					if (converted.equals(station.GetCat(j).GetName().toLowerCase().replaceAll("\\s+", ""))) {
						station.GetCat(j).GoingForWalk(true);
						System.out.printf("You took %s for a walk. %n", station.GetCat(j).GetName());
						break;
					}
				}
			}

		}
	}

	public static void main(String[] args) {

		String[] tasks = { "Go for a walk", "Shower", "Refill bowl of water", "Give Food", "Give Snack", "Play Fetch",
				"Pet", "Cuddle", "Buy a toy", "cut the claws", "cut the fur" };

		System.out.println("==================================================================");
		System.out.println("Hello there! Welcome to the Game MyPets!");
		System.out.println("In this game you will take care of you Pets in Breeding station.");
		System.out.println("So, let's begin! Please Choose a name for your Breeding Station: ");

		Scanner input = new Scanner(System.in);
		List<String> names = new ArrayList<String>();
		String name = input.nextLine();

		System.out.println("Now write names of two dogs: ");
		names.add(input.nextLine());
		names.add(input.nextLine());

		int num_of_petsInStation = 2;

		BreedingStation station = new BreedingStation(name, num_of_petsInStation, names);

		System.out.printf("Your station %s be Starting with %s Pets. %n", name, num_of_petsInStation);
		System.out.println("Every day you can do 4 tasks after 4 tasks your day ends. So choose carefully.");
		System.out.println("Let's the journey begin!");
		System.out.println("==================================================================");

		int num_of_tasks = 0;

		// station.GetPetInfo(0, 'd');

		while (station.GetPet() > 0) {
			System.out.println(station.GetCats_size());
			System.out.printf("%n ======================== %n");
			System.out.printf("%-5S Day %s %n", "", station.GetDay());
			System.out.println("========================");

			while (num_of_tasks < 4) {
				for (int i = 0; i < tasks.length; i++) {
					System.out.printf("%s - %s %n", i, tasks[i]);
				}
				int task = input.nextInt();

				if (task == 0) {
					System.out.println("Who to take for a Walk?");
					System.out.println("========================");
					System.out.printf("%-10s DOGS %n", "");
					if (station.GetDogs_size() > 0) {

						for (int i = 0; i < station.GetDogs_size(); i++) {
							System.out.printf("%-5s %s %n", "-", station.GetDog(i).GetName());
						}
						System.out.printf("%-5s All dogs %n", "-");
					} else {
						System.out.printf("%-5s You Dont Have a Dog. %n", "-");
					}
					System.out.println("========================");
					System.out.printf("%-10s Cats %n", "");
					if (station.GetCats_size() > 0) {

						for (int i = 0; i < station.GetCats_size(); i++) {
							System.out.printf("%-5s %s %n", "-", station.GetCat(i).GetName());
						}
						System.out.printf("%-5s All cats %n", "-");
					} else {
						System.out.printf("%-5s You Dont Have a cat. %n", "-");
					}
					// input.next(); // Clearing the buffer

					Scanner input_two = new Scanner(System.in);
					String walk = input_two.nextLine();

					taskLogicForWalk(walk, station);
					num_of_tasks++;
				}
				// TODO Finish the 10 task logic coditions
			}

			station.SetPet(0);
		}
	}

}
