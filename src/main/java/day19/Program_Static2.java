package day19;
class TestData{
	static int num;
	static {
		System.out.println("Static block called");
	}
}
public class Program_Static2 {
	static {
		System.out.println("main class loaded");
	}
	public static void main(String[] args) {
		TestData.num=10;
	}
}
