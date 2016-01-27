
//Creates a methot that prints an array into the console;
import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter the length of the array");
			n = sc.nextInt();
		} while (n <= 0);
		// initiates the array;
		int[] arr = new int[n];
		// Fills the array with values;
		System.out.println("Please enter the values for the 1st array");
		for (int i = 0; i <= arr.length; i++) {
			System.out.println("Enter the value of the " + (i + 1) + " element of the 1st array");
			arr[i] = sc.nextInt();
		}
		printArray(arr);
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1) {
				System.out.print(arr[i] + " ");
			} else {
				System.out.println(arr[i]);
			}
		}
	}
}
