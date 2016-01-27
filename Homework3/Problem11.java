
//Reads an array of 7 numbers using the console than prints all of the numbers
//that are divided by 5 but larger than 5
import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		int count = 0;

		// Enters the array of numbers
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter the element No " + (i + 1));
			arr[i] = sc.nextInt();
		}
		// prints out the numbers that are divided by 5 and larger than 5
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] % 5 == 0) && arr[i] > 5 && i < arr.length - 1) {
				System.out.print(arr[i] + ", ");
				count++;
			}
			if (arr[i] % 5 == 0 && arr[i] > 5 && i == arr.length - 1) {
				System.out.print(arr[i] + " ");
				count++;
			}
		}
		System.out.println(" - " + count + " numbers");
	}

}
