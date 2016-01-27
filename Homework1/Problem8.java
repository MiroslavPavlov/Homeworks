//reads a 4 digit number using the console, than makes 2 new numbers using the 1st and 
//4th digit and the 2nd and 3rd digit, than check which is bigger
import java.util.Scanner;
public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,n; //declares the variables needed for the task
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter a four digit number");
		n=sc.nextInt();
		a=n%10;
		n=n/10;
		b=n%10;
		n=n/10;
		c=n%10;
		n=n/10;
		d=n%10;
		a=(d*10)+a;
		b=(c*10)+b;
		if(a>b){System.out.println("The new number is bigger "+"("+a+">"+b+")");}
		else {System.out.println("The new number is smaller "+"("+a+"<"+b+")");
		if(a==b){System.out.println("The new numbers are equal "+"("+a+"="+b+")");}
		}
	}

}
