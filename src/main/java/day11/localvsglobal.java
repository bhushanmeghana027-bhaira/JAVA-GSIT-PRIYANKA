package day11;

public class localvsglobal {
	static int globalData = -10;
	static void add() {
		int newdata =5;
		System.out.println(5+newdata);
	}
	static void add(int n1 , int n2) {
		System.out.println(n1+n2+globalData);
	}
	static void add(int n1) {
//		System.out.println(n1+newData);
//		not allowed bcz newData is local 
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
