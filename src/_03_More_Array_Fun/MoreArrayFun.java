package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MoreArrayFun {
	
	static String[] nameArray = {"My", "name", "is", "Reuben"};
	static String[] next = {", ", "\n"};
	static Random random = new Random();
	
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		printStringArray(nameArray);
		printStringArrayBackwards(nameArray);
		printStringArrayEveryOther(nameArray);
		printStringArrayRandomly(nameArray);
	}
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	static void printStringArray (String[] array) {
		for (int i = 0; i < array.length; i++) {System.out.print(array[i] + next[i/(array.length - 1)]);}
	}
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	static void printStringArrayBackwards (String[] array) {
		for (int i = array.length - 1; i >= 0; i--) {System.out.print(array[i] + next[(array.length - 1 - i)/(array.length - 1)]);}
	}
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void printStringArrayEveryOther (String[] array) {
		for (int i = 0; i < array.length; i+=2) {System.out.print(array[i] + next[(i/2)/((array.length - 1)/2)]);}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static void printStringArrayRandomly (String[] array) {
		ArrayList<String> arrayCopy = new ArrayList<String>(Arrays.asList(array));
		for (int i = arrayCopy.size() - 1; i >= 0; i--) {
			int indexRemove = random.nextInt(arrayCopy.size());
			System.out.print(arrayCopy.get(indexRemove) + next[(array.length - 1 - i)/(array.length - 1)]);
			arrayCopy.remove(indexRemove);
		}
	}
	
}
