
//Reads a number from the console and determines how many buckets of 3 leters
// and 2 liters will be needed to shift the quantity

import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vol, buckets; // declares the needed variables
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the volume you wish to be shifted");
		vol = sc.nextInt();
		if (vol < 10 || vol > 9999) {
			System.out.println("Please enter a number between 10 and 9999");
			vol = sc.nextInt();
		}
		buckets = vol / 5;
		if (vol % 5 == 0) {
			System.out.println("The number of buckets needed is: ");
			System.out.println(buckets + " of 2 leters and");
			System.out.println(buckets + " of 3 leters.");

		}
		if (vol % 5 == 1) {
			System.out.println("The number of buckets needed is: ");
			System.out.println((buckets - 1) + " of 2 leters,");
			System.out.println((buckets - 1) + " of 3 leters and");
			System.out.println("additional 2 buckets of 3 leters each");

		}
		if (vol % 5 == 2) {
			System.out.println("The number of buckets needed is: ");
			System.out.println((buckets - 1) + " of 2 leters");
			System.out.println((buckets - 1) + " of 3 leters and");
			System.out.println("additional 1 bucket of 2 leters");
		}
		if (vol % 5 == 3) {
			System.out.println("The number of buckets needed is: ");
			System.out.println((buckets - 1) + " of 2 leters");
			System.out.println((buckets - 1) + " of 3 leters and");
			System.out.println("additional 1 bucket of 3 leters");
		}
		if (vol % 5 == 4) {
			System.out.println("The number of buckets needed is: ");
			System.out.println((buckets - 1) + " of 2 leters");
			System.out.println((buckets - 1) + " of 3 leters and");
			System.out.println("additional 2 buckets of 2 leters each");
		}
	}

}
