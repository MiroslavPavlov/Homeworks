
//Reads a number using the console from the interval[1;999] and prints out 10 
//smallest numbers that can be divided by 2,3 or 5
import java.util.Scanner;

public class Problem22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, count = 1;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter a number from inte interval [1;999]");
			n = sc.nextInt();

		} while (n < 1 || n > 999);
		do {
			if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
				if (count < 10) {
					System.out.print(count + ":" + n + " ");
				} else {
					System.out.println(count + ":" + n);
				}
				count++;
			}

			n++;
		} while (count <= 10);

	}
}