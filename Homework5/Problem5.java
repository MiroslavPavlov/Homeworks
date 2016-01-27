
//Reads two words using the console, finds out if they have a matching symbol and prints
//one of them horizontally the other one vertically by crossing them at the
//matching symbol
import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word1;
		String word2;
		do {
			System.out.println("Please enter the first word");
			word1 = sc.next();
			System.out.println("Please enter the second word");
			word2 = sc.next();
		} while (word1.length() < 1 || word2.length() < 1);
		crossPuzzle(word1, word2);
	}

	/**
	 * Takes two words and if they have matching symbols, prints them one
	 * vertically, the other one horizontally at their first matching symbol
	 * uses a temporary array to insure the correct amount of spacings and
	 * formating
	 */
	static void crossPuzzle(String word1, String word2) {
		char[][] crossPuzzleArray = new char[word1.length()][word2.length()];
		int position1 = 0, position2 = 0;
		boolean exists = false;
		// Fills the entire array with empty spaces for ease of printing
		// Later in the code the 2 words will be written at their corresponding
		// rows and columns
		for (int i = 0; i < crossPuzzleArray.length; i++) {
			for (int j = 0; j < crossPuzzleArray[i].length; j++) {
				crossPuzzleArray[i][j] = ' ';
			}
		}
		// Searches for the first matching symbol and writes its positions in
		// both words
		for (int i = 0; i < word2.length(); i++) {
			if (word1.indexOf(word2.charAt(i)) > 0) {
				position1 = word1.indexOf(word2.charAt(i));
				position2 = i;
				exists = true;
				break;
			}
		}
		// Uses the result of the search and if it there are symbols that exist
		// in both words writes the two words accordingly
		if (exists) {
			// writes the 1st words in the corresponding line of the array
			for (int i = 0; i < crossPuzzleArray.length; i++) {
				crossPuzzleArray[i][position2] = word1.charAt(i);
			}
			// writes the 2nd word in the corresponding column of the array
			for (int j = 0; j < crossPuzzleArray[1].length; j++) {
				crossPuzzleArray[position1][j] = word2.charAt(j);
			}
			// Prints out the result
			for (int i = 0; i < crossPuzzleArray.length; i++) {
				for (int j = 0; j < crossPuzzleArray[i].length; j++) {
					System.out.print(crossPuzzleArray[i][j]);
				}
				System.out.println();
			}
		} else {
			System.out.println("There are no matching symbols in the two words");
		}
	}

}