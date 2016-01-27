package notebook;

import java.util.Scanner;

public class SecureNotepad extends Notepad {
	private String password;

	/**
	 * Creates a secured Notepad with an empty owner field and 10 pages by
	 * default but must have a password;
	 * 
	 */
	SecureNotepad(String password) {
		super();
		setPassword(password);
	}
	/**
	 * Creates a secured Notepad with an owner, 10 pages by default and must have
	 * a password
	 */
	SecureNotepad(String owner,String password){
		this(password);
		super.setOwner(owner);
	}
	/**
	 * Creates a secured Notepad with an owner, password and a user defined number
	 * of pages
	 */
	SecureNotepad(String owner,String password,int pages){
		super(owner,pages);
		setPassword(password);
	}
	private void setPassword(String password) {
		if (password.length() < 6 && password.length() > 0) {
			System.out.println("The password is shorter than 6 characters");
			System.out.println("Enter '1' if you wish to continue and '2' to type a new password");
			Scanner sc = new Scanner(System.in);
			char selection = sc.nextLine().charAt(0);
			switch (selection) {
			case '1':
				this.password = password;
				break;
			case '2':
				password=sc.next();
				setPassword(password);
				break;
			default:
				System.out.println("Invalid input - choose '1' or '2'");
				setPassword(password);
				break;
			}
		} else{
			this.password=password;
		}
	}
	/**
	 * Returns the name of the owner only after password validation
	 */
	public void getOwner(String password) {
		if(password==this.password){
			super.getOwner();
		} else{
			System.out.println("Password does not match, please enter your password again");
			Scanner sc=new Scanner(System.in);
			password=sc.nextLine();
			getOwner(password);
		}
	}
	/**
	 * Sets the owner of the notebook only after password validation
	 */
	public void setOwner(String owner,String Password) {
		if(password==this.password){
			super.setOwner(owner);
		} else{
			System.out.println("Password does not match, please enter your password again");
			Scanner sc=new Scanner(System.in);
			password=sc.nextLine();
			setOwner(password);
		}
		
	}
	/**
	 * Adds a title to a certain page only after password validation
	 */
	public void addTitle(String title, int pageNumber, String password) {
		if(password==this.password){
			super.addTitle(title,pageNumber);
		} else{
			System.out.println("Password does not match, please enter your password again");
			Scanner sc=new Scanner(System.in);
			password=sc.nextLine();
			addTitle(title,pageNumber,password);
		}
	}
	/**
	 * Adds text to a certain page of the notebook only after password validation
	 */
	public void addText(int pageNumber, String text,String password) {
		if(password==this.password){
			super.addText(pageNumber,text);
		} else{
			System.out.println("Password does not match, please enter your password again");
			Scanner sc=new Scanner(System.in);
			password=sc.nextLine();
			addText(pageNumber,text,password);
		}
		
	}
	/**
	 * Deletes the text from a certain page only after password validation
	 */
	public void deleteText(int pageNumber,String password) {
		if(password==this.password){
			super.deleteText(pageNumber);
		} else{
			System.out.println("Password does not match, please enter your password again");
			Scanner sc=new Scanner(System.in);
			password=sc.nextLine();
			deleteText(pageNumber,password);
		}
	}
	/**
	 * Prints out a certain page only after password validation
	 */
	public void printPage(int pageNumber,String password) {
		
		if(password==this.password){
			super.printPage(pageNumber);
		} else{
			System.out.println("Password does not match, please enter your password again");
			Scanner sc=new Scanner(System.in);
			password=sc.nextLine();
			printPage(pageNumber,password);
		}
		
	}
	/**
	 * Searches a word inside the pages only after password validation
	 */
	public boolean searchWord(int pageNumber,String word,String password){
		if(password==this.password){
			super.searchWord(pageNumber, word);
		} else{
			System.out.println("Password does not match, please enter your password again");
			Scanner sc=new Scanner(System.in);
			password=sc.nextLine();
			searchWord(pageNumber,word,password);
		}
		return false;
		
	}
	protected String getPassword(){
		return this.password;
	}
}
