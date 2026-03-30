package day7;

public class LCM {
	public static void main(String[] args) {
/*
 * lcm = (n1*n2)/gcd(n1,n2)
 */
		int a = 10, b=20;
		int lcm =1;
		int num = Math.max(a, b);
		System.out.println(num);
		
		for(int i=1;i<=num;i++) {
			if(i%a==0 && i%b==0) {
				lcm =i;
				break;
			}
		}
		System.out.println("LCM is:"+lcm);
	}

}
