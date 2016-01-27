
//Reads 2 arrays using the console and prints out a message if they have the
//same lenth and if they are equal
import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, m;
		boolean equal = true;
		Scanner sc = new Scanner(System.in);

		// reads the lengths of the 2 arrays
		do {
			System.out.println("Please enter the length of the first array");
			n = sc.nextInt();
			System.out.println("Please enter the length of the second array");
			m = sc.nextInt();
		} while (n <= 0 || m <= 0);
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		// Enteres values of the 2 arrays
		System.out.println("Please enter the elements of the 1st array");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Please enter the value of element No " + (i + 1));
			arr1[i] = sc.nextInt();
		}
		System.out.println("Please enter the elements of the 2nd array");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("Please enter the value of element No " + (i + 1));
			arr2[i] = sc.nextInt();
		}
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					equal = false;
					break;
				}
			}
			if (equal) {
				System.out.println("The arrays have an equal length and are equal");
			} else {
				System.out.println("The arrays have an equal length but are not equal");
			}
		} else {
			System.out.println("The arrays don't have the same length");
		}
	}
}