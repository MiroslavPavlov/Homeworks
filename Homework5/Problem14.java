
//Uses a methot that using a number, that has bin entered from the console, prints out
//the N! of the number;
import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter your number");
			n = sc.nextInt();
		} while (n == 1 || n == 0);
		factorielIteral(n);
		int factorielus = factorielReccursive(n);
		System.out.println("Reccursive factoriel is: " + factorielus);
	}

	static void factorielIteral(int x) {
		int sum = 1;
		if (x < 0) {
			for (int i = -1; i >= x; i--) {
				sum = sum * i;
			}
			System.out.println("The factoriel of this number is: " + sum);
		} else {
			for (int i = 1; i <= x; i++) {
				sum = sum * i;
			}
			System.out.println("The factoriel of this number is " + sum);
		}
	}

	static int factorielReccursive(int x) {
		if (x < 0) {
			if (x == -1) {
				return -1;
			} else {
				return x * factorielReccursive(x + 1);
			}

		} else {
			if (x == 1) {
				return 1;
			} else {
				return x * factorielReccursive(x - 1);
			}
		}

	}
}
