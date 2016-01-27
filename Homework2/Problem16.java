
//Reads 2 numbers using the console from the interval [10;5555] and prints all
// that are divided by 50 in decreasing order
import java.util.Scanner;

public class Problem16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, m;
		do {
			System.out.println("Please enter the first number");
			n = sc.nextInt();
			System.out.println("Please enter the second number");
			m = sc.nextInt();
		} while (n < 10 || n > 5555 || m < 10 || m > 5555);
		if (n > m) {
			int temp = n;
			n = m;
			m = temp;
		}
		for (int i = m; i >= n; i--) {
			if (i % 50 == 0 && i > 50) {
				System.out.print(i + ", ");
			}
			if (i == 50) {
				System.out.println(i + ".");
			}
		}
	}

}
