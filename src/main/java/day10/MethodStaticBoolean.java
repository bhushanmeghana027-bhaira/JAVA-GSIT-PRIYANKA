package day10;

public class MethodStaticBoolean {
	static boolean checkEven(int n) {
		if(n%2==0)
			return true;
		else
			return false;
	}
	static void printEven(int n) {
		if(n%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
	}
	static float summer(int n1, float n2) {
		float sum =n1+n2;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result1 =  checkEven(5);
		System.out.println(result1);
		System.out.println(checkEven(8));
		printEven(7);
		System.out.println(summer(10,0.5F));

	}

}
