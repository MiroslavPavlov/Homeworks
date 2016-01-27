
//Creates a 2 dimensional array using the console and prints out the sum of it's
//elements and their average
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, m;
		// enteres the size of the array
		do {
			System.out.println("Please enter the number of rows");
			n = sc.nextInt();
			System.out.println("Please enter the number of columns");
			m = sc.nextInt();
		} while (n <= 0 || m <= 0);
		// initiates the array
		int[][] arr = new int[n][m];
		// puts values into the array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(
						"Please enter value for element in the " + (i + 1) + " row and " + (j + 1) + " column");
				arr[i][j] = sc.nextInt();
			}
		}
		int sum = 0;
		// calculates the sum of the elements in the array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];
			}
		}
		// calculates the average of all numbers in the array
		int average = sum / (arr.length + arr[1].length);
		System.out.println("The sum of all elements is: " + sum);
		System.out.println("The average of all elements is: " + average);
	}

}
