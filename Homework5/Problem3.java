
//Uses the console to read 2 words, than compares them by length and content
//Prints the positions and letters where there are mismatches
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word1;
		String word2;
		do {
			System.out.println("Please enter the 1st word");
			word1 = sc.next();
			System.out.println("Please enter the 2nd word");
			word2 = sc.next();
		} while (word1.length() == 0 || word2.length() == 0);
		/*
		 * System.out.println(word1.charAt(1)); char c1,c2; c1=word1.charAt(1);
		 * c2=word2.charAt(1); System.out.println(c1==c2);
		 */
		compareWords(word1, word2);

	}

	/**
	 * Compares the two strings by length and symbols If the two words have the
	 * same length it checks first by using compareTo to make a statement that
	 * the strings are perfectly identical, than uses compareToIgnoreCase to see
	 * if they have the same meaning but with differences of upper and lower
	 * cases. If none of the above are true it starts comparing them symbol by
	 * symbol and printing out the mismatching chars
	 */
	static void compareWords(String word1, String word2) {

		// Starts by comparing the two strings by length
		if (word1.length() == word2.length()) {
			System.out.println("The two words have the same length");
			// If the two strings are the same length compares them if they are
			// made from the same symbols
			if (word1.compareTo(word2) == 0) {
				System.out.println("The two words are identical");
			} else {
				// Makes a second comparison if the two words are the same but
				// with
				// mismatched upper and lower case
				if (word1.compareToIgnoreCase(word2) == 0) {
					System.out.println("The two words are identical if ignoring upper and lower case letters");
				} else {
					// If the 2 words are not identical starts to compare them
					// symbol by symbol
					System.out.println("Differences between the two words are:");
					for (int i = 0; i < word1.length(); i++) {
						// initiates 2 chars that will hold the current symbol
						// from
						// each word in order to make a direct comparison
						// between them
						char w1 = word1.charAt(i), w2 = word2.charAt(i);
						// Prints only the symbols that are not the same
						if (w1 != w2) {
							System.out.println((i + 1) + " " + word1.charAt(i) + "-" + word2.charAt(i));
						}
					}
				}

			}
			// Uses return to exit the method if the 2 words are the same length
			return;
		} else {
			// If the two words have different lengths finds out which one is
			// bigger
			if (word1.length() > word2.length()) {
				System.out.println("The first word is larger than the second one");
				return;
			} else {
				System.out.println("The second word is larger than the first one");
				return;
			}
		}
	}

}
