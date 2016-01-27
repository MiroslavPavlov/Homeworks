
//Reads a number from the console and prints out a table
import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Please enter a number");
			n = sc.nextInt();
		} while (n <= 0);
		if (n == 1) {
			System.out.println(0);
		} else {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {

					System.out.print((n - 1) + 2 * (i - 1));

				}
				System.out.println();
			}
		}
	}

}
