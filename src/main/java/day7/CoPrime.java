package day7;

public class CoPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=9,n2=28, gcd =1;
		int num = Math.min(n1, n2);
		for(int i=1;i<=num;i++) {
			if(n1%i==0 && n2 %i ==0) {
				gcd =i;
			}
		}
		if(gcd==1) {
			System.out.println("co prime");
		}
		else {
			System.out.println("Not co prime");
		}

	}

}
