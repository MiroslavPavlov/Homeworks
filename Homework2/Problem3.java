//prints out all the odd numbers from -10 to 10
public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = -10; i <= 10; i++) {
			if (i < 8) {
				if (i % 2 != 0) {
					System.out.print(i + ", ");
				}
			} else {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
		}
	}

}
