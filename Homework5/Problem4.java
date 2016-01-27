
//Reads 2 names from the console, that are devided from eachother using ","
//Than prints out the one that has the higher sum of the ASCII code from it's letters
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// Declares an input string that will later be used to
		// read the 2 names and print out the larger one
		String inputString;
		// Uses a do-while block of code to get an input of the 2 names
		// and making sure that there are at least 1 letter for each name
		do {
			System.out.println("Please enter the two names");
			inputString = sc.nextLine();
		} while (inputString.length() < 4);

		namesComparing(inputString);

	}

	/**
	 * Uses a string that is divided into 2 arrays of chars by the "," symbol
	 * after that puts all the chars using charAt-function of the string class,
	 * skips the first spacer after the "," symbol. Using the same loop
	 * calculates the sum of the ASCII code inside each array, skipping the
	 * spacer symbols from ot, than finds out which sum is larger and prints out
	 * the corresponding array
	 */
	static void namesComparing(String names) {
		// initiates the two char arrays with the necessary length
		char[] name1 = new char[names.indexOf(',')];
		char[] name2 = new char[names.length() - names.indexOf(',') - 1];
		// initiates the two required sums in order to calculate which array
		// has a bigger sum of ASCII codes
		int sum1 = 0, sum2 = 0;
		// uses a loop to pass each symbol inside the main string and put the
		// symbols
		// into the two arrays
		for (int i = 0; i < name1.length; i++) {
			name1[i] = names.charAt(i);
		}
		for (int i = 0; i < name2.length; i++) {
			name2[i] = names.charAt(i + names.indexOf(',') + 1);
		}
		// calculates the sums of the ASCII codes for each name excluding the
		// spacing
		// between each name
		for (int i = 0; i < name1.length; i++) {
			if (name1[i] != ' ') {
				sum1 = sum1 + (int) name1[i];
			}

		}
		for (int i = 0; i < name2.length; i++) {
			if (name2[i] != ' ') {
				sum2 = sum2 + (int) name2[i];
			}

		}

		// checks which sum of the ASCII codes is bigger and prints the names
		// using
		// the arrays of characters, skipping the spacer before the names
		if (sum1 > sum2) {
			for (int i = 0; i < name1.length; i++) {
				System.out.print(name1[i]);
			}

		} else {
			if (sum1 == sum2) {
				System.out.println("The two names have equal sum of ASCII codes");
			} else {
				for (int i = 0; i < name2.length; i++) {
					System.out.print(name2[i]);
				}
			}
		}
	}
}
