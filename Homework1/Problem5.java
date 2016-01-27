//reads 3 numbers from the console and prints them in decreasing fasion

import java.util.Scanner;
public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c; //declares the 3 numbes
		double temp; //declares a temporary variable to sort the numbers
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the first number");
		a=sc.nextDouble(); 
		System.out.println("Please enter the second number");
		b=sc.nextDouble();
		System.out.println("Please enter the third number");
		c=sc.nextDouble();
		if(a<b){ temp=a; a=b;b=temp;}
		if(a<c){ temp=a; a=c;c=temp;}
		if(b<c){ temp=c; c=b;b=temp;}
		System.out.println("The numbers in decending order are:");
		System.out.println(a+" "+b+" "+c);
		
	}

}
