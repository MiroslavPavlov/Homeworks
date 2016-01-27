//Reads 3 numbers from the console -a1,a2,a3, than switches the values so
//that a1 has the value of a2,a2 has the value of a3, a3 has the value of a1

import java.util.Scanner;
public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1,a2,a3,temp1,temp2,temp3;	//declares the 3 variables and a temporary ones for switching
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the first number");
		a1=sc.nextInt();
		System.out.println("Please enter the second number");
		a2=sc.nextInt();
		System.out.println("Please enter the third number");
		a3=sc.nextInt();
		
		temp1=a1;
		temp2=a2;
		temp3=a3;
		a1=temp2;
		a2=temp3;
		a3=temp1;
		System.out.println("The new numbers are: "+a1+" "+a2+" "+a3);
	}

}
