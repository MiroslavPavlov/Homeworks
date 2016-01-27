
//Reads 2 numbers from the console and prints out all of the numbers between them
//squared, if a number is divided by 3 prints out "skip3" if the sum of the
//numbers gets larger than 200 to break
import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, sum = 0, temp;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter the first number");
			a = sc.nextInt();
			System.out.println("Please enter the second number");
			b = sc.nextInt();
			if (a == b) {
				System.out.println("Please enter numbers that are not equal");
			}
		} while (a == b);
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		for (int i = a; i <= b; i++) {
			if (i % 3 == 0) {
				System.out.print("Skip3, ");
			} else {
				sum = sum + i * i;
				if (i < b) {
					System.out.print(i * i + ", ");
				} else {
					System.out.println(i * i);

				} if(sum>200){break;}
			}

		}
	}

}
