package sk.stuba.fiit.hlavny_loop;

import sk.stuba.fiit.BreedingStation.*;
import sk.stuba.fiit.Human.*;
import sk.stuba.fiit.Pet.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class GameLoop {

	public static void main(String[] args) {

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
		System.out.println("Let's the journey begin!");
		System.out.println("==================================================================");

	}

}
