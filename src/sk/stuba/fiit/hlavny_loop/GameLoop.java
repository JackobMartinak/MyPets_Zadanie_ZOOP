package sk.stuba.fiit.hlavny_loop;

import sk.stuba.fiit.BreedingStation.*;

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

	public static void shower(String n, BreedingStation station) {
		String converted = n.toLowerCase().replaceAll("\\s+", "");
		String allDogs = "alldogs";
		String allCats = "allcats";
		if (converted.equals(allDogs)) {
			for (int i = 0; i < station.GetDogs_size(); i++) {
				station.GetDog(i).SetCleanliness(true);
			}
			System.out.println("Showering all the Dogs!");
		} else if (converted.equals(allCats)) {
			for (int j = 0; j < station.GetCats_size(); j++) {
				station.GetCat(j).SetCleanliness(true);
			}
			System.out.println("Showering all the Cats!");
		} else {
			if (station.GetDogs_size() > 0) {
				for (int i = 0; i < station.GetDogs_size(); i++) {
					if (converted.equals(station.GetDog(i).GetName().toLowerCase().replaceAll("\\s+", ""))) {
						station.GetDog(i).SetCleanliness(true);
						System.out.printf("You showered %s. %n", station.GetDog(i).GetName());
						break;
					}
				}
			}
			if (station.GetCats_size() > 0) {
				for (int j = 0; j < station.GetCats_size(); j++) {
					if (converted.equals(station.GetCat(j).GetName().toLowerCase().replaceAll("\\s+", ""))) {
						station.GetCat(j).SetCleanliness(true);
						System.out.printf("You showered %s. %n", station.GetCat(j).GetName());
						break;
					}
				}
			}

		}
	}

	public static void refillBowlOfWater(String n, BreedingStation station) {
		String converted = n.toLowerCase().replaceAll("\\s+", "");
		String allDogs = "alldogs";
		String allCats = "allcats";
		if (converted.equals(allDogs)) {
			for (int i = 0; i < station.GetDogs_size(); i++) {
				station.GetDog(i).SetBowlOfWater(100);
				;
			}
			System.out.println("Replacing everyone's bowls of water! %n");
		} else if (converted.equals(allCats)) {
			for (int j = 0; j < station.GetCats_size(); j++) {
				station.GetCat(j).SetBowlOfWater(100);
			}
			System.out.println("Replacing bowls of water for ALL CATS %n");
		} else {
			if (station.GetDogs_size() > 0) {
				for (int i = 0; i < station.GetDogs_size(); i++) {
					if (converted.equals(station.GetDog(i).GetName().toLowerCase().replaceAll("\\s+", ""))) {
						station.GetDog(i).SetBowlOfWater(100);
						System.out.printf("You replaced water in %s's bowl %n", station.GetDog(i).GetName());
						break;
					}
				}
			}
			if (station.GetCats_size() > 0) {
				for (int j = 0; j < station.GetCats_size(); j++) {
					if (converted.equals(station.GetCat(j).GetName().toLowerCase().replaceAll("\\s+", ""))) {
						station.GetCat(j).SetBowlOfWater(100);
						System.out.printf("Replaced bowl of water for %s .%n", station.GetCat(j).GetName());
						break;
					}
				}
			}

		}
	}

	public static void giveFood(String n, BreedingStation station) {
		String converted = n.toLowerCase().replaceAll("\\s+", "");
		String allDogs = "alldogs";
		String allCats = "allcats";
		if (converted.equals(allDogs)) {
			for (int i = 0; i < station.GetDogs_size(); i++) {
				station.GetDog(i).SetHunger(false);
				;
			}
			System.out.println("Giving food to ALL DOGS! %n");
		} else if (converted.equals(allCats)) {
			for (int j = 0; j < station.GetCats_size(); j++) {
				station.GetCat(j).SetHunger(false);
			}
			System.out.println("Giving food to ALL CATS %n");
		} else {
			if (station.GetDogs_size() > 0) {
				for (int i = 0; i < station.GetDogs_size(); i++) {
					if (converted.equals(station.GetDog(i).GetName().toLowerCase().replaceAll("\\s+", ""))) {
						station.GetDog(i).SetHunger(false);
						System.out.printf("You gave food to %s. %n", station.GetDog(i).GetName());
						break;
					}
				}
			}
			if (station.GetCats_size() > 0) {
				for (int j = 0; j < station.GetCats_size(); j++) {
					if (converted.equals(station.GetCat(j).GetName().toLowerCase().replaceAll("\\s+", ""))) {
						station.GetCat(j).SetHunger(false);
						System.out.printf("You gave food to %s .%n", station.GetCat(j).GetName());
						break;
					}
				}
			}

		}
	}

	public static void giveHealthySnack(String n, BreedingStation station) {
		String converted = n.toLowerCase().replaceAll("\\s+", "");
		String allDogs = "alldogs";
		String allCats = "allcats";
		if (converted.equals(allDogs)) {
			for (int i = 0; i < station.GetDogs_size(); i++) {
				station.GetDog(i).SetHappiness();
				;
			}
			System.out.println("Giving snack to ALL DOGS! %n");
		} else if (converted.equals(allCats)) {
			for (int j = 0; j < station.GetCats_size(); j++) {
				station.GetCat(j).SetHappiness();
			}
			System.out.println("Giving snack to ALL CATS %n");
		} else {
			if (station.GetDogs_size() > 0) {
				for (int i = 0; i < station.GetDogs_size(); i++) {
					if (converted.equals(station.GetDog(i).GetName().toLowerCase().replaceAll("\\s+", ""))) {
						station.GetDog(i).SetHappiness();
						System.out.printf("You gave snack to %s. %n", station.GetDog(i).GetName());
						break;
					}
				}
			}
			if (station.GetCats_size() > 0) {
				for (int j = 0; j < station.GetCats_size(); j++) {
					if (converted.equals(station.GetCat(j).GetName().toLowerCase().replaceAll("\\s+", ""))) {
						station.GetCat(j).SetHappiness();
						System.out.printf("You gave snack to %s .%n", station.GetCat(j).GetName());
						break;
					}
				}
			}

		}
	}

	public static void playFetch(String n, BreedingStation station) {
		String converted = n.toLowerCase().replaceAll("\\s+", "");
		String allDogs = "alldogs";
		String allCats = "allcats";
		if (converted.equals(allDogs)) {
			for (int i = 0; i < station.GetDogs_size(); i++) {
				station.GetDog(i).SetHappiness();
				station.GetDog(i).SetHealth(50, "+");
			}
			System.out.println("Playing fetch with ALL DOGS! %n");
		} else if (converted.equals(allCats)) {
			for (int j = 0; j < station.GetCats_size(); j++) {
				station.GetCat(j).SetHappiness();
				station.GetCat(j).SetHealth(50, "+");
			}
			System.out.println("Playing fetch with ALL CATS %n");
		} else {
			if (station.GetDogs_size() > 0) {
				for (int i = 0; i < station.GetDogs_size(); i++) {
					if (converted.equals(station.GetDog(i).GetName().toLowerCase().replaceAll("\\s+", ""))) {
						station.GetDog(i).SetHappiness();
						station.GetDog(i).SetHealth(50, "+");
						System.out.printf("You played fetch with %s. %n", station.GetDog(i).GetName());
						break;
					}
				}
			}
			if (station.GetCats_size() > 0) {
				for (int j = 0; j < station.GetCats_size(); j++) {
					if (converted.equals(station.GetCat(j).GetName().toLowerCase().replaceAll("\\s+", ""))) {
						station.GetCat(j).SetHappiness();
						station.GetCat(j).SetHealth(50, "+");
						System.out.printf("You played fetch with %s .%n", station.GetCat(j).GetName());
						break;
					}
				}
			}

		}
	}

	public static void pet(String n, BreedingStation station) {
		String converted = n.toLowerCase().replaceAll("\\s+", "");
		String allDogs = "alldogs";
		String allCats = "allcats";
		if (converted.equals(allDogs)) {
			for (int i = 0; i < station.GetDogs_size(); i++) {
				station.GetDog(i).SetHappiness();
			}
			System.out.println("Petting ALL DOGS! %n");
		} else if (converted.equals(allCats)) {
			for (int j = 0; j < station.GetCats_size(); j++) {
				station.GetCat(j).SetHappiness();
			}
			System.out.println("Petting ALL CATS %n");
		} else {
			if (station.GetDogs_size() > 0) {
				for (int i = 0; i < station.GetDogs_size(); i++) {
					if (converted.equals(station.GetDog(i).GetName().toLowerCase().replaceAll("\\s+", ""))) {
						station.GetDog(i).SetHappiness();
						System.out.printf("You petted %s. %n", station.GetDog(i).GetName());
						break;
					}
				}
			}
			if (station.GetCats_size() > 0) {
				for (int j = 0; j < station.GetCats_size(); j++) {
					if (converted.equals(station.GetCat(j).GetName().toLowerCase().replaceAll("\\s+", ""))) {
						station.GetCat(j).SetHappiness();
						System.out.printf("You petted %s .%n", station.GetCat(j).GetName());
						break;
					}
				}
			}

		}
	}

	public static void cuddle(String n, BreedingStation station) {
		String converted = n.toLowerCase().replaceAll("\\s+", "");
		String allDogs = "alldogs";
		String allCats = "allcats";
		if (converted.equals(allDogs)) {
			for (int i = 0; i < station.GetDogs_size(); i++) {
				station.GetDog(i).SetHappiness();
			}
			System.out.println("Cuddling with ALL the DOGS! %n");
		} else if (converted.equals(allCats)) {
			for (int j = 0; j < station.GetCats_size(); j++) {
				station.GetCat(j).SetHappiness();
			}
			System.out.println("Cuddling with ALL the CATS %n");
		} else {
			if (station.GetDogs_size() > 0) {
				for (int i = 0; i < station.GetDogs_size(); i++) {
					if (converted.equals(station.GetDog(i).GetName().toLowerCase().replaceAll("\\s+", ""))) {
						station.GetDog(i).SetHappiness();
						System.out.printf("You cuddled with %s. %n", station.GetDog(i).GetName());
						break;
					}
				}
			}
			if (station.GetCats_size() > 0) {
				for (int j = 0; j < station.GetCats_size(); j++) {
					if (converted.equals(station.GetCat(j).GetName().toLowerCase().replaceAll("\\s+", ""))) {
						station.GetCat(j).SetHappiness();
						System.out.printf("You cuddled with %s .%n", station.GetCat(j).GetName());
						break;
					}
				}
			}

		}
	}

	public static void cut(String n, BreedingStation station, String what) {
		String converted = n.toLowerCase().replaceAll("\\s+", "");
		String allDogs = "alldogs";
		String allCats = "allcats";
		if (converted.equals(allDogs)) {
			for (int i = 0; i < station.GetDogs_size(); i++) {
				station.GetDog(i).SetHappiness();
				station.GetDog(i).SetHealth(25, "+");
			}
			System.out.printf("Cutting the %s on ALL DOGS! %n", what);
		} else if (converted.equals(allCats)) {
			for (int j = 0; j < station.GetCats_size(); j++) {
				station.GetCat(j).SetHappiness();
				station.GetCat(j).SetHealth(25, "+");
			}
			System.out.printf("Cutting the %s on ALL CATS! %n", what);
		} else {
			if (station.GetDogs_size() > 0) {
				for (int i = 0; i < station.GetDogs_size(); i++) {
					if (converted.equals(station.GetDog(i).GetName().toLowerCase().replaceAll("\\s+", ""))) {
						station.GetDog(i).SetHappiness();
						station.GetDog(i).SetHealth(25, "+");
						System.out.printf("You cut the %s of %s. %n", what, station.GetDog(i).GetName());
						break;
					}
				}
			}
			if (station.GetCats_size() > 0) {
				for (int j = 0; j < station.GetCats_size(); j++) {
					if (converted.equals(station.GetCat(j).GetName().toLowerCase().replaceAll("\\s+", ""))) {
						station.GetCat(j).SetHappiness();
						station.GetCat(j).SetHealth(25, "+");
						System.out.printf("You cut the %s %s of .%n", what, station.GetCat(j).GetName());
						break;
					}
				}
			}

		}
	}

	public static void decreaseStats(BreedingStation station) {
		if (station.GetDogs_size() > 0) {
			for (int i = 0; i < station.GetDogs_size(); i++) {
				station.GetDog(i).SetHunger(true);
				station.GetDog(i).SetHealth(50, "-");
				station.GetDog(i).SetCleanliness(false);
				if (station.GetDog(i).GetHealth() <= 0) {
					station.DogRemove(i);
				}
			}

		}
		if (station.GetCats_size() > 0) {
			for (int j = 0; j < station.GetCats_size(); j++) {
				station.GetCat(j).SetHunger(true);
				station.GetCat(j).SetHealth(50, "-");
				station.GetCat(j).SetCleanliness(false);
				if (station.GetCat(j).GetHealth() <= 0) {
					station.CatRemove(j);
				}
			}

		}

	}

	public static void main(String[] args) {

		String[] tasks = { "Go for a walk", "Shower", "Refill bowl of water", "Give Food", "Give Snack", "Play Fetch",
				"Pet", "Cuddle", "cut the claws", "cut the fur", "Show Stats" };

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
		Scanner taskScanner = new Scanner(System.in);
		while (station.GetPet() > 0) {
			System.out.println(station.GetCats_size());
			System.out.printf("%n ======================== %n");
			System.out.printf("%-5S Day %s %n", "", station.GetDay());
			System.out.println("========================");

			while (num_of_tasks < 4) {
				for (int i = 0; i < tasks.length; i++) {
					System.out.printf("%s - %s %n", i, tasks[i]);
				}
				String task = taskScanner.nextLine();
				// System.out.println(task);

				if (task.equalsIgnoreCase("0")) {
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

					Scanner input_two = new Scanner(System.in);
					String walk = input_two.nextLine();

					taskLogicForWalk(walk, station);

					num_of_tasks++;
				}

				if (task.equalsIgnoreCase("1")) {
					System.out.println("Who to Shower?");
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
					Scanner input_two = new Scanner(System.in);
					String walk = input_two.nextLine();

					shower(walk, station);

					num_of_tasks++;
				}

				if (task.equalsIgnoreCase("2")) {
					System.out.println("Whom to Refill the bowl of water?");
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
					Scanner input_two = new Scanner(System.in);
					String walk = input_two.nextLine();

					refillBowlOfWater(walk, station);

					num_of_tasks++;
				}

				if (task.equalsIgnoreCase("3")) {
					System.out.println("Who to Give Food?");
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
					Scanner input_two = new Scanner(System.in);
					String walk = input_two.nextLine();

					giveFood(walk, station);

					num_of_tasks++;
				}

				if (task.equalsIgnoreCase("4")) {
					System.out.println("Who to Give Snack?");
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
					Scanner input_two = new Scanner(System.in);
					String walk = input_two.nextLine();

					giveHealthySnack(walk, station);

					num_of_tasks++;
				}

				if (task.equalsIgnoreCase("5")) {
					System.out.println("Who to play fetch with?");
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
					Scanner input_two = new Scanner(System.in);
					String walk = input_two.nextLine();

					playFetch(walk, station);

					num_of_tasks++;
				}

				if (task.equalsIgnoreCase("6")) {
					System.out.println("Who to pet?");
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
					Scanner input_two = new Scanner(System.in);
					String walk = input_two.nextLine();

					pet(walk, station);

					num_of_tasks++;
				}

				if (task.equalsIgnoreCase("7")) {
					System.out.println("Who to Cuddle?");
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
					Scanner input_two = new Scanner(System.in);
					String walk = input_two.nextLine();

					cuddle(walk, station);

					num_of_tasks++;
				}

				if (task.equalsIgnoreCase("8")) {
					System.out.println("Who to cut fur?");
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
					Scanner input_two = new Scanner(System.in);
					String walk = input_two.nextLine();

					cut(walk, station, "fur");

					num_of_tasks++;
				}

				if (task.equalsIgnoreCase("9")) {
					System.out.println("Who to cut the claws?");
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
					Scanner input_two = new Scanner(System.in);
					String walk = input_two.nextLine();

					cut(walk, station, "Claws");

					num_of_tasks++;
				}

				if (task.equalsIgnoreCase("10")) {
					Scanner info = new Scanner(System.in);
					Scanner gScanner = new Scanner(System.in);
					System.out.println("Please Enter The gender of Animal: ");
					String gender = gScanner.nextLine();

					System.out.printf("==== %s ==== %n", gender);
					if (gender.equalsIgnoreCase("d")) {
						if (station.GetDogs_size() > 0) {

							for (int i = 0; i < station.GetDogs_size(); i++) {
								System.out.printf("%-5s %s %s %n", "-", i, station.GetDog(i).GetName());
							}
						} else {
							System.out.printf("%-5s You Dont Have a Dog. %n", "-");
							break;
						}

						int animal = info.nextInt();
						station.GetPetInfo(animal, gender);
					} else if (gender.equalsIgnoreCase("c")) {
						if (station.GetCats_size() > 0) {

							for (int i = 0; i < station.GetCats_size(); i++) {
								System.out.printf("%-5s %s %s %n", "-", i, station.GetCat(i).GetName());
							}
						} else {
							System.out.printf("%-5s You Dont Have a cat. %n", "-");
							break;
						}
						int animal = info.nextInt();
						station.GetPetInfo(animal, gender);
					} else {
						System.out.println("Unknown gender");
						break;
					}
					System.out.println("Number Of Completed Tasks Remain unchanged.");

				}
			}

			station.NextDay();
			decreaseStats(station);

			// TODO : Complete the Random EVENTS and SELLING the PETS

		}
	}

}
