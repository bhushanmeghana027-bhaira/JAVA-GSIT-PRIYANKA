package April6;

public class EmpDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee("rahul",102,"genral");
		System.out.println(e1.getName());
		System.out.println(e1.getId());
		System.out.println(e1.getDepartment());
		
		Employee e2 = new Employee("Priya",101,"HR");
		System.out.println(e2.getName()+" "+ e2.getId()+" "+e2.getDepartment());
		
		Employee e3 = new Employee("unkown",0,"Not assignd");
		System.out.println(e3.getName()+" "+e3.getId()+" "+e3.getDepartment());
		e3.setName("Anjali");
		e3.setId(103);
		e3.setDepartment("finance");
		System.out.println("After updation:-"+" "+e3.getName()+" "+e3.getId()+" "+e3.getDepartment());
		
		
		
		
		
		
	}

}
