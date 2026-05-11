package Collection;

import java.util.ArrayList;
import java.util.List;

class Employee{
	String name;
	int empid;
	
	Employee(String name, int empid){
		this.name=name;
		this.empid=empid;
	}
}
public class Program_EmployeeArrayList {
	public static void main(String[] args) {
		Employee e1 = new Employee("Rajat",101);
		Employee e2 = new Employee("Rahul",101);
		Employee e3 = new Employee("Shreaya",103);
		List<Employee> list = new ArrayList<>();
		list.add(e3);
		list.add(e2);
		list.add(e1);
		for(Employee r:list) {
			System.out.println(r.empid+" : "+r.name);
		}
	}
}
