
//Finds the longest string of equal elements in an array
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int currElement, maxStringElement, maxString = 0, count = 0, n;
		// reads the lenth of the array;
		do {
			System.out.println("Please enter the length of the array");
			n = sc.nextInt();
		} while (n <= 0);
		// initiates the array;
		int[] arr = new int[n];
		// puts values into the array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter the value of element No " + (i + 1));
			arr[i] = sc.nextInt();
		}
		maxStringElement = arr[0];
		for (int i = 0; i < arr.length; i++) {
			currElement = arr[i];
			for (int j = i; j < arr.length; j++) {
				if (currElement == arr[j]) {
					count++;
				}
			}
			if (count > maxString) {
				maxString = count;
				maxStringElement = currElement;
			}
		}
		System.out.println("The element that has the maximum amout of sequential repeats is: " + maxStringElement
				+ " with " + maxString + " repeats");
	}

}
