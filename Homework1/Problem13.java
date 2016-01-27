//Reads a number that represents degrees and guesses out how cold or warm it is

import java.util.Scanner;
public class Problem13 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double deg;
		Scanner sc= new Scanner(System.in);
		System.out.println("Plese enter the value of the thermometer");
		deg=sc.nextDouble();
		if(deg<(-100)||deg>100){
			System.out.println("Please enter a number in the interval [-100;100]");
			deg=sc.nextDouble();
		}
		if(deg<=(-20)){System.out.println("It is ice cold");}
		if(deg>(-20)&&deg<=0){System.out.println("It is cold");}
		if(deg>0&&deg<=15){System.out.println("It is cool");}
		if(deg>15&&deg<=25){System.out.println("It is warm");}
		if(deg>25){System.out.println("It is hot");}
	}

}
