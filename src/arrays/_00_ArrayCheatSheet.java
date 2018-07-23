package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] Strings = new String[5];
		// 2. print the third element in the array
		System.out.println(Strings[2]);
		// 3. set the third element to a different value
		Strings[2] = "BENOPEDJUKCHDJHDGJSGA";
		// 4. print the third element again
		System.out.println(Strings[2]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < 5; i++) {
			System.out.println(Strings[i]);
		}

		// 6. make an array of 50 integers
		int[] Ints = new int[50];
		// 7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < 50; i++) {
			Random random = new Random();
			Ints[i] = random.nextInt(2000);
		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		int smallest = Ints[0];
		for (int i = 0; i < Ints.length; i++) {
			if (smallest > Ints[i]) {
				smallest = Ints[i];
			}
		}
		System.out.println("Smallest: " + smallest);
		// 9 print the entire array to see if step 8 was correct
		for (int i = 0; i < Ints.length; i++) {
			System.out.println(Ints[i]);
		}
		// 10. print the largest number in the array.
		int largest = Ints[0];
		for (int i = 0; i < Ints.length; i++) {
			if (largest < Ints[i]) {
				largest = Ints[i];
			}
		}
		System.out.println("Largest: " + largest);
	}
}
// Dead programming memes never die: The Dongcumentary and "DALARA!
// ASSISSTANCE!"