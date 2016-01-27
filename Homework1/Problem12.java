
//Reads 3 numbers from the console - date,month,year and gives the next date
import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int date, month, year;
		boolean checked=false;
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the date");
		date = sc.nextInt();
		System.out.println("Please enter the month");
		month = sc.nextInt();
		if (month == 2 && date > 28) {
			System.out.println("Please enter a date under 28 for the month of febuary");
			date=sc.nextInt();
		}
		System.out.println("Please enter the year");
		year = sc.nextInt();
		
		if (month > 12) {
			System.out.println("Please enter a number for months between 1 and 12");
		}
		if (year % 4 == 0 && (year % 400 != 0)) {
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				if (date < 31) {
					date++;
				} else {
					date = 1;
					if(month<12){month++;}
					else {month=1;year++;}
				}
			}
			if (month == 2) {
				if (date < 29) {
					date++;
				} else {
					date = 1;
				}
			}
			if (month == 4 || month == 6 || month == 9 || month == 11) {
				if (date < 30) {
					date++;
				} else {
					date = 1;
				}
			}
		}
		else { 
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				if (date < 31) {
					date++;
				} else {
					date = 1;
					if(month<12){month++;}
					else {month=1;year++;}
				}
			}
			if (month == 2) {
				if (date < 28) {
					date++;
				} else {
					date = 1;
					month++;
				}
			}
			if (month == 4 || month == 6 || month == 9 || month == 11) {
				if (date < 30) {
					date++;
					
				} else {
					date = 1;
					month++;
				}
			}
		}
		System.out.println("The new date is: "+date+". "+month+". "+year);
	}
}
