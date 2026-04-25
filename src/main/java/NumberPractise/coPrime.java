package NumberPractise;

public class coPrime {
	public static void main(String[] args) {
		int a=3,b=15;
		int gcd=1;
		for(int i=1;i<=a && i<=b;i++) {
			if(a%i==0 && b%i==0) {
				gcd=i;
			}
		}
		if(gcd==1) System.out.println("coprime");
		else System.out.println("not coprime");
	}

}
