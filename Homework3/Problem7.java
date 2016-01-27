
//Creates 2 arrays, 1st one is entered using the console and the second one
//is created using the sum of the previous and next corresponding element of the 1st
import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Please enter the length of the array");
			n = sc.nextInt();
		} while (n <= 0);
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		// enteres the values of the 1st array
		System.out.println("Please enter the first array");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Please enter the value of element No " + (i + 1));
			arr1[i] = sc.nextInt();
		}
		arr2[0] = arr1[0];
		arr2[arr2.length - 1] = arr1[arr1.length - 1];
		for (int i = 1; i < arr2.length - 1; i++) {
			arr2[i] = arr1[i - 1] + arr1[i + 1];
		}
		// prints the new array
		System.out.println("The new array is: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
