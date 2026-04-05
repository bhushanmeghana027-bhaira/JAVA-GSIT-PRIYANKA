package day11;

public class MEthodOverridingPolu {
	static void add() {
		System.out.println(5);
	}
	static void add(int n1 , int n2) {
		System.out.println(n1+n2);
	}
	static void add(int n1) {
		System.out.println(n1);
	}
	static void add(int n1,float f1) {
		System.out.println(n1+f1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			add();
			add(5);
			add(5,23.0f);
			add(5,5);
			
	}

}
