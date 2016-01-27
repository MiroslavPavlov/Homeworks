
//Reads two double numbers from the console, than cheks if a third number is
// between them

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b; // a and b are the numbers that will be entered
		double c; // c will be the number that will be cheked if it's between a
					// and b
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the first number");
		a = sc.nextDouble();
		System.out.println("Please enter the second number");
		b = sc.nextDouble();
		System.out.println("Plese enter the number you want to chek");
		c = sc.nextDouble();

		double temp; // declaring a temporary variable for making "a" to be the
						// smaller
						// of the two initial numbers
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		if (c > a && c < b) {
			System.out.println("The number " + c + " is between " + a + " " + b);
		}
		if (c > b) {
			System.out.println("The number " + c + " is larger than " + a + " " + b);
		}
		if (c < a) {
			System.out.println("The number " + c + " is smaller than" + a + " " + b);
		}
	}

}
