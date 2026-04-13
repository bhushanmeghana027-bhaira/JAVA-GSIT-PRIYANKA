package day16;
// the whole point of writing this code is to tell u cant inherit final class
final class ExamA{
	int examCodeA=101;
	
}
class ExamB extends ExamA{
	
}
class TestP{
	final void hello() {
		System.out.println("Hello");
	}
}
class TestQ extends TestP{
	void hello() {
		System.out.println("Bye");
	}
}
public class FinalTopic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExamA exam = new ExamA();
		
		
	}

}
