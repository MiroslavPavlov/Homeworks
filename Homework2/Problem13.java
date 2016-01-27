
//Prints out all the three digit numbers that have a sum of their digits equal to
// the number set by the console

import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum, n, temp, temp1, temp2;
		do {
			System.out.println("Please enter a number larger or equal than 1");
			n = sc.nextInt();
		} while (n < 1);
		for (int i = 100; i <= 999; i++) {
			temp = i;
			temp1 = temp % 10;
			temp = temp / 10;
			temp2 = temp % 10;
			temp = temp / 10;
			sum = temp + temp1 + temp2;
			if (n == sum) {
				System.out.println(i);
			}
		}
	}

}
