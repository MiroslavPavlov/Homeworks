
//Reads 2 arrays using the scanner than uses a methot to merge them together into
//a new array
import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Length of both initial arrays
		int n, m;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter the length of the 1st array");
			n = sc.nextInt();
			System.out.println("Please enter the length of the 2nd array");
			m = sc.nextInt();
		} while (n <= 0 | m <= 0);
		// initiates the two arrays;
		int[] firstArray = new int[n];
		int[] secondArray = new int[m];
		// Fills the two arrays with values;
		System.out.println("Please enter the values for the 1st array");
		for (int i = 0; i <= firstArray.length; i++) {
			System.out.println("Enter the value of the " + (i + 1) + " element of the 1st array");
			firstArray[i] = sc.nextInt();
		}
		System.out.println("Please enter the values for the 2nd array");
		for (int i = 0; i <= secondArray.length; i++) {
			System.out.println("Enter the value of the " + (i + 1) + " element of the 2nd array");
			secondArray[i] = sc.nextInt();
		}
		int[] resultArray = arrayMerge(firstArray, secondArray);
		// Prints out the values of the new array;
		for (int i = 0; i < resultArray.length; i++) {
			if (i < resultArray.length - 1) {
				System.out.print(resultArray[i] + " ");
			} else {
				System.out.println(resultArray[i]);
			}
		}

	}

	/**
	 * Takes as arguments 2 arrays and merges them together where the elements
	 * of the first array stay in the front of the resulting array and the
	 * elements from the second one are after the first one
	 */
	static int[] arrayMerge(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length + arr2.length];
		for (int i = 0; i < result.length; i++) {
			if (i < arr1.length) {
				result[i] = arr1[i];
			} else {
				result[i] = arr2[i - arr1.length];
			}
		}
		return result;
	}
}
