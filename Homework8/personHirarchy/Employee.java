package personHirarchy;

public class Employee extends Person{
	private double daySalary;

	//returns the daily salary of the employee
	public double getDaySalary() {
		return daySalary;
	}
//sets the daily salary of the person
	public void setDaySalary(double daySalary) {
		if(daySalary>0){
		this.daySalary = daySalary;
		} else{
			System.out.println("Please enter a valid daily salary");
			setDaySalary(daySalary);
		}
	}
	public Employee(String name, int age, boolean isMale,double daySalary){
		super(name,age,isMale);
		this.daySalary=daySalary;
	}
	public void showEmployeeInfo(){
		this.showInfo();
	}
	
	@Override
	public void showInfo(){
		super.showInfo();
		System.out.println("The dayly salary is: "+this.daySalary);
	}
	public double calculateOvertime(double hours){
		if(this.getAge()>=18){
			return (double)(((this.daySalary/8)*1.5)*hours);
		} else{
			return 0;
		}
	}
}
