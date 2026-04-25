package NumberPractise;

public class PetersonNumber {
	public static void main(String[] args) {
		int n = 145,r,an=1,ans=0,og=n;
		while(n>0) {
		  r = n%10;
		  System.out.println(r);
		  for(int i=1;i<=r;i++) {
			  an = an*i;
		  }
		  System.out.println(r+":"+an);
		  ans = ans+an;
		  n = n/10;
		}
		System.out.println(ans);
		if(og==ans) {
			System.out.println("Peterson");
		}
		else {
			System.out.println("no peterson");
		}
	}
}
