
//Starting from 3, prints out the first n numbers that are devided by 3
import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter a number larger than 0");
			n = sc.nextInt();
		} while (n <= 0);
		if (n == 1) {
			System.out.println(3);
		} else {
			for (int i = 1; i <= n; i++) {
				if (i < n) {
					System.out.print(i * 3 + ", ");
				} else {
					System.out.println(i * 3);
				}
			}
		}
	}

}
