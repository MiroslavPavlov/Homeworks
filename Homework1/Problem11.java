//Reads a three digit number from the console, and checks if it is divided
//by each of it's digits, none of those digits must be 0
import java.util.Scanner;
public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp1,temp2,temp3; //declares the number and the other needed variables
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a three digit number that does not conain 0 in it");
		n=sc.nextInt();
		temp1=n;
		temp2=temp1%10;
		temp1=temp1/10;
		temp3=temp1%10;
		temp1=temp1/10;
		if((n%temp2==0)&&(n%temp3==0)&&(n%temp1==0)){
			System.out.println("The number is divided by all of it's digits");
		}
		else {System.out.println("The number is not divided by all of it's digits");}
	}

}
