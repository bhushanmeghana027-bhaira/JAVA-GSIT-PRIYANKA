package NumberPractise;

public class StrongNumber {
	public static void main(String[] args) {
		int n = 145,r,ans=0;
		int og =n;
		int temp =og;
		while(n>0) {
			r = n%10;
			int m=1;
			for(int i=1;i<=r;i++) {
				m = m *i;
			}
			System.out.println("Number is :"+r+":"+"favtrorial:"+m);
			ans = ans +m;
			n =n/10;
		}
		System.out.println(ans);
	}
}
