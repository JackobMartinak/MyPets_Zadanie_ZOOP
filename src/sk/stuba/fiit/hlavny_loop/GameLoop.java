package sk.stuba.fiit.hlavny_loop;

import sk.stuba.fiit.BreedingStation.*;
import sk.stuba.fiit.Human.*;
import sk.stuba.fiit.Pet.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class GameLoop {

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
		System.out.println("Every day you can do 10 tasks after 10 tasks your day ends. So choose carefully.");
		System.out.println("Let's the journey begin!");
		System.out.println("==================================================================");

		int num_of_tasks = 0;

		// station.GetPetInfo(0, 'd');

		while (station.GetPet() > 0) {
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
					int times = 0;
					for (int i = 0; i < station.GetPet(); i++) {
						if (station.GetDogs() > 0) {
							System.out.printf("%-5s %s %n", times, station.GetDogName(i));
							times++;
						}
						if (station.GetCats() > 0) {
							System.out.printf("%-5s %s %n", times, station.GetCatName(i));
							times++;
						}

					}
					System.out.printf("%-5s All dogs %n", times);

					System.out.printf("%-5s All cats %n", times);

					int walk = input.nextInt();
					// TODO Do a logic for unknown inputs from above code
				}
				// TODO Finish the 10 task logic coditions
			}

			station.SetPet(0);
		}
	}

}
