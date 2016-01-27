
//Reads a number from the console and calculates the sum from all the numbers between
//1 and that number
import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, sum = 0;

		System.out.println("Please enter a number");
		n = sc.nextInt();
		if (n <= 0) {
			do {
				sum = sum + n;
				n++;
			} while (n <= 1);
		} else
			do {
				sum = sum + n;
				n--;

			} while (n >= 1);
		System.out.println("The sum is: " + sum);
	}

}
