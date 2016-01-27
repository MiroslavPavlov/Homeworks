package notebook;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Running demo");
		
	}

	public void demoTesting() {

		System.out.println("In order to create a simple Notepad please choose 1");
		System.out.println("In order to create a Secured Notepad plase choose 2");
		System.out.println("In order to create an Electronic Notepad please choose 3");
		Scanner sc = new Scanner(System.in);
		char choise = sc.next().charAt(0);
		switch (choise) {
		case '1':
			creatingSimpleNotepad();
			break;
		case '2':
			creatingSecuredNotepad();
			break;
		case '3':
			creatingElectronicSecuredNotepad();
			break;
		default:
			System.out.println("Invalid input, please try again");
			
			demoTesting();
		}

	}

	/**
	 * Takes as a parameter a character from 1 to 3
	 * 
	 */
	public void creatingSimpleNotepad() {
		System.out.println("In order to create a basic notepad without an owner choose '1'");
		System.out.println("In order to create a basic notepad with an owner choose '2'");
		System.out.println("In order to create a basic notepad with an owner and a desired number of pages choose '3'");
		Scanner sc = new Scanner(System.in);
		char simpleNotepadChoise = sc.next().charAt(0);
		switch (simpleNotepadChoise) {
		case '1':
			System.out.println("The notepad created will be caclled notepad1");
			Notepad notepad1 = new Notepad();
			break;
		case '2':
			System.out.println("The notepad created will be called notepad2");
			System.out.println("Type the owner's name");
			String name = sc.next();
			Notepad notepad2 = new Notepad(name);

		case '3':
			System.out.println("The notepad created will be called notepad3");
			System.out.println("Type the owner's name");
			String name2 = sc.next();
			System.out.println("Enter the number of pages you wish to create");
			int pages = sc.nextInt();
			Notepad notepad3 = new Notepad(name2, pages);
			break;
		default:
			System.out.println("Invalid chcoise, returining to main menu");
			demoTesting();

		}
	}

	public void creatingSecuredNotepad() {
		System.out.println("In order to create a basic secured notepad without an owner choose '1'");
		System.out.println("In order to create a basic secured notepad with an owner choose '2'");
		System.out.println(
				"In order to create a basic secured notepad with an owner and a desired number of pages choose '3'");
		Scanner sc = new Scanner(System.in);
		String password;
		char securedNotepadChoise = sc.next().charAt(0);
		switch (securedNotepadChoise) {
		case '1':
			System.out.println("The notepad created will be caclled notepad1");
			System.out.println("Please enter your password");
			password = sc.next();
			SecureNotepad notepad1 = new SecureNotepad(password);
			break;
		case '2':
			System.out.println("The notepad created will be called notepad2");
			System.out.println("Type the owner's name");
			String name = sc.next();
			System.out.println("Please enter your password");
			password = sc.next();
			SecureNotepad notepad2 = new SecureNotepad(name, password);
			break;
		case '3':
			System.out.println("The notepad created will be called notepad3");
			System.out.println("Type the owner's name");
			String name2 = sc.next();
			System.out.println("Enter the number of pages you wish to create");
			int pages = sc.nextInt();
			System.out.println("Please enter your password");
			password = sc.next();
			SecureNotepad notepad3 = new SecureNotepad(name2, password, pages);
			break;
		default:
			System.out.println("Invalid choise, returining to main menu");
			demoTesting();
		}
	}
	public void creatingElectronicSecuredNotepad() {
		System.out.println("In order to create a electronic basic secured notepad without an owner choose '1'");
		System.out.println("In order to create a basic electronic secured notepad with an owner choose '2'");
		System.out.println(
				"In order to create a basic electronic secured notepad with an owner and a desired number of pages choose '3'");
		Scanner sc = new Scanner(System.in);
		String password;
		char electronicSecuredNotepadChoise = sc.next().charAt(0);
		switch (electronicSecuredNotepadChoise) {
		case '1':
			System.out.println("The notepad created will be caclled notepad1");
			System.out.println("Please enter your password");
			password = sc.next();
			ElectronicSecuredNotepad notepad1 = new ElectronicSecuredNotepad(password);
			break;
		case '2':
			System.out.println("The notepad created will be called notepad2");
			System.out.println("Type the owner's name");
			String name = sc.next();
			System.out.println("Please enter your password");
			password = sc.next();
			ElectronicSecuredNotepad notepad2 = new ElectronicSecuredNotepad(name, password);
			break;
		case '3':
			System.out.println("The notepad created will be called notepad3");
			System.out.println("Type the owner's name");
			String name2 = sc.next();
			System.out.println("Enter the number of pages you wish to create");
			int pages = sc.nextInt();
			System.out.println("Please enter your password");
			password = sc.next();
			ElectronicSecuredNotepad notepad3 = new ElectronicSecuredNotepad(name2, password, pages);
			break;
		default:
			System.out.println("Invalid choise, returining to main menu");
			demoTesting();
		}
	}
	
}
