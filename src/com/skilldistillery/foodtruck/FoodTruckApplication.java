package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApplication {

	private static int Max_Trucks = 5;
	FoodTruck[] AllTrucks = new FoodTruck[Max_Trucks];
	Scanner w = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Lets talk about food trucks!");

		FoodTruckApplication ftApp = new FoodTruckApplication();

		ftApp.newTruckBuilder();
		ftApp.menu();
	}

	public void newTruckBuilder() {
		for (int howManyTrucks = 0; howManyTrucks < Max_Trucks; howManyTrucks++) {

			System.out.print("Enter the name of food truck " + (howManyTrucks + 1) + ":");
			String truckName = w.nextLine();

			if (!truckName.equalsIgnoreCase("quit")) {
				System.out.print("Enter the type of food: ");
				String foodType = w.nextLine();

				System.out.print("Enter your rating of the foodtruck from 1 (Lowest) and 5 (Highest): ");
				int rating = w.nextInt();
				w.nextLine();
				while (rating > 5 || rating < 1) {
					System.out.println("Error: Outside of scale");
					System.out.print("Enter your rating of the foodtruck from 1 (Lowest) and 5 (Highest): ");
					rating = w.nextInt();
					w.nextLine();
				}
				FoodTruck createdTruck = new FoodTruck(truckName, foodType, rating);
				AllTrucks[howManyTrucks] = createdTruck;

			} else {

				break;
			}

		}
 
	}

	public void menu() {
		System.out.println();
		System.out.println("Choose a number from the list below.");
		System.out.println("1. List all existing food trucks.");
		System.out.println("2. See the average rating of food trucks.");
		System.out.println("3. Display the highest-rated food truck.");
		System.out.println("4. Quit the program.");
		System.out.println();
		int menuChoice = w.nextInt();
		while ((menuChoice <= 4) || (menuChoice >= 1)) {
			if (menuChoice == 1) {
				for (int i = 0; i < AllTrucks.length; i++) {
					if (AllTrucks[i] != null) {
						System.out.println(AllTrucks[i].toString());
						System.out.println();
					}
				}
			}

			if (menuChoice == 2) {
				int totalRating = 0;
				int HowManyDamnTrucks = 0;
				double averageRating = 0;
				for (int i = 0; i < AllTrucks.length; i++) {
					if (AllTrucks[i] != null) {
						totalRating += AllTrucks[i].getRating(); 
						HowManyDamnTrucks++;
					}
				}
				averageRating = (double) totalRating / HowManyDamnTrucks;
				System.out.print("Average Rating for all trucks:" + averageRating);
				System.out.println();
			}

			if (menuChoice == 3) {
				FoodTruck compare = AllTrucks[0];
				int highestRating = AllTrucks[0].getRating();
				for (int i = 0; i < AllTrucks.length; i++) {
					if (AllTrucks[i] != null) {
						if (highestRating < AllTrucks[i].getRating()) {
							highestRating = AllTrucks[i].getRating(); 
							compare = AllTrucks[i];
						}
					}
				}
				System.out.println("The Highest Rated FoodTruck is :" + compare.toString());
				System.out.println();
			}

			if (menuChoice == 4) {
				System.out.println("Goodbye");
				System.exit(0);
			}
			System.out.println("Choose a number from the list below.");
			System.out.println("1. List all existing food trucks.");
			System.out.println("2. See the average rating of food trucks.");
			System.out.println("3. Display the highest-rated food truck.");
			System.out.println("4. Quit the program.");
			menuChoice = w.nextInt();
		}

	}

}
