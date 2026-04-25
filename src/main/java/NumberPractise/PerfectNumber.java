package NumberPractise;
class MethodFinder{
	public void methodPerfect(int n) {
		int ans =0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				ans = ans+i;
			}
		}
//		System.out.println("Answer:"+ans);
		if(ans == n ) {
			System.out.println("Perfect");
		}
		else {
			System.out.println("Npot perfect");
		}
	}
}
public class PerfectNumber {
	
	public static void main(String[] args) {
		int n=8128;
		MethodFinder m1 = new MethodFinder();
		m1.methodPerfect(n);
		
		
	}
}
