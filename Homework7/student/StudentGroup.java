package student;

class StudentGroup {
	private String groupSubject;
	private Student[] students;
	private int freePlaces;

	public StudentGroup() {
		this.freePlaces = 5;
		this.students = new Student[5];
	}

	public StudentGroup(String subject) {
		this();
		this.groupSubject = subject;
	}

	public void addStudent(Student s) {
		if (this.freePlaces > 0) {
			this.students[students.length - (this.freePlaces - 1)] = s;
			freePlaces--;
		} else {
			System.out.println("There are no more free places in the group");
		}
	}

	public void emptyGroup() {
		for (int i = 0; i < students.length; i++) {
			this.students[i] = null;
		}
		this.freePlaces = 5;
	}

	public String bestStudent() {
		double max = students[0].getGrade();
		String bestStudent = students[0].getName();
		for (int i = 0; i < students.length; i++) {
			if (max < students[i].getGrade()) {
				bestStudent = students[i].getName();
			}
		}
		return bestStudent;
	}

	public void pritStudentGroup() {
		for (int i = 0; i < ((students.length - this.freePlaces) + 1); i++) {
			System.out.println("The name of the student is: " + this.students[i].getName() + " with grade: "
					+ this.students[i].getGrade() + " that studies: " + this.students[i].getSubject() + "  and is in "
					+ this.students[i].getYearInCollege() + " year in college");
		}
	}
}
