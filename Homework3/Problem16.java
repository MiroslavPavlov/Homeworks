
//Creates an array with 10 real type numbers and creates a new array following the
//rules:
//1.Each element that has a value less than -0.231 is changed with the sum 
//of the number of the element squared and 41.25
//2.Each element that is larger than -0.231 is changed to the result 
//of the multiplication of the number of the element and it's value 
// 
//Note the 1-st element has a number of 1
import java.util.Scanner;

public class Problem16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double[] arrPrime = new double[10]; // initiates the primary array
		double[] result = new double[10]; // initiates the array that will hold
											// the results;
		// Enters values into the primary array
		for (int i = 0; i < arrPrime.length; i++) {
			System.out.println("Please enter the value of element No " + (i + 1));
			arrPrime[i] = sc.nextDouble();
		}
		// Starts filling the resulting array using the rules
		for (int i = 1; i <= arrPrime.length; i++) {
			if (arrPrime[i - 1] < -0.231) {
				result[i - 1] = i * i + 41.25;
			} else {
				result[i - 1] = i*arrPrime[i - 1];
			}
		}
		// Prints out the primary array
		for (int i = 0; i < arrPrime.length; i++) {
			if (i < arrPrime.length - 1) {
				System.out.print(arrPrime[i] + ", ");
			} else {
				System.out.println(arrPrime[i]);
			}
		}
		// Prints the resulting array
		for (int i = 0; i < result.length; i++) {
			if (i < result.length - 1) {
				System.out.print(result[i] + ", ");
			} else {
				System.out.println(result[i]);
			}
		}
	}

}
