
//Reads a line from the console, counts the words in it and the length of the largest one
import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String sentence;
		do {
			System.out.println("Please enter your sentence");
			sentence = sc.nextLine();
		} while (sentence.length() < 1);
		countingWords(sentence);
	}

	static void countingWords(String sentence) {
		char[] arr = new char[sentence.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sentence.charAt(i);
		}
		int max = 1, countWords = 1, count = 0;
		for (int i = 1; i <= arr.length; i++) {
			if (arr[i - 1] == ' ' && arr[i] != ' ') {
				countWords++;
			}
		}
		System.out.print("Number of words is " + countWords);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != ' ') {
				int j = i;
				while (arr[j] != ' ' && j < arr.length - 1) {
					count++;
					j++;
				}
				if (count > max) {
					max = count;
				}
				count = 0;
			}
		}
		System.out.println(" largest word has " + max + " letters");
	}
}
