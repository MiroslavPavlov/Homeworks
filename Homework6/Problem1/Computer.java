package Problem1;

public class Computer {
	int year;
	double price;
	boolean isNotebook ;
	int hardDiskMemory;
	int freeMemory;
	String operatingSystem;

	public void changeOS(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public void useMemory(int memory) {
		if (this.freeMemory - memory > 0) {
			this.freeMemory -= memory;
		} else {
			System.out.println("Not enough free memory");
		}
	}

	public Computer() {
		this.year = 1988;
		hardDiskMemory = 1;
		freeMemory = hardDiskMemory;
	}

	public Computer(int year, double price, int hardDiskMemory) {
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = this.hardDiskMemory;
	}

	Computer(int year, double price, int hardDiskMemory, boolean noteBook) {
		this(year, price, hardDiskMemory);
		this.isNotebook = noteBook;
	}

	Computer(int year, double price, int hardDiskMemory, boolean noteBook, String operatingSystem) {
		this(year, price, hardDiskMemory, noteBook);
		this.operatingSystem = operatingSystem;
	}
}
