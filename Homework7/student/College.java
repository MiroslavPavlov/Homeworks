package student;

public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student pesho=new Student("Pesho","himiq",3,2,20,false,300);
		Student gosho=new Student("Gosho","himiq",4.5,1,19,false,350);
		Student sasho=new Student("Sasho","himiq",4,4,23,true,450);
		StudentGroup himiq=new StudentGroup("himiq");
		himiq.addStudent(pesho);
		himiq.addStudent(gosho);
		himiq.addStudent(sasho);
		gosho.upYear();
		sasho.recieveScholarship(4, 250);
		himiq.bestStudent();
		himiq.pritStudentGroup();
		himiq.emptyGroup();
	}

}
