package day16;



class StudentUser
{
    int enrollNo;
    String name;
    int age;

    StudentUser()
    {
        System.out.println("PARENT CONSTRUCTOR CALLED");
    }

    StudentUser(int enrollNo)
    {
        System.out.println("PARAMETERIZED PARENT CONSTRUCTOR CALLED");
        this.enrollNo = enrollNo;
    }
}

class EngineeringStudent extends StudentUser
{
    String course = "Btech";

    void printData()
    {
        System.out.print(this.enrollNo + ":" + this.name + ":" + this.course);
        if(super.age > 25)
            System.out.print(":Late Admission");
    }

    EngineeringStudent(){
    	super(-1);
    	System.out.println("child construnctor called");
    }
}
public class Supeeer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EngineeringStudent engineeringStudent = new EngineeringStudent();
	}
}
