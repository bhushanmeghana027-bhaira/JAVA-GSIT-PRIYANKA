package Collection_Set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student_h{
	String name;
	int roll;
	
	Student_h(String name,int roll){
		this.name=name;
		this.roll=roll;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, roll);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student_h other = (Student_h) obj;
		return Objects.equals(name, other.name) && roll == other.roll;
	}
	
}
public class Program2_Set {
	public static void main(String[] args) {
		Set<Student_h> s = new HashSet<Student_h>();
		Student_h obj1= new Student_h("Rahul",1);
		Student_h obj2= new Student_h("Rahul",1);
		
		s.add(obj1);
		s.add(obj2);
		for(Student_h data:s) {
			System.out.println(data.name+" "+data.roll);
		}
	}
}
