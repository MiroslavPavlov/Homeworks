
//Reads a sentence using the console and as a result prints out the same sentence
//where each new word is capital
import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String sentence;
		do {
			System.out.println("Please enter your sentence");
			sentence = sc.nextLine();
		} while (sentence.length() < 2);

		String newSentence = new String(capitalLettet(sentence));
		System.out.println(newSentence);
	}

	static char[] capitalLettet(String sentence) {
		char[] tempArray = new char[sentence.length()];
		for (int i = 0; i < sentence.length() - 1; i++) {
			char ch = sentence.charAt(i);
			tempArray[i] = ch;
		}
		for (int i = 1; i < tempArray.length; i++) {
			if (i == 0 && tempArray[i] != ' ') {
				int tmpCh = tempArray[i] - 32;
				tempArray[i] = (char) tmpCh;
			}

			if (i > 1 && tempArray[i - 1] == ' ' && ((int) tempArray[i] >= 97) && ((int) tempArray[i] <= 122)) {
				int tmpCh = tempArray[i] - 32;
				tempArray[i] = (char) tmpCh;
			}

		}
		return tempArray;
	}
}
