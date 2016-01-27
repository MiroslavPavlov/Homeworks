
//Reads a number using the console, than makes it into binary, writes it in an
//array and prints out the binary value
import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, count = 0;
		Scanner sc = new Scanner(System.in);
		// reads the number that will be transformed into binary
		do {
			System.out.println("Please enter the number");
			n = sc.nextInt();
		} while (n < 0);
		// int[] binaryArray = new int[16];
		// starts transforming the number into binary
		int temp = n;
		do {
			temp = temp / 2;
			count++;

		} while (temp != 0);
		int[] binaryArray = new int[count];
		for (int i = 0; i < count; i++) {
			if (n > 1) {
				binaryArray[i] = n % 2;
				n = n / 2;
			} else {
				binaryArray[i] = n % 2;
			}

		}
		// prints the number into binary
		for (int i = 0; i < binaryArray.length; i++) {
			System.out.print(binaryArray[i]);
		}
	}

}
