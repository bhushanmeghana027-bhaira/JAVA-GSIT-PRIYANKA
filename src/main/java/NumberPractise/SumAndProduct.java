package NumberPractise;

public class SumAndProduct {
	public static void main(String[] args) {
		int n=121,r,ans=0,anp=1;
		while(n>0) {
			r=n%10;
			ans= ans+r;
			anp=anp*r;
			n = n/10;
		}
		System.out.println(ans+":"+anp);
	}
}
