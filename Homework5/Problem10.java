
//Reads a string using the console and returns a string where each character is
//added 5 to it's ascii code
import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imputString;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter your word");
			imputString = sc.next();
		} while (imputString.length() < 1);
		String outputString = new String(scrambleLetters(imputString));
		System.out.println(outputString);
	}

	static char[] scrambleLetters(String imputString) {
		char[] word = new char[imputString.length()];
		for (int i = 0; i < imputString.length(); i++) {
			int tmpCh = imputString.charAt(i) + 5;
			word[i] = (char) tmpCh;
		}
		return word;
	}
}
