package day15;
class StudentH{
	String bloodGroup;
}
class StudentUser extends StudentH{
	int enrollNo;
	String name;
	int age;
}
class EngineeringStudent extends StudentUser{
	String course = "Btech";
	void printData() {
		System.out.println(this.enrollNo+":"+this.name+":"+this.course);
		if(super.age>25) {
			System.out.println("LAteADmission");
		}
	}
}

public class Program_Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EngineeringStudent engineeringStudent = new EngineeringStudent();
		engineeringStudent.enrollNo=10;
		engineeringStudent.name="rajat";
		engineeringStudent.age=26;
		engineeringStudent.printData();
		}

}
