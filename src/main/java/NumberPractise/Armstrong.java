package NumberPractise;

public class Armstrong {
	public static void main(String[] args) {
		int n=370,r;
		int og = n;
		int temp = og;
		int sum =0;
		while(n>0) {
			r = n%10;
			sum = (int) (sum + Math.pow(r, 3));
			n = n/10;
			
		}
		System.out.println(sum);
		if(sum==temp) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not armstrong");
		}
	}

}
