
//Creates an array with 10 elements, where the first 2 elements are a number
//enetered using the console, and the rest are the sum of their previous 2
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, first, second;
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Please enter a number to initiate the array");
			n = sc.nextInt();
		} while (n == 0);
		first = n;
		second = n;
		arr[0] = first;
		arr[1] = second;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = first + second;
			first = second;
			second = arr[i];
		}
		System.out.println("The array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
