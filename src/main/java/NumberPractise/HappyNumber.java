package NumberPractise;

public class HappyNumber {
	public static void main(String[] args) {
		int n=4,r,sum,temp=n;
		while(n!=1) {
			sum=0;
			while(n>0) {
				r = n%10;
				sum = (int) (sum + Math.pow(r, 2));
//				System.out.println(sum);
				n=n/10;
				
			}
			n=sum;
			}
		System.out.println("I am happy");
	
	}
}
