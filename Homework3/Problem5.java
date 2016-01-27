//Creates an array where each element is it's index multiplyed by 3

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		// enteres the values of the array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 3;
		}
		// prints the array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
