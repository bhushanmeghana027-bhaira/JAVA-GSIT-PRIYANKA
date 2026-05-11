package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentK implements Comparable<StudentK>{
	int rollNo;
	String name;
	public StudentK(int rollNo,String name) {
		super();
		this.rollNo=rollNo;
		this.name=name;
	}
}
//	public int compareTo(StudentK ob) {
////		sorts in ascending
////		return this.rollNo-ob.rollNo;
////		sorts in descening
//		return ob.rollNo-this.rollNo;
//		
//	}
//}
	
	class StudentKComparator implements Comparator<StudentK>
	{
		public int compare(StudentK ob1,StudentK ob2) {
			return ob1.rollNo-ob2.rollNo;
		}


	}
public class StudentK_Comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentK obj1 = new StudentK(3,"Astha");
		StudentK obj2 = new StudentK(2,"Zeenat");
		StudentK obj3 = new StudentK(1,"Mehak");
		ArrayList<StudentK> list = new ArrayList<StudentK>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		Collections.sort(list);
		for(StudentK obj:list) {
			System.out.println(obj.rollNo+":"+obj.name);
		}
		

	}

}
