//Reads an array of numbers using the console, than constructs a new array
//where first half of the elements are the same as the original, and the second
//one are the rest but backwards
import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		//initiates the lenth of the arrays
		do{
			System.out.println("Please enter the lenth of the array");
			n=sc.nextInt();
		}while(n<=0);
		int[] arrOriginal=new int[n];
		int[] arrResult=new int[n];
		int j=0;
		//constructs the new array
		for(int i=0;i<arrOriginal.length;i++){
			if(i<=arrOriginal.length/2){
				arrResult[i]=arrOriginal[i];
			} else{
				arrResult[i]=arrOriginal[arrOriginal.length-1-j];
				j++;
			}
		}
	}

}
