package ttsloopMap;

import java.util.HashMap;
import java.util.Scanner;

public class loopMap {
	public static void main(String[] args) {
		carDealership();
		carHashMap();
	}
		
		public static void carDealership() {
		//introductory method separated so that it does not loop along with the hashmap
			
	    Scanner scanner = new Scanner(System.in);
	    		
		System.out.println("Welcome to Car World!");
		
		System.out.println("What is your name? (first name only)");
		String name = scanner.next();
		System.out.println("Hello, " + name + "!");
		System.out.println("Would you like to check out our car inventory? (Type Yes or No)");
		String getStarted = scanner.next();
		if (getStarted.equals("Yes") || getStarted.equals("yes")){
		carHashMap();
		//calls the method to access the hashmap
		} else {
			System.out.println("Thank you, " + name + ". Have a great day!");
			System.exit(0);
		}
		}
		
		public static void carHashMap() {
			//hashmap of cars
			HashMap<String, String> cars = new HashMap<>();
		    cars.put("Accord", "Honda");
		    cars.put("Tundra", "Toyota");
		    cars.put("Wrangler", "Jeep");
		    cars.put("Civic", "Honda");
		    cars.put("Hrv", "Honda");
		    cars.put("4Runner", "Toyota");
		    cars.put("CRV", "Honda");
		    cars.put("Camry", "Toyota");
		    cars.put("Soul", "Kia");
		    cars.put("Focus", "Ford");
		   //checks if car is available or not
		    Scanner scanner = new Scanner(System.in);
			System.out.println("What car model are you interested in?");
			String modelCar = scanner.next();
			
			if (cars.containsKey(modelCar)) {
					System.out.println("Great! We have a new " + cars.get(modelCar) + " " + modelCar + " available!" + "\n");
					//Loop option to check for more cars in hashmap
					System.out.println("Would you like to search for another model? (Type Yes or No)");
					String tryAgain = scanner.next();
					if (tryAgain.equals("Yes") || (tryAgain.equals("yes"))){
					carHashMap();	
					} else {
					//option to quit program
					System.out.println("Thanks for checking our car inventory!");
					System.exit(0);
				}
				} else {
				//response if user input is not in hashmap with option to try again
				System.out.println("Unfortunately, we do not have a " + modelCar + " in our invetory at this time.");
				System.out.println("Would you like to search for another model? (Type Yes or No)");
				String tryAgain = scanner.next();
				if (tryAgain.equals("Yes") || (tryAgain.equals("yes"))){
				carHashMap();	
				} else {
				//option to quit program
				System.out.println("Thanks for checking our car inventory!");
				System.exit(0);
			}
		}
		}
}
	
//car dealer, create hash map of vehicles
//key is model, value is make
//ask customer what car model they are looking for
//use hashmap to determine if you have it and what make it is
