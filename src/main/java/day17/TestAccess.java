package day17;

public class TestAccess {
	private int privateNum;
	int defaultNum;
	protected int protectedNum;
	public int publicNum;
	
	void print() {
		System.out.println(this.defaultNum);
		System.out.println(this.publicNum);
	}
}

class TestAccess2 extends TestAccess{
	void print() {
//		System.out.println(this.privat);
//		 no matter what private cant be accesed via inheritance too
	}
}
