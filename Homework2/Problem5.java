
//Reads 2 numbers from the console and prints out all the numbers between them

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, temp;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number");
		a = sc.nextInt();
		System.out.println("Enter the second number");
		b = sc.nextInt();
		if (a == b) {
			System.out.println("The two numbers are equal: " + a);
		} else {
			if (a > b) {
				temp = a;
				a = b;
				b = temp;
			}
			for (int i = a; i <= b; i++) {
				if (i < b) {
					System.out.print(i + " ");
				} else {
					System.out.println(i);
				}
			}
		}
	}

}
