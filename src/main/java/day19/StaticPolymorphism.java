package day19;
class UserData1{
	int id;
	static void hello() {
		System.out.println("hello");
	}
}
class UserData2 extends UserData1{
	String name;
	static void hello() {
		System.out.println("Bye");
	}
}
public class StaticPolymorphism {
	UserData1 obj = new UserData2();
	
}
