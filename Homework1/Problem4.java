//Reads 2 numbers using the console and prints them in arising fasion

import java.util.Scanner;
public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a,b; // declares the variables needed for the 2 numbers
		System.out.println("Please enter the first number");
		a=sc.nextDouble();
		System.out.println("Please enter the second number");
		b=sc.nextDouble();
		if(a>b){System.out.println("The arising nubers are: "+b+" "+a);}
		else {System.out.println("The arising numbers are: "+a+" "+b);}
		
	}

}
