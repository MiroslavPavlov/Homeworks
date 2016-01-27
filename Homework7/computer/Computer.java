package computer;

class Computer {
	private int year;
	private double price;
	private boolean isNotebook;
	private double hardDiskMemory;
	private double freeMemory;
	private String operatingSystem;

	// sets the price of the Computer
	public void setPrice(double price) {
		this.price = price;
	}

	// returns the price of the Cocmputer
	public double getPrice() {
		return price;
	}

	// gets the year of manufacturing
	public int getYear() {
		return year;
	}

	// sets the year of manufacturing
	public void setYear(int year) {
		this.year = year;
	}

	// returns if the computer is a notebook
	public boolean isNotebook() {
		return isNotebook;
	}

	// sets the field if the computer is a notebook
	public void setNotebook(boolean isNotebook) {
		this.isNotebook = isNotebook;
	}

	// returns the amount of total hard disk memory
	public double getHardDiskMemory() {
		return hardDiskMemory;
	}

	// sets the total amount of memory
	public void setHardDiskMemory(double hardDiskMemory) {
		this.hardDiskMemory = hardDiskMemory;
	}

	// returns the value of free memory
	public double getFreeMemory() {
		return freeMemory;
	}

	// returns the name of the operating system
	public String getOperatingSystem() {
		return operatingSystem;
	}

	// sets the operating system
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	// uses memory by substracting it from the free memory
	public void useMemory(int memory) {
		if (this.freeMemory - memory > 0) {
			this.freeMemory -= memory;
		} else {
			System.out.println("Not enough free memory");
		}
	}

	// default constructor that initiates with set values such as Not a notebook
	// and
	// a default OS - Windows Xp
	public Computer() {
		this.isNotebook = false;
		this.operatingSystem = "Win XP";
	}

	/**
	 * Takes as parameters the year of manufacturing, the price of the computer,
	 * boolean value if it is a notebook, the total amount of hard disk memory,
	 * the free memory and the name of the operating system
	 */
	public Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory,
			String operatingSystem) {

		this.year = year;
		this.price = price;
		this.isNotebook = isNotebook;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operatingSystem = operatingSystem;
	}

	/**
	 * Compares the prices of the computer to another one and returns the
	 * following output: -1 if the price of the computer is higher than the one
	 * that is compared to 1 if the computer is cheaper than the one that is
	 * compared to 0 if they have the same price
	 * 
	 * @param c
	 * @return
	 */
	public int comparePrice(Computer c) {
		if (this.price > c.price) {
			return -1;
		} else {
			if (this.price < c.price) {
				return 1;
			} else {
				return 0;
			}
		}
	}
}
