package Week5Assignment;
class Employee{
	int id;
	String name ;
	double basicSalary;
	public Employee(int id, String name, double basicSalary) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
	double calculateSalary() {
		double hra = 0.2*basicSalary;
		double bonus = 0.1*basicSalary;
		double totalSalary = hra+basicSalary+bonus;
		return totalSalary;
	}
	void display() {
		System.out.println(id+" :" + name +" :"+basicSalary+":"+calculateSalary());
	}
	
}
public class SalaryManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(4,"mjh",500);
		e1.display();

	}

}
