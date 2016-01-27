
//Reads an array using the console, than stores the three numbers that have 
//maximum sum using their absolute value
import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double[] maxSumArray = new double[3];
		int n; // initiates the variable needed to determine the lenth of the
				// primary array
		do {
			System.out.println("Please enter the lenth of the primary array");
			n = sc.nextInt();
		} while (n < 3);
		// initiates the primary array
		double[] primaryArray = new double[n];
		// puts values into the primary array using the console
		for (int i = 0; i < primaryArray.length; i++) {
			System.out.println("Please enter the value for element No " + (i + 1));
			primaryArray[i] = sc.nextDouble();
		}
		maxSumArray[0] = primaryArray[0];
		maxSumArray[1] = primaryArray[1];
		maxSumArray[2] = primaryArray[2];

		if (maxSumArray[0] > maxSumArray[1]) {
			double temp = maxSumArray[0];
			maxSumArray[0] = maxSumArray[1];
			maxSumArray[1] = temp;
		}
		if (maxSumArray[0] > maxSumArray[2]) {
			double temp = maxSumArray[0];
			maxSumArray[0] = maxSumArray[2];
			maxSumArray[2] = temp;
		}
		if (maxSumArray[1] > maxSumArray[2]) {
			double temp = maxSumArray[1];
			maxSumArray[1] = maxSumArray[2];
			maxSumArray[2] = temp;
		}
		
		// finds the 3 elements of the array with maximum absolute value
		for(int i=0;i<primaryArray.length;i++){
			for (int j = 0; j < primaryArray.length; j++) {
				if (primaryArray[j] < 0) {
					double temp = primaryArray[j] * (-1);
					if (temp >= maxSumArray[0]) {
						if(temp>=maxSumArray[1]){
							if(temp>=maxSumArray[2]){
								maxSumArray[2]=primaryArray[j];
							} else {
								maxSumArray[1]=primaryArray[j];
							}
							
						} else{
							maxSumArray[0]=primaryArray[j];
						}
						
					}
				}
				if(primaryArray[j]>=0){
					if(primaryArray[j]>=maxSumArray[0]){
						if(primaryArray[j]>=maxSumArray[1]){
							if(primaryArray[j]>=maxSumArray[2]){
								maxSumArray[2]=primaryArray[j];
							} else{
								maxSumArray[1]=primaryArray[j];
							}
							
						}else{
							maxSumArray[0]=primaryArray[j];
						}
					}
				}
			}
		}
		// prints out the array with elements that have maximum sum by absolute
		// value
		System.out.println("Elements that have the maximum absolute value are:");
		for (int i = 0; i < maxSumArray.length; i++) {
			if (i < (maxSumArray.length - 1)) {
				System.out.print(maxSumArray[i] + "; ");
			} else {
				System.out.println(maxSumArray[i]);
			}

		}
	}

}
