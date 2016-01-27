package notebook;

public interface INotepad {
	
	void addTitle(String title, int pageNumber);
	public void addText(int pageNumber, String text);
	public void deleteText(int pageNumber);
	public void printPage(int pageNumber);
	
}
