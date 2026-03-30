package day7;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =20;
//		for(int i=1;i<=20;i++) {
//			if(20%i==0) {
//				if(i != 1) {
//					System.out.print(",");
//				}
//				System.out.print(i);
//			}
//		}
		for(int i=1;i<=20;i++) {
			if(i==20) {
				System.out.print(i);
			}
			else if(20%i == 0) {
				System.out.print(i+ ",");
			}
		}
		

	}

}
