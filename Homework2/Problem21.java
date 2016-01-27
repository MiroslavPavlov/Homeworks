
//Reads a number using the console that represents the number of the card and prints 
//all others that are bigger
import java.util.Scanner;

public class Problem21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double n; // number of the card
		double card; // used to calculate what the card is based on it's number
		// uses double instead of int in order for the algorithm to work
		// properly
		do {
			System.out.println("Please enter the number of the card");
			n = sc.nextDouble();
		} while (n <= 0||n>52);
		for (double i = n; i <= 52; i++) {
			card = (i / 4);
			// next series of if-s determines if the kard is 2,3,4,5 and etc.
			if (card <= 1) {
				System.out.print("2 ");
			}
			if (card > 1 && card <= 2) {
				System.out.print("3 ");
			}
			if (card > 2 && card <= 3) {
				System.out.print("4 ");
			}
			if (card > 3 && card <= 4) {
				System.out.print("5 ");
			}
			if (card > 4 && card <= 5) {
				System.out.print("6 ");
			}
			if (card > 5 && card <= 6) {
				System.out.print("7 ");
			}
			if (card > 6 && card <= 7) {
				System.out.print("8 ");
			}
			if (card > 7 && card <= 8) {
				System.out.print("9 ");
			}
			if (card > 8 && card <= 9) {
				System.out.print("10 ");
			}
			if (card > 9 && card <= 10) {
				System.out.print("Jack ");
			}
			if (card > 10 && card <= 11) {
				System.out.print("Queen ");
			}
			if (card > 11 && card <= 12) {
				System.out.print("King ");
			}
			if (card > 12) {
				System.out.print("Ace ");
			}
			// next switch-case determines the color of the cards
			int color = (int) (i % 4);
			if (i < 52) {
				switch (color) {
				case 1:
					System.out.print("of Clubs, ");
					break;
				case 2:
					System.out.print("of Diamonds, ");
					break;
				case 3:
					System.out.print("of Hearts, ");
					break;
				case 0:
					System.out.print("of Spades, ");
				}
			} else {
				System.out.println("Of Spades");
			}

		}
	}

}
