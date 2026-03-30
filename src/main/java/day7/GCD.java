package day7;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gcd = 1;
		int a = 9 , b =12;
		int num = Math.min(a, b);
		System.out.println(num);
		for(int i=1;i<=num;i++) {
			if(a%i == 0 && b%i==0) {
				gcd =i;
			}
		}
		System.out.println("greatest commmon divisor is :"+gcd);

	}

}
