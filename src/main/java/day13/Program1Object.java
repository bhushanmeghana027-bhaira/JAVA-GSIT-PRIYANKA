package day13;

public class Program1Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.name ="bhairva";
		s1.age =5;
		s1.yearsOfExperience=5;
		s1.checkExpereince();
		System.out.println(s1.name+" "+s1.age+" "+s1.yearsOfExperience);
		
		Student s2 = new Student("bb",5,6);
//		System.out.println(s2.name+" "+s2.age+" "+s2.yearsOfExperience);
		Student s3 = new Student();
		s3.setName("megha");
		System.out.println(s3.getName());
	}

}
