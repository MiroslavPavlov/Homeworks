//Read two numbers using the console, changing their positions and printing
//out their new values

import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//declaring the two numbers
		double a,b;
		//declaring a third number that will be used to swap the values of "a" and "b"
		double temp;
		System.out.println("Please enter the first number A");
		a=sc.nextDouble();
		System.out.println("Please enter the second number B");
		b=sc.nextDouble();
		//swapping the values of "a" and "b" using the temporary variable
		temp=a;
		a=b;
		b=temp;
		
		//Printing out the new values of A and B
		System.out.println("The new value of A is: "+a);
		System.out.println("The new value of B is: "+b);
		
	}

}
