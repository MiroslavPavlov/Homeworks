
//Creates a method that takes a number that has bin entered using the console
//and returns an array that is filled with the numbers from 1 to N
import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Please enter the number");
			n = sc.nextInt();
		} while (n == 0);
		int[] resultArray = fillArray(n);
		for (int i = 0; i < resultArray.length; i++) {
			if (i < resultArray.length - 1) {
				System.out.print(resultArray[i] + " ");
			} else {
				System.out.println(resultArray[i]);
			}
		}
	}

	static int[] fillArray(int n) {
		int[] resultArray = new int[n];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = i + 1;
		}
		return resultArray;
	}
}
