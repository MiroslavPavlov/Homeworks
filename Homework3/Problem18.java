
//Enters 2 arrays using the console and compares the corresponding elements
//between them, than writes the larger element in a third array and prints out 
//the new array
import java.util.Scanner;

public class Problem18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Please enter the lenth of the arrays");
			n = sc.nextInt();
		} while (n <= 0);
		int[] arr1 = new int[n]; // initiate the 2 primary arrays
		int[] arr2 = new int[n];
		int[] result = new int[n]; // initiates the array to hold the larger
									// corresponding elements
		// writes values in both arrays
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Please enter element No " + (i + 1) + " of the first array");
			arr1[i] = sc.nextInt();
			System.out.println("Please enter element No " + (i + 1) + " of the second array");
			arr2[i] = sc.nextInt();
		}

		// compares each corresponding element from both initial arrays and
		// writes the
		// larger element in the third array
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > arr2[i]) {
				result[i] = arr1[i];
			} else {
				result[i] = arr2[i];
			}
		}
		// prints the elements from the array containing the results of the
		// comparison
		for (int i = 0; i < result.length; i++) {
			System.out.println("The elements from the resulting array are:");
			if (i < (result.length - 1)) {
				System.out.print(result[i] + " ");
			} else {
				System.out.println(result[i]);
			}
		}
	}

}
