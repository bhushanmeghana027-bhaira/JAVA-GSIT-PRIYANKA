package day17;
class O{
	
}
class Exam1{
	int examCode;
	String examName;
	Exam1(int examCode,String examName){
		this.examCode=examCode;
		this.examName=examName;
		System.out.println("PArent construnctor is called");
	}
}
class BtechExam extends Exam1{
	String branchName;
	void print()
	{
		System.out.println(super.examCode+":"+super.examName+":"+this.branchName);
	}
	BtechExam(int examCode, String examName,String branchName){
		super(examCode,examName);
		this.branchName= branchName;
		System.out.println("Child construnctor is called");
	}
}
public class supers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BtechExam be = new BtechExam(101,"programming c ","cse");
		be.print();
	}

}
