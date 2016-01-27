
//Reads a number from the console and draws a triangle
import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter a number larger than 0");
			n = sc.nextInt();
		} while (n <= 0);
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}
}
