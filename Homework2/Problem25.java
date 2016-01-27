
//Reads the number N from the console and prints the N!
import java.util.Scanner;

public class Problem25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		long sum = 1l;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter the number");
			n = sc.nextInt();
			if (n > 170) {
				System.out.println("Due to system limitations please enter a number under 170");
			}
		} while (n > 170);
		for (int i = 1; i <= n; i++) {
			sum = sum * i;
		}
		System.out.println("N!=" + sum);
	}

}
