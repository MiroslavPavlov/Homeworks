//Prints out the multyplying table without duplications
public class Problem23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1, m = 1;
		do {
			m = n;
			do {

				System.out.print(n + "*" + m + " ");
				m++;

			} while (m < 10);
			System.out.println();
			n++;
		} while (n < 10);

	}
}