
//Checks if a string is a palindrome;
import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word;
		do {
			System.out.println("Enter the word you wish to see if it's a palindrome");
			word = sc.next();
		} while (word.length() < 1);
		palindrome(word);
	}

	static void palindrome(String word) {
		boolean palindrome = true;
		char[] palindromeWord = new char[word.length()];
		for (int i = 0; i < palindromeWord.length; i++) {
			palindromeWord[i] = word.charAt(i);
		}
		for (int i = 0; i < (palindromeWord.length - 1) / 2; i++) {
			if (palindromeWord[i] != palindromeWord[palindromeWord.length - 1 - i]) {
				palindrome = false;
				break;
			}
		}
		if (palindrome) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
