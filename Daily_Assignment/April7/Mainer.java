package April7;
class Employee{
	String name;
	double Salary;
	
	Employee(String name, double Salary){
		this.name = name ;
		this.Salary = Salary;
	}
	void displayDetails() {
		System.out.println(this.name+":"+this.Salary);
	}
}
class Manager extends Employee{
	double bonus;
	
	Manager(String name , double Salary, double bonus){
		super(name,Salary);
		this.bonus = bonus ;
		
	}
	
	void displayDetails() {
		super.displayDetails();
		System.out.println(this.name+":"+this.Salary+":"+this.bonus);
	}
}

class Developer extends Employee{
	String prpgrammingLanguage;
	
	Developer(String name , double Salary, String prpgrammingLanguage){
		super(name,Salary);
		this.prpgrammingLanguage = prpgrammingLanguage ;
		
	}
	void displayDetails() {
		System.out.println(this.name+":"+this.Salary+":"+this.prpgrammingLanguage);
	}
}

class SeniorDeveloper extends Developer{
	int experience;
	
	SeniorDeveloper(String name , double Salary, String prpgrammingLanguage, int experience){
		super( name ,  Salary,  prpgrammingLanguage);
		this.experience = experience ;
		
	}
	void displayDetails() {
		System.out.println(this.name+":"+this.Salary+":"+this.prpgrammingLanguage+":"+this.experience);
	}
}

public class Mainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager("Rajat",50000,26000);
		m.displayDetails();
		Developer d = new Developer("kisj",56985,"java");
		d.displayDetails();
		SeniorDeveloper dsd = new SeniorDeveloper("alk",56300,"java",5);
		dsd.displayDetails();
	}

}
