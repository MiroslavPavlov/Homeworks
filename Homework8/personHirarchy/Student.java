package personHirarchy;

public class Student extends Person{
	double score;
	
	//inharits the constructor from Person and extends it for this class
public Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		this.score=score;
	}
	//returns the score of the student
	public double getScore() {
		return score;
	}
/**sets the score of the student, must be between 2 and 6
*/	
	public void setScore(double score) {
		if(score>=2&&score<=6){
		this.score = score;
		} else{
			System.out.println("Please enter a valid score");
			setScore(score);
		}
	}
	public void showStudentInfo(){
		this.showInfo();
	}
	@Override
	//overrides the showInfo method from the Person class but overrides it to
	//print out the grade of the student
	public void showInfo() {
		super.showInfo();
		System.out.println("The score is: "+this.score);
	}
	
}
