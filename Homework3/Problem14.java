//Reads an array of numbers using the console, than finds the elements that are
// inside the interval [-2.99;2.99] and writes them in a new array, than prints
//the new array

import java.util.Scanner;
public class Problem14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,n;
		Scanner sc=new Scanner(System.in);
		//enters the length of the array;
		do{
			System.out.println("Please enter the lenth of the array");
			n=sc.nextInt();
		} while(n<=0);
		//initiates both primary and resulting arrays
		double[] primaryArray=new double[n];
		double[] resultArray=new double[n];
		for(int i=0;i<primaryArray.length;i++){
			System.out.println("Please enter the element of the array No "+(i+1));
			primaryArray[i]=sc.nextDouble();
		}
		//writes the desired values into the resulting array
		for(int i=0;i<primaryArray.length;i++){
			if(primaryArray[i]>-2.99&&primaryArray[i]<2.99){
				resultArray[count]=primaryArray[i];
				count++;
			}
		}
		//prints out the resulting array of numbers
		for(int i=0;i<=count;i++){
			if(i!=count){
				System.out.print(resultArray[i]+"; ");	
			} else{
				System.out.println(resultArray[i]);
			}
			
		}
	}

}
