package day15;
class EmployeeUser{
	int empId;
	String empName;
	int empAge;
	final String companyName = "TCS";
	
	void printData() {
		System.out.println(empId+":"+this.empName);
	}
	
	EmployeeUser(int empId,String empName,int empAge){
		this.empId=empId;
		this.empName = empName;
		this.empAge =empAge;
	}
	
}
public class Program_this {
	public static void main(String[] args) {
		EmployeeUser emp = new EmployeeUser(101,"rajat",35);
		emp.printData();
//		emp.companyName="Infosys";
		System.out.println(emp.companyName);
	}
}
