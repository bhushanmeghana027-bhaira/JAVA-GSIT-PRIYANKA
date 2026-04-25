package NumberPractise;

public class CountDigit {
	public static void main(String[] args) {
		int n=5697,r,c=0;
		while(n>0) {
			r=n%10;
			c++;
			n=n/10;
			
		}
		System.out.println(c);
	}
}
