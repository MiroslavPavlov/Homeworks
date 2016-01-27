
//reads 2 words from the keyboard that have a length of 10 to 20 characters
//checks which word is larger and switches the 1st 5 chars, than prints the result

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word1;
		String word2;
		String resultWord;
		do {
			System.out.println("Please enter the two words");
			word1 = sc.next();
			word2 = sc.next();

		} while (word1.length() < 5 || word1.length() < 5 || word1.length() + word2.length() > 20);

		resultWord = changeChars(word1, word2);
		System.out.println("Result of the operation is:" + '\n' + resultWord);

	}

	static String changeChars(String word1, String word2) {
		// Changes the first 5 characters of the longer word, using the //
		// first 5 characters from the shorter word //
		if (word1.length() > word2.length()) {
			String word1Temp = new String(word1);
			for (int i = 0; i <= 4; i++) {
				word1Temp = word1Temp.replace(word1.charAt(i), word2.charAt(i));
			}
			return word1Temp;

		} else {
			String word2Temp = new String(word2);
			for (int i = 0; i <= 4; i++) {
				word2Temp = word2Temp.replace(word2.charAt(i), word1.charAt(i));
			}
			return word2Temp;

		}
	}

}
