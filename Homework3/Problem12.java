import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		System.out.println("Eneter the elements of the array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter the value of element No " + (i + 1));
			arr[i] = sc.nextInt();
		}
		int temp;
		int[] arrResult = new int[7];
		for (int i = 0; i < arr.length; i++) {
			if ((i / 2) < 1) {
				temp = arr[0];
				arrResult[0] = arr[1];
				arrResult[1] = temp;
			}
			if ((i / 2) == 1) {
				temp = arr[2] + arr[3];
				arrResult[2] = temp - arr[3];
				arrResult[3] = temp - arr[2];
			}
			if ((i / 2) == 2) {
				temp = arr[4] * arr[5];
				arrResult[4] = temp / arr[5];
				arrResult[5] = temp / arr[4];
			}
			if ((i / 2) == 3) {
				arrResult[7] = arr[7];
			}
		}

	}

}
