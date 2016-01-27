
//Creates an array but turning an existing array by 90 degrees
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, m;
		Scanner sc = new Scanner(System.in);
		// reads the number of rows and columns
		do {
			System.out.println("Please enter the size of the matrix");
			n = sc.nextInt();

		} while (n <= 0);
		// Initializes the array
		int[][] arr = new int[n][n];
		// puts values into the array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(
						"Please enter value for element in the " + (i + 1) + " row and " + (j + 1) + " column");
				arr[i][j] = sc.nextInt();
			}
		}
		int[][] arrResult = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; i++) {
				arrResult[i][j] = arr[arr.length - 1 - j][i];
			}
		}
		// prints out the new array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
