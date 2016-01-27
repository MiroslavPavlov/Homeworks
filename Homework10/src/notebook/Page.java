package notebook;

import java.util.Scanner;

public class Page {

	private String title;
	private String text;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title != null) {
			this.title = title;
		} else {
			System.out.println("Please enter a title");
			Scanner sc = new Scanner(System.in);
			title = sc.nextLine();
			setTitle(title);
		}
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		if (text != null) {
			this.text = text;
		} else {
			System.out.println("Please enter text");
			Scanner sc = new Scanner(System.in);
			text = sc.next();
			setText(text);
		}
	}

	public void deleteText() {
		this.text = null;
	}

	public void printPage() {
		System.out.println(this.title);
		System.out.println(this.text);
	}

	public boolean searchWord(String word) {
		String words[] = this.text.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(word)) {
				return true;
			}
		}
		return false;
	}

	public boolean searchDigits() {
		String words[] = this.text.split(" ");
		for (int i = 0; i <= words.length; i++) {
			switch (words[i].charAt(0)) {
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				return true;
			default:
				break;
			} 

		} return false;
	}
}
