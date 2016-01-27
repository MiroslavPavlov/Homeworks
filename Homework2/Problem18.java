
// Reads 2 numbers using the console from the interval [1;9] and prints the
//multiplication table using the 2 numbes
import java.util.Scanner;

public class Problem18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, m;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter the 1st number");
			n = sc.nextInt();
			System.out.println("Please enter the 2nd number");
			m = sc.nextInt();
		} while (n < 1 || n > 9 || m < 1 || m > 9);
		if (n > m) {
			int temp = n;
			n = m;
			m = temp;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.println(i + "*" + j + " = " + (i * j));
			}
		}
	}

}
