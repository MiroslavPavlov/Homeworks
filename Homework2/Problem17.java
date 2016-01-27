
//Draws a square with sides drawn using * and the inside is full with a symbol
// entered from the console

import java.util.Scanner;

public class Problem17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		char filling;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter the lenght of the sides");
			n = sc.nextInt();
			System.out.println("Please enter the symbol for the filling");
			filling = sc.next().charAt(0);
		} while (n < 2);
		for (int i = 1; i <= n; i++) {
			if (i == 1 || i == n) {
				for (int j = 1; j <= n; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j < n; j++) {
					if (j == 0 || j == n-1) {
						System.out.print("*");
					} else {
						System.out.print(filling);
					}
				}
			}

			System.out.println();
		}
	}

}
