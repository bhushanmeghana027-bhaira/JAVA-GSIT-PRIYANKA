package NumberPractise;

public class SpyNumber {
	public static void main(String[] args) {
		int n=1124,r,ans=0,h=1;
		while(n>0) {
			r=n%10;
			h =h*r;
			ans = ans+r;
			n=n/10;
			
		}
		if(h==ans) {
			System.out.println("SPy");
		}
		else {
			System.out.println("no spy");
		}
	}
}
