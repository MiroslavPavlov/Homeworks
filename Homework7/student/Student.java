package student;

public class Student {
	private String name;
	private String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	private boolean isDegree;
	private double money;

	// returns the name of the student
	public String getName() {
		return name;
	}

	// sets the name of the student
	public void setName(String name) {
		if (name != null) {
			this.name = name;
		} else {
			System.out.println("Please enter a valid name");
			setName(name);
		}

	}

	// returns the subject that the student studies
	public String getSubject() {
		return subject;
	}

	// sets the subject that the student studies
	public void setSubject(String subject) {
		if (subject != null) {
			this.subject = subject;
		} else {
			System.out.println("Please enter a valid subject");
			setSubject(subject);
		}
	}

	// returns the grade of the student
	public double getGrade() {
		return grade;
	}

	// sets the grade of the student
	public void setGrade(double grade) {
		if (grade > 0) {
			this.grade = grade;
		} else {
			System.out.println("Please enter a valid grade");
			setGrade(grade);
		}
	}

	// returns at which year in college is the student
	public int getYearInCollege() {
		return yearInCollege;
	}

	// sets at which year the student is in college
	public void setYearInCollege(int yearInCollege) {
		if (yearInCollege >= 1) {
			this.yearInCollege = yearInCollege;
		} else {
			System.out.println("Please enter a valid year in college");
			setYearInCollege(yearInCollege);
		}
	}

	// returns the age of the student
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("Please enter a valid age");
			setAge(age);
		}
	}

	// returns if the student has finished his education
	public boolean isDegree() {
		return isDegree;
	}

	// sets if the student has finished his education
	public void setDegree(boolean isDegree) {
		this.isDegree = isDegree;
	}

	// returns the amount of money the student has
	public double getMoney() {
		return money;
	}

	// sets the money of the student
	public void setMoney(double money) {
		if (money >= 0) {
			this.money = money;
		} else {
			System.out.println("Please enter a valid amount of money");
			setMoney(money);
		}
	}
	public Student(){
		this.grade=4;
		this.yearInCollege=1;
		this.isDegree=false;
		this.money=0;
	}

	public Student(String name, String subject, double grade, int yearInCollege, int age, boolean isDegree,
			double money) {
		this();
		this.name = name;
		this.subject = subject;
		this.grade = grade;
		this.yearInCollege = yearInCollege;
		this.age = age;
		this.isDegree = isDegree;
		this.money = money;
	}
	public void upYear(){
		this.yearInCollege+=1;
	}
	public double recieveScholarship(double min, double amount){
		if(this.grade>=min||this.age<30){
			this.money+=amount;
			System.out.println("The student has recieved scholarship and currently has this amount of money:");
			return this.money;
		} else{
			System.out.println("The student has not recieved scholarship and currently has this amount of money:");
		} return this.money;
	}
	
}
