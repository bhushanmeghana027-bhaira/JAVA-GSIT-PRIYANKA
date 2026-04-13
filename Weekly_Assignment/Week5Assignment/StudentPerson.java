package Week5Assignment;
class Person{
	int age;
	String name;
	
	Person(String name, int age ){
		this.name= name;
		this.age = age;
	}
}
class Student extends Person{
	int marks;
	Student(String name, int age , int marks){
		super(name, age);
		this.marks = marks ;
	}
	
	void display() {
		System.out.println(this.name+" "+this.age+" "+this.marks);
	}
}
public class StudentPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student p = new Student("makm",5,563);
		p.display();

	}

}
