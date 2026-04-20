package day19;
class TestData{
	static int num1;
	int num2;
	static {
		System.out.println("sattic block called");
	}
	void hello() {
		System.out.println("hello"+num1+num2);
		bye();
	}
//	
	static void bye() {
		System.out.println("bye"+num1+num2);
	}
//	from static method u cant acess normal variable that is num 2
	
}
public class Program_static_2 {
	public static void main(String[] args) {
		
	}
}
