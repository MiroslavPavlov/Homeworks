
//Creates a NxN square matrix using the console and prints out the diagonals
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		// initiates the size of the matrix;
		do {
			System.out.println("Please enter the size of the matrix");
			n = sc.nextInt();
		} while (n <= 0);
		// initiates the matrix
		int[][] arr = new int[n][n];
		// puts values into the matrix
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(
						"Please enter value for element in the " + (i + 1) + " row and " + (j + 1) + " column");
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("The primary diagonal is:");
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1) {
				System.out.print(arr[i][i] + " ");
			} else {
				System.out.println(arr[i][i]);
			}
		}
		System.out.println("The secondary diagonal is:");
		for (int i = arr.length - 1; i >= 0; i--) {
			if (i > 0) {
				System.out.print(arr[i][arr.length - 1 - i]);
			} else {
				System.out.println(arr[i][arr.length - 1 - i]);
			}
		}
	}
}
