package notebook;

import java.util.Scanner;

public class Notepad implements INotepad {
	private String owner;
	private Page[] pages;
	/**
	 * Default constructor for the Notepad, sets owner field to: "Empty"
	 * and adds 10 pages;
	 */
	Notepad(){
		this.owner="Empty";
		this.pages=new Page[10];
	}
	/**
	 * Constructor for Notepad with only 1 field - owner;
	 * Has by default 10 pages;
	 */
	Notepad(String owner){
		this();
		setOwner(owner);
	}
	/**
	 *Constructor for Notepad with 2 fields - for owner
	 *and for the number of pages that are in it; 
	 */
	Notepad(String owner,int pages){
		this(owner);
		setPages(pages);
	}
	public void getOwner() {
		System.out.println(this.owner);
	}
	/**
	 * Enters the field of the Notepad for the owner;
	 * Must not be an empty field and have at least 3 characters
	 */
	public void setOwner(String owner) {
		if(owner!=null&& owner.length()>=3){
		this.owner = owner;
		} else{
			System.out.println("Please enter a valid name for the Owner");
			Scanner sc= new Scanner(System.in);
			owner=sc.next();
		}
	}
	/**
	 * Private setter for the number of pages to validate them while creating each
	 * Notepad, but preventing further changes to the total number after it's 
	 * creation
	 */
	private void setPages(int totalPages){
		if(totalPages>1){
			pages=new Page[totalPages];
		} else{
			System.out.println("Invalid page number. Please enter a valid page number");
			Scanner sc = new Scanner(System.in);
			totalPages = sc.nextInt();
			setPages(totalPages);
		}
	}
	
	/**
	 * Adds a title to a certain page, write the text and than the page you wish
	 * to enter it to
	 */
	@Override
	public void addTitle(String title, int pageNumber) {
		if (pageNumber < pages.length) {
			this.pages[pageNumber].setTitle(title);
		} else {
			System.out.println("Invalid page number. Please enter a valid page number");
			Scanner sc = new Scanner(System.in);
			pageNumber = sc.nextInt();
			addTitle(title, pageNumber);
		}
	}

	/**
	 * Adds a text to a certain page, write the page and than the text you wish
	 * to enter
	 */
	@Override
	public void addText(int pageNumber, String text) {
		if (pageNumber < pages.length) {
			this.pages[pageNumber].setText(text);
		} else {
			System.out.println("Invalid page number. Please enter a valid page number");
			Scanner sc = new Scanner(System.in);
			pageNumber = sc.nextInt();
			addText(pageNumber, text);
		}
	}

	/**
	 * Deletes the text field of a certain page
	 */
	@Override
	public void deleteText(int pageNumber) {
		if (pageNumber < pages.length) {
			this.pages[pageNumber].deleteText();
		} else {
			System.out.println("Invalid page number. Please enter a valid page number");
			Scanner sc = new Scanner(System.in);
			pageNumber = sc.nextInt();
			deleteText(pageNumber);
		}
	}
	
	/**
	 * Prints the text of a certain page
	 */
	@Override
	public void printPage(int pageNumber) {
		if(pageNumber<this.pages.length){
			this.pages[pageNumber].printPage();
		} else{
			System.out.println("Invalid page number. Please enter a valid page number");
			Scanner sc=new Scanner(System.in);
			pageNumber=sc.nextInt();
			printPage(pageNumber);
		}

	}
	public boolean searchWord(int pageNumber,String word){
		if(pageNumber<this.pages.length){
			this.pages[pageNumber].searchWord(word);
		} else{
			System.out.println("Invalid page number. Please enter a valid page number");
			Scanner sc=new Scanner(System.in);
			pageNumber=sc.nextInt();
			searchWord(pageNumber,word);
		}
		return false;
	}
}
