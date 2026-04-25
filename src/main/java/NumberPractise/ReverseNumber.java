package NumberPractise;

public class ReverseNumber {
	public static void main(String[] args) {
		int n=5642,r,ans=0;
		while(n>0) {
			r = n%10;
			ans = (ans*10)+r;
			n = n/10;
		}
		System.out.println(ans);
	}
}
