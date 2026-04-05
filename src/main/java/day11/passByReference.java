package day11;

class Test {
    int x = 10;
}
public class passByReference {
	static void change(Test t) {
        t.x = 50;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Test obj = new Test();
	        change(obj);
	        System.out.println(obj.x);
	}

}
