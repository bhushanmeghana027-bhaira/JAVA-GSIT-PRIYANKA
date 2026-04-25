package NumberPractise;

public class NeonNumber {
	public static void main(String[] args) {
		int n=5,pow=2,ans=1,r,ans1=0;
		for(int i=1;i<=pow;i++) {
			ans = ans * n;
		}
		while(ans>0) {
			r = ans%10;
			ans1=ans1+r;
			ans =ans/10;
		}
		if(ans1==n) {
			System.out.println("Neon");
		}
		else {
			System.out.println("No neon");
		}
	}
}
