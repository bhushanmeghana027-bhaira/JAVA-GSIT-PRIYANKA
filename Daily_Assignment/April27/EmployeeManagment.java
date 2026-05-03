package April27;

import java.util.ArrayList;
import java.util.List;

class Employee{
	int id;
	String name;
	double salary;
	String department;
	
	Employee(int id,String name,double salary,String department){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.department=department;
	}
	int salaryDetails(int salary) {
		return salary;
	}
	void displayDetails() {
		System.out.println("Employee id is:"+id);
		System.out.println("Employee name is:"+name);
		System.out.println("Employee salary is:"+salary);
		System.out.println("Employee department is:"+department);
		System.out.println("********");
	}
}
public class EmployeeManagment {
	public static void main(String[] args) {
		List<Employee> li = new ArrayList<>();
		Employee e1 = new Employee(101, "Arjun Kumar", 55000.50, "IT");
		Employee e2 = new Employee(102, "Sneha Reddy", 62000.00, "HR");
		Employee e3 = new Employee(103, "Rahul Shetty", 48000.75, "Finance");
		Employee e4 = new Employee(104, "Priya Sharma", 75000.00, "IT");
		Employee e5 = new Employee(105, "Vikram Joshi", 50000.25, "Marketing");
		Employee e6 = new Employee(106, "Ananya Rao", 68000.80, "Operations");
		
		li.add(e1);
		li.add(e2);
		li.add(e3);
		li.add(e4);
		li.add(e5);
		li.add(e6);
		
//		for(int i=1;i<=6;i++) {
//			li.get(i).displayDetails();
//		}
//		greater than 50,000
//		int count =0;
//		for(int i=1;i<li.size();i++) {
//			count++;
//			if(li.get(i).salary >50000) {
//				li.get(i).displayDetails();
//			}
//			
//		}
//		System.out.println("Total employee having more than 50000:"+count);
//		sort salaray
		System.out.println("Print fromherere");
		for(int i =0;i<li.size()-1;i++) {
			for(int j=0;j<li.size()-1;j++) {
				if(li.get(j).salary>li.get(j+1).salary) {
					Employee temp = li.get(j);
					li.set(j,li.get(j+1));
					li.set(j+1,temp);
				}
			}
			
		}
		System.out.println("Sorted Employees by salary:");

		for (Employee e : li) {
		    e.displayDetails();
		}
		
////		department it  matching
//		System.out.println("IT department ");
//		for(int r=1;r<li.size();r++) {
//			if(li.get(r).department.equals("IT")) {
//				li.get(r).displayDetails();
//			}
//		}
		
//		highest salry 
//		System.out.println("highest salary");
//		Employee max_salary_details=li.getFirst();
//		double max_salary=li.getFirst().salary;
//		for(int j=1;j<li.size();j++) {
//			if(max_salary<li.get(j).salary) {
//				max_salary=li.get(j).salary;
//				max_salary_details = li.get(j);
//			}
//			
//			
//		}
//		System.out.println("Highest salry is :"+max_salary+":"+max_salary_details.name);
		
//		remove 103
//		System.out.println("Remove 103 employee");
//		for(int j=1;j<li.size();j++) {
//			if(li.get(j).id==103) {
//				
//				li.remove(j);
//			}
//		}
//		increase salary by 10%
//		double og_salary=0.0;
//		double update_salary=0.0 ;
//		for(int j=1;j<li.size();j++) {
//			 og_salary = li.get(j).salary;
//			 update_salary = og_salary+(og_salary * 0.10);
//			 System.out.println("Orginal salry:" + og_salary +"after 10%"+"updated salry:"+update_salary);
//		}
//		
		
		
				
		
	}
}
