package April10;
class Company{
	final String companyName = "TCS";
	String location;
	Company(String location){
		this.location = location;
	}
}
class Employee extends Company{
	int id;
	String name;
	
	Employee(String location,int id,String name) {
		super(location);
		this.id = id;
		this.name = name;
		
	}
	void displayDetais() {
	System.out.println(this.location+":"+this.id+":"+this.name);
	}
	
}

public class oopsexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("banglore",5,"maj");
		e.displayDetais();
		System.out.println(	e.companyName);

	}

}
