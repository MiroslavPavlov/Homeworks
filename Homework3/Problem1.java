//Reads an array of numbers using the console and prints out the smallest element
//that is divided by 3
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,min;
		Scanner sc=new Scanner(System.in);
		//reads the length of the array
		do{
			System.out.println("Please enter the length of the array");
			n=sc.nextInt();
		}while(n<=0);
		//initiates and writes values to the array
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++){
			System.out.println("Please enter the element No "+(i+1));
			arr[i]=sc.nextInt();
		}
		min=arr[0];
		//finds the smallest element of the array that is divided by 3;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%3==0&&arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("The smallest element of the array that is dived by 3 is: "+min);
	}

}
