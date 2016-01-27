
//Reads an array using the console than transforms it into the same array but
//backwards
import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		double temp;
		Scanner sc = new Scanner(System.in);
		// initiates the length of the array
		do {
			System.out.println("Enter the lenth of the array");
			n = sc.nextInt();
		} while (n <= 0);
		double[] arr = new double[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter the element No " + (i + 1));
			arr[i] = sc.nextDouble();
		}
		// transforms the array backwards;
		for (int i = 0; i < (arr.length - 1) / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		// prints out the new array
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1) {
				System.out.print(arr[i] + " ");
			} else {
				System.out.println(arr[i]);
			}
		}
	}

}
