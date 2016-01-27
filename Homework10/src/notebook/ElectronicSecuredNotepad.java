package notebook;

import java.util.Scanner;

public class ElectronicSecuredNotepad extends SecureNotepad implements IElectronicDevice {
	private boolean runnning = false;

	/**
	 * Creates an electronic device without an owner with 10 pages as default
	 * and a password
	 */
	ElectronicSecuredNotepad(String password) {
		super(password);
	}

	ElectronicSecuredNotepad(String owner, String password) {
		super(owner, password);
	}

	ElectronicSecuredNotepad(String owner, String password, int pages) {
		super(owner, password, pages);
	}

	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your password");
		String password = sc.nextLine();
		if (super.getPassword().equals(password)) {
			this.runnning = true;
		} else {
			System.out.println("Password does not match, press '1' to abort or '2' to try again");
			char ch = sc.next().charAt(0);
			if (ch == '1') {
				return;
			} else {
				if (ch == '2') {
					start();
				} else {
					System.out.println("Invalid command, aborting operation");
					return;
				}
			}
		}
	}

	/**
	 * Turns off the electronic device after making a password validation;
	 */
	@Override
	public void stop() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your password");
		String password = sc.nextLine();
		if (super.getPassword().equals(password)) {
			this.runnning = true;
		} else {
			System.out.println("Password does not match, press '1' to abort or '2' to try again");
			char ch = sc.next().charAt(0);
			if (ch == '1') {
				return;
			} else {
				if (ch == '2') {
					start();
				} else {
					System.out.println("Invalid command, aborting operation");
					return;
				}
			}

		}
	}

	/**
	 * Returns the status of the device after making a password validation
	 */
	public boolean isStarted(String password) {
		if (super.getPassword().equals(password)) {
			return this.runnning;
		} else {
			System.out.println("Password does not match, operation aborted");
			return false;
		}

	}
}
