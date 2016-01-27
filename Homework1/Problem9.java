//Reads 2 numbers from the console and checks if the result of their multiplication
//is even and if the last digit of that result is even;
import java.util.Scanner;
public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b; //declares the needed variables
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the two digit number");
		a=sc.nextInt();
		System.out.println("Please enter the second two digit number");
		b=sc.nextInt();
		if((a*b)%2==0){
			System.out.println("The number is even: "+(a*b)+", "+((a*b)%10));
		}
		else {System.out.println("The number uneven: "+(a*b)+", "+((a*b)%10));}
	}

}
