
//Reads a number using the console from the interval [10;30000] and prints out if it
//is a polyndrom
import java.util.Scanner;

public class Problem24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, temp, temp1, temp2, temp3, temp4;
		boolean smile = false;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter a number from the interval [10;30000]");
			n = sc.nextInt();
		} while (n < 10 || n > 30000);
		if (n < 100) {
			temp = n;
			temp1 = temp % 10;
			temp = temp / 10;
			if (temp1 == temp) {

				smile = true;
			}
		}
		if (n > 100 && n < 1000) {
			temp = n;
			temp1 = temp % 10;
			temp = temp / 10;
			temp2 = temp % 10;
			temp = temp / 10;
			if (temp1 == temp) {
				smile = true;
			}

		}
		if (n >= 1000 && n < 10000) {
			temp = n;
			temp1 = temp % 10;
			temp = temp / 10;
			temp2 = temp % 10;
			temp = temp / 10;
			temp3 = temp % 10;
			temp = temp / 10;
			if (temp == temp1 && temp2 == temp3) {
				smile = true;
			}
		}
		if (n >= 10000) {
			temp = n;
			temp1 = temp % 10;
			temp = temp / 10;
			temp2 = temp % 10;
			temp = temp / 10;
			temp3 = temp % 10;
			temp = temp / 10;
			temp4 = temp % 10;
			temp = temp / 10;
			if (temp == temp1 || temp2 == temp4) {
				smile = true;
			}
		}
		if (smile) {
			System.out.println("The number is a plyndrom(the number is smiling).");

		} else {
			System.out.println("The number is not a polyndrom(the number is not smiling).");
		}
	}

}
