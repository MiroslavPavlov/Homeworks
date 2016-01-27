
//Reads and array using the console and checks if it's mirrored;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		boolean mirrored = true;
		Scanner sc = new Scanner(System.in);
		// enteres the lenth of the array
		do {
			System.out.println("Please enter the length of the array");
			n = sc.nextInt();
		} while (n <= 0);
		// initiates the array;
		int[] arr = new int[n];
		// enteres values into the array;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter a value for element No " + (i + 1));
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i <= (arr.length - 1) / 2; i++) {
			if (arr[i] != arr[arr.length - 1 - i]) {
				mirrored = false;
				break;
			}
		}
		if (mirrored) {
			System.out.println("The array is mirrored");
		} else {
			System.out.println("The array is not mirrored");
		}
	}

}
