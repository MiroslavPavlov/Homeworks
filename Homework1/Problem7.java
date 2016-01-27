
//Reads an integer type number for hour, double type number for money, boolean type 
//for being sick or not, than gives a decision based on that

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hours = 0;
		double money = 0;
		boolean sick = true;
		char ch;
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the hours of the day between 0 and 24");
		hours = sc.nextInt();
		System.out.println("Please enter the amount of money, enter a positive number or 0 if you do not have any money");
		money = sc.nextDouble();
		System.out.println("Please enter if you are sick - yes or no");
		ch = sc.next().charAt(0);

		if (ch == 'y') {
			sick = true;
		} else {
			sick = false;
		}
		if (sick && (money > 0)) {
			System.out.println("I am sick and I will buy medicine");
		}
		if (sick && (money == 0)) {
			System.out.println("I am sick and I will stay home to drink tea");
		}
		if ((!sick) && (money > 10)) {
			System.out.println("I will go out and watch a movie with friends");
		}
		if ((!sick) && (money < 10) && (money > 0)) {
			System.out.println("I will go drink coffee");
		}

	}

}
