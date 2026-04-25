package NumberPractise;

public class DisariumNumber {
	public static void main(String[] args) {
		int n=135,r,sum=0,og=n;
		String h= n+"";
		int h1 = h.length()+1;
		int pos =h1;
		while(n>0) {
			r =n%10;
			pos--;
//			System.out.println(r + ":"+pos);
			sum = (int)(sum +Math.pow(r, pos));
			n = n/10;
		}
		System.out.println(sum);
		if(sum==og) {
			System.out.println("disarium");
		}
		else {
			System.out.println("No disarium");
		}
	}
}
