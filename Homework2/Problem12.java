//prints out all three digit numbers that have different digits

public class Problem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp, temp1, temp2;
		for (int n = 100; n <= 990; n++) {
			temp = n;
			temp1 = temp % 10;
			temp = temp / 10;
			temp2 = temp % 10;
			temp = temp / 10;

			if (temp1 != temp2 && temp1 != temp && temp2 != temp) {
				System.out.println(n);

			}

		}
	}
}
