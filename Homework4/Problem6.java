import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[6][6];
		int sum = 0;
		// puts values into the array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(
						"Please enter value for element in the " + (i + 1) + " row and " + (j + 1) + " column");
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i % 2 == 0) {
					sum = sum + arr[i][j];
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println(" Sum is: " + sum);
			sum = 0;
		}
	}

}
