package personHirarchy;

public class Person {
	private String name;
	private int age;
	private boolean isMale;

	public Person(String name, int age, boolean isMale) {
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}

	public void showInfo() {
		System.out.println("The name is: " + this.name);
		System.out.println("The age is: " + this.age);
		System.out.println("The gender is: " + (this.isMale ? "male" : "female"));
	}

	// returns the name of the person
	public String getName() {
		return name;
	}

	// sets the name of the person
	public void setName(String name) {
		if (name != null) {
			this.name = name;
		} else {
			System.out.println("Please enter a valid name");
			setName(name);
		}
	}

	// returns the age of the person
	public int getAge() {
		return age;
	}

	// sets the age of the person
	public void setAge(int age) {
		if (age >= 1) {
			this.age = age;
		} else {
			System.out.println("Please enter a valid age");
			setAge(age);
		}
	}

	// returns if the person is male
	public boolean isMale() {
		return isMale;
	}

	// sets true if the person is male, or false if it is female
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

}
