package NumberPractise;

public class Pallindrome {
	public static void main(String[] args) {
		int n=121,og=n,temp,r,ans=0;
		while(n>0) {
			r = n%10;
			ans = (ans*10)+r;
			n=n/10;
		}
		if(ans==og) {
			System.out.println("Pallindrome");
		}
		else {
			System.out.println("nah pallindrome");
		}
	}
}
