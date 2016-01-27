
//reads 2 strings up to 40 symbols each and than converts them into all capital letters
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// initiates the needed scanner, initial and resulting strings
		Scanner sc = new Scanner(System.in);
		String initialString1;
		String initialString2;
		do {
			System.out.println("Please enter the 1st string");
			initialString1 = sc.nextLine();
			System.out.println("Please enter the 2nd string");
			initialString2 = sc.nextLine();
		} while (initialString1.length() == 0 || initialString2.length() == 0 || initialString1.length() > 40
				|| initialString2.length() > 40);
		upperCasing(initialString1, initialString2);
	}

	/**
	 * Takes as arguments two strings and converts them into the same strings
	 * but with upper case, prints out both the original and the resulting
	 * strings
	 * 
	 */
	static void upperCasing(String initialString1, String initialString2) {
		// Initializes the two strings by switching the original ones to upper
		// case
		String resultString1 = initialString1.toUpperCase();
		String resultString2 = initialString1.toUpperCase();
		// Prints out the results and the original strings
		System.out.println("The end result is:");
		System.out.println(resultString1 + " " + initialString1 + " (original) " + resultString2 + " " + initialString2
				+ " (original)");
	}
}
