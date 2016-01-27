
// Reads the positions of 2 squares on a chess board and gives an output if they are
//the same colour
import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1, a2, b1, b2; // coordiantes of the 2 squares and
		char colour1, colour2; // the colours of the 2 squares
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the 1st coordinate of the 1st square");
		a1 = sc.nextInt();
		if (a1 <= 0 || a1 > 8) {
			System.out.println("Please enter a number between 1 and 8");
			a1 = sc.nextInt();
		}
		System.out.println("Please enter the 2nd coordinate of the 1st square");
		a2 = sc.nextInt();
		if (a2 <= 0 || a2 > 8) {
			System.out.println("Please enter a number between 1 and 8");
			a2 = sc.nextInt();
		}
		System.out.println("Please enter the 1st coordinate of the 2nd square");
		b1 = sc.nextInt();
		if (b1 <= 0 || b1 > 8) {
			System.out.println("Please enter a number between 1 and 8");
			b1 = sc.nextInt();
		}
		System.out.println("Please enter the 2nd coordinate of the 2nd square");
		b2 = sc.nextInt();
		if (b2 <= 0 || b2 > 8) {
			System.out.println("Please enter a number between 1 and 8");
			b2 = sc.nextInt();
		}

		if ((a1 + a2) % 2 == 0) {
			colour1 = 'b';
		} // b meaning square black
		else {
			colour1 = 'w';
		} // w meaning the square is white
		if ((b1 + b2) % 2 == 0) {
			colour2 = 'b';
		} // b meaning the square is black
		else {
			colour2 = 'w';
		}
		if (colour1 == colour2) {
			System.out.println("The squares are the same colour");
		} else {
			System.out.println("The squares are different colours");
		}
	}
}
