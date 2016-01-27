
//Reads a number from the console and cheks if it is prime
import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		boolean prime = true;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter a number larger different than 1 and 0");
			n = sc.nextInt();
		} while (n == 0 || n == 1);
		if (n < 0) {
			// n=n*-1;
			for (int i = -2; i > n; i--) {
				if (n % i == 0) {
					prime = false;
					break;
				}
			}
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					prime = false;
					break;
				}
			}
		}

		if (prime) {
			System.out.println("The number is prime");
		} else {
			System.out.println("The number is not prime");
		}
	}

}
