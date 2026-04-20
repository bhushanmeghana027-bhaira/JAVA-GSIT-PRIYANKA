package day18;
class UserEmployee{
	int empId;
	String empName;
	static String companyName;
}
public class Program_Static {
	public static void main(String[] args) {
	UserEmployee.companyName ="Wipro";
	
	UserEmployee user1 = new UserEmployee();
	user1.empId = 101;
	user1.empName = "Rajat";
	System.out.println(user1.empId+":"+UserEmployee.companyName);
	
	UserEmployee user2 = new UserEmployee();
	user2.empId = 102;
	user2.empName = "Ram";
	System.out.println(user2.empId+":"+UserEmployee.companyName);
	
	}
}
