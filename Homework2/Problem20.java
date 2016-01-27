
//Writes a square of numbers where each row or column has a sum of 45
import java.util.Scanner;

public class Problem20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter a number to initiate the square");
			n = sc.nextInt();

		} while (n < 0 || n > 10); */
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j <= 9; j++) {
				if(i+j+1>9){
					System.out.print((i+j)-9+" ");
				}
				else {
					System.out.print((i+j)+1+" ");
				}
			}
				System.out.println();
			}
		}

	}
