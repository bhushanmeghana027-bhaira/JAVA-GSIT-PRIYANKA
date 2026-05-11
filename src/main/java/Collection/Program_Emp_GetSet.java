package Collection;

import java.util.ArrayList;
import java.util.List;

class Employeei{
	private String name;
	private int empid;
	
	Employeei(){
		
	}
	Employeei(String name, int empid){
		this.name=name;
		this.empid=empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
}
public class Program_Emp_GetSet {
	public static void main(String[] args) {
		List<Employeei> list = new ArrayList<>();
		Employeei e1 = new Employeei("Rajat",101);
		list.add(e1);
		Employeei e2 = new Employeei();
		e2.setEmpid(102);
		e2.setName("Shreaya");
		list.add(e2);
		System.out.println(e1.getName());
		System.out.println(e1.getEmpid());
		for(Employeei e:list) {
			System.out.println(e.getName()+": "+e.getEmpid());
		}
		
	}
}
