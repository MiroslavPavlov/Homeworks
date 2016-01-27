
//Reads an array of 7 numbers using the console, prints out the average value and
//the element that is closest to it
import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// boolean closest=false;
		int[] arr = new int[7];
		int sum = 0, average = 0, closestValue = 0;
		// enters the elements of the array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter the element No " + (i + 1));
		}
		// calculates the average of the array
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		average = sum / arr.length;
		// finds the closest value to the average
		System.out.print("Average value is: " + average + ", closest value is: ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == average) {
				closestValue = arr[i];
				break;
			} else {
				if ((average - arr[i]) <= 2) {
					closestValue = arr[i];
				}
			}
		}
		System.out.println(closestValue);
	}

}
