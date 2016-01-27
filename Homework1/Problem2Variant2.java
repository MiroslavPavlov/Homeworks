
//Read 2 numbers type double from the console than write into different 
//parameters their various mathematical interactions

import java.util.Scanner;

public class Problem2Variant2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a, b; // declaring the 2 numbers, that will be used to make
		// different mathematical interactions
		// declaring the
		// variables
		// used for
		// different mathematical interractions
		double sum, sub1, sub2, mult, part1, part2, mod1, mod2;

		// Reading the numbers using the console
		System.out.println("Please enter the first number");
		a = sc.nextDouble();
		System.out.println("Please enter the second number");
		b = sc.nextDouble();
		// recording the different mathematical interactions between the numbers
		sum = a + b;
		sub1 = a - b;
		sub2 = b - a;
		mult = a * b;
		part1 = a / b;
		part2 = b / a;
		mod1 = a % b;
		mod2 = b % a;
		// Printing the various mathematical ineractions
		System.out.println("The sum between the two numbers is: " + sum);
		System.out.println("The subtraction of " + a + " and" + b + " is: " + sub1);
		System.out.println("The substraction of " + b + " and" + b + " is:" + sub2);
		System.out.println("The result of the multiplication between the two numbers is: " + mult);
		System.out.println("The result of dividing " + a + " and " + b + " is: " + part1);
		System.out.println("The result of dividing " + b + " and " + a + " is: " + part2);
		System.out.println("The result of modulus dividing of " + a + " and " + b + " is: " + mod1);
		System.out.println("The result of modulus dividing of " + b + " and " + a + " is: " + mod2);

	}

}