
//Reads the number from the console and prints the sum from all the numbers
//from 1 to that number
import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, sum = 0;
		do {
			System.out.println("Please enter the number");
			n = sc.nextInt();
		} while (n == 1);
		if (n < 0) {
			for (int i = n; i <= 1; i++) {
				sum = sum + i;
			}
			System.out.println("The sum of the numbers is: " + sum);
		} else {
			for (int i = 1; i <= n; i++) {
				sum = sum + i;
			}
			System.out.println("The sum of the numbers is: " + sum);
		}
	}

}
