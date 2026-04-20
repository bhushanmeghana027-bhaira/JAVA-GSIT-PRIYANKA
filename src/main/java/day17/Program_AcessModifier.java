package day17;
class O{
	O(){
		System.out.println("default construnctor");
	}
	O(int x){
		System.out.println("thisi is parameterized construnctor");
	}
}
public class Program_AcessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestAccess tq = new TestAccess();
//		tq.priv
//		there is no privateNum
		System.out.println(tq.defaultNum);
		System.out.println(tq.publicNum);
		System.out.println(tq.protectedNum);
	}

}
