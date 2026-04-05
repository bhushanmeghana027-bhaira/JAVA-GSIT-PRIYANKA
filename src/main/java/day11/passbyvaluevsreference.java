package day11;

public class passbyvaluevsreference {
	
	static void change(int a) {
        a = 50;
        System.out.println("Inside method :" +a+5);
	}
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		change(x);
		System.out.println(x);
	}
	
}

