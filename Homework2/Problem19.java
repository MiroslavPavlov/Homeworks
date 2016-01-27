
//Reads a number using the console from the interval [10;99] and prints out a
//series of numbers
import java.util.Scanner;

public class Problem19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter a number to start the series");
			n = sc.nextInt();
		} while (n < 10 || n > 99);

		do {
			if (n % 2 == 0) {
				n = (int) (n * 0.5);
			} else {
				n = n * 3 + 1;
			}
			if (n > 1) {
				System.out.print(n + " ");
			} else {
				System.out.println(n + ".");
			}
		} while (n > 1);

	}

}
