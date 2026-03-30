package day7;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5,ans =1;
		if(n==1 || n==0) {
			System.out.println("Factorial of" +n+":"+ 1);
		}
		else {
			for(int i=1;i<=n;i++) {
				ans = ans *i;
			}
			System.out.println(ans);
		}

	}

}
