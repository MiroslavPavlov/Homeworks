
//Reads a three digit number from the console and than gives out a feedback
//if the different digits are equal or sorted in ascending or descending order

import java.util.Scanner;

public class Problem16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c; // declares the 3 digits
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a three digit number");
		a = sc.nextInt();
		if (a < 100 || a > 999) {
			System.out.println("Please enter a three digit number");
			a = sc.nextInt();

		}
		c = a % 10;
		a = a / 10;
		b = a % 10;
		a = a / 10;
		if (a == b && b == c) {
			System.out.println("The three digits are equal");
		}
		if (a > b && b > c) {
			System.out.println("The three digits are in a descending order");
		} else {
			System.out.println("The three digits are in an ascending order");
		}
		if (a == b && b > c) {
			System.out.println("The first two digits are equal and the third one is smaller");
		} else {
			System.out.println("The first two digits are equal and the third one is bigger");
		}
		if (a < b && b == c) {
			System.out.println("The first digit is smaller than the other two, which are equal");
		} else {
			System.out.println("The first digit is bigger than the other two, which are equal");
		}
	}

}
