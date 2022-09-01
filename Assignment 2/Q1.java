import java.util.*;

public class Q1 {
	public static void main(String[] args) {
		int[] array;
		String input;
		String[] numStrings;
		int currInt;
		int currCount = 0;
		int totalCount = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		input = scanner.nextLine();
		input = input.replaceAll("[^\\-0-9]"," ").replaceAll("\\s+", " ").trim();
		numStrings = input.split(" ");
		array = new int[numStrings.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(numStrings[i]);
		}

		currInt = array[0];
		for(int i = 0; i < array.length; i++) {
			if (currInt == array[i]) {
				if (currCount < 2) currCount++; // Count repeated number only twice
			} else {
				/*
				 * if the repition stops and a new number appears,
				 * store the count of previous number,
				 * reset count to 1 and
				 * set the current number to be counted to that new number
				 */
				totalCount += currCount;
				currCount = 1;
				currInt = array[i];
			}
			
		}

		totalCount += currCount; // Add count of the last element also

		System.out.println("The length of the original array is: " + array.length);
		System.out.println("After removing duplicates, the new length of the  array is: " + totalCount);

	}
}
