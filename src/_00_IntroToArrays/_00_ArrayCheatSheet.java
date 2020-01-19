package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	
	static Random random = new Random();
	
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] stringArray = new String[] {"H", "e", "L", "l", "o"};
		//2. print the third element in the array
		System.out.println(stringArray[2]);
		//3. set the third element to a different value
		stringArray[2] = "l";
		//4. print the third element again
		System.out.println(stringArray[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < stringArray.length; i++) {stringArray[i] = new String[] {"A", "d", "i", "o", "s"}[i];}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < stringArray.length; i++) {System.out.print(stringArray[i]);}
		//7. make an array of 50 integers
		int[] fiftyRandInts = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		int highest = 0;
		int lowest = 255;
		for (int i = 0; i < fiftyRandInts.length; i++) {
			fiftyRandInts[i] = random.nextInt(256);
		//9. without printing the entire array, print only the smallest number on the array
			if (fiftyRandInts[i] < lowest) {lowest = fiftyRandInts[i];}
			if (fiftyRandInts[i] > highest) {highest = fiftyRandInts[i];}
		} 	System.out.println("\nThis is the smallest number in int[] fiftyRandInts: " + lowest);
		//10 print the entire array to see if step 8 was correct
		for (int integer : fiftyRandInts) {System.out.print(integer + " ");}
		//11. print the largest number in the array.
		System.out.println("\nThis is the largest number in int[] fiftyRandInts: " + highest);
		//12. print only the last element in the array
		System.out.println(fiftyRandInts[49]);
	}
}
