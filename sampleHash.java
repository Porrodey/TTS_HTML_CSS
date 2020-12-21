package ttsloopMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class sampleHash {
	public static void main(String[] args) {
		numberGame();
	}
		public static void numberGame() {
		
		ArrayList<Integer> numGame = new ArrayList<Integer>(5);
			
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to our numbers game!");
		System.out.println("To get started, answer the following questions using only numbers."); 
		
		System.out.println("What is your favorite number?");
		int num0 = scanner.nextInt();
		System.out.println("What is your age?");
		int num1 = scanner.nextInt();
		System.out.println("How many pets do you have?");
		int num2 = scanner.nextInt();
		System.out.println("What is the temperature where you are currently?");
		int num3 = scanner.nextInt();
		System.out.println("How many bedrooms are in your home?");
		int num4 = scanner.nextInt();

		numGame.add(num0);
		numGame.add(num1);
		numGame.add(num2);
		numGame.add(num3);
		numGame.add(num4);
		
		//Prints and confirms that users input is in the ArrayList
		System.out.println("Your numbers are: " + numGame.get(0) + ", " + numGame.get(1) + ", " + numGame.get(2) + ", " + numGame.get(3) + ", " + numGame.get(4));
		
		//Print contents of the ArrayList using for loop
				//for (int i = 0; i < numGame.size(); i++) {
				//System.out.println(numGame.get(i) + " ");
				//}
		//Prints contents of ArrayList using for ... each loop. "num" can be anything like "numbers" or "content", refers to contents of numGame
				//for (Integer num : numGame) {
				//System.out.println(num + " ");
				//}
		//toString method that prints contents of the ArrayList
				//System.out.println(numGame);
				//System.out.println(numGame.toString());
		
		int sum = 0;
		for (Integer num : numGame) {
			sum += Integer.valueOf(num);
		}
		System.out.println("Sum: " + sum);
		
		int mult = 1;
		for (int i = 0; i < numGame.size(); i++) {
			mult = mult * numGame.get(i);
		}
		System.out.println("Product: " + mult);
		System.out.println("Largest Number: " + Collections.max(numGame));
		System.out.println("Smallest Number: " + Collections.min(numGame));
	}
}

	//Write program that does the following
	//asks user for 5 numbers
	//stores them in an array list
	//find the sum, product, largest and smallest 