
// Reads a number from the console from the interval [10;200] and prints out in a decreasing order
//all the numbers that are divided by 7 
import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Please enter a number from the interval [10;200]");
			n = sc.nextInt();
		} while (n > 200 || n < 10);
		for (int i = n; i > 10; i--) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
	}

}
