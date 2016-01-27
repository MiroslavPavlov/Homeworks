
//Creates a 2 dimensional array 6x5 using the console and prints out the largest and
//the smallest value;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[6][5];
		// puts values into the array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(
						"Please enter value for element in the " + (i + 1) + " row and " + (j + 1) + " column");
				arr[i][j] = sc.nextInt();
			}
		}
		// initiates the maximum and minimum value of the array
		int max = arr[0][0], min = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (min > arr[i][j]) {
					min = arr[i][j];
				}
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
			}
		}
		System.out.println("The minimum element of the array is: " + min);
		System.out.println("The maximum elemen of the array is: " + max);
	}

}
