package May6;

import java.util.HashMap;
import java.util.Map;

class Student{
	int id;
	String name;
	
	Student(int id,String name){
		this.id=id;
		this.name = name;
	}
}
public class MaP_StudentProgram {
	public static void main(String[] args) {
		Map<Student,Integer> hm = new HashMap<Student,Integer>();
		Student s1 = new Student(101, "Priya ");
		hm.put(s1, 85);
		Student s2 = new Student(102, "Aman ");
		hm.put(s2, 90);
		Student s3 = new Student(103,"Rahul");
		hm.put(s3, 78);
		
		for(Map.Entry<Student,Integer> entry:hm.entrySet()) {
			System.out.println(entry.getKey().id+" "+entry.getKey().name+"->"+entry.getValue());
		}
		
	}
}
