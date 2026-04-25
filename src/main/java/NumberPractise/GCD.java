package NumberPractise;

public class GCD {
public static void main(String[] args) {
	int a=9,b=12,gcd=0;
	int n=Math.min(a, b);
	for(int i=1;i<=n;i++) {
		if(a%i==0 && b%i==0) {
			gcd=i;
			
		}
	}
	System.out.println(gcd);
}
}
