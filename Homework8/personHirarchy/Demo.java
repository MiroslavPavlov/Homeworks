package personHirarchy;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] arr = new Person[10];
		arr[0] = new Person("Ivan", 30, true);
		arr[1] = new Person("Georgi", 26, true);
		arr[2] = new Person("Silviq", 25, false);
		arr[3] = new Student("Angel", 20, true, 4);
		arr[4] = new Student("Nikolai", 22, true, 5);
		arr[5] = new Student("Gergana", 21, false, 6);
		arr[6] = new Student("Iva", 20, false, 5.5);
		arr[7] = new Employee("Dimityr", 29, true, 30);
		arr[8] = new Employee("Petyr", 34, true, 24);
		arr[9] = new Employee("Qna", 25, false, 32);

		// prints the information about everyone in the array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Student) {
				Student temp = (Student) arr[i];
				temp.showStudentInfo();
			} else {
				if (arr[i] instanceof Employee) {
					Employee temp = (Employee) arr[i];
					temp.showEmployeeInfo();
				} else {
					arr[i].showInfo();
				}
			}
		}
		// prints out how much extra salary will each employee inside the array
		// will get
		// for 2 extra hours of work
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Employee) {
				Employee temp = (Employee) arr[i];
				temp.showEmployeeInfo();
				System.out.println(temp.getName() + " will get " + temp.calculateOvertime(2)
						+ " extra salary for 2 hours of overtime");
			}
		}
	}

}
