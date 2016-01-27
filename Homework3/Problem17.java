
//Creates an array using the console and checks if it is jagged upward
import java.util.Scanner;

public class Problem17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n; // initiates the variable to be used as length of the array
		// initiates the variable that will be used to determine if the array is
		// jagged
		boolean jagged = true;
		// reads the length of the array
		do {
			System.out.println("Please enter the lenth of the array");
			n = sc.nextInt();
		} while (n <= 0);
		// initiates the array with the desired length
		int[] arr = new int[n];
		// fills the array with values
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter the element No " + (i + 1) + " of the array");
			arr[i] = sc.nextInt();
		}
		// Cheks if the array is jagged
		for (int i = 1; i < arr.length - 1; i++) {
			if (i % 2 == 1) {
				if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
					jagged = true;
				} else {
					jagged = false;
					break;
				}
			} else {
				if (arr[i - 1] > arr[i] && arr[i] < arr[i + 1]) {
					jagged = true;
				} else {
					jagged = false;
					break;
				}
			}

		}
		if (jagged) {
			System.out.println("The array is jagged");
		} else {
			System.out.println("The array is not jagged");
		}

	}

}
