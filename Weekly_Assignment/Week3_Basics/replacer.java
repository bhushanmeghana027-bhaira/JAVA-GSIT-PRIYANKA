package Week3_Basics;

public class replacer {
	public static void main(String[] args) {
		int n=57243, r, i=0, ans=0, m;
		while(n!=0) {
			
			r = n%10;

			i++;
//			System.out.println(r+ " "+i);
			if(i%2!=0 && r<=4) {
				m = r*2;
			}
			else if(i%2!=0 && r>=4) {
				m = r;
			}
			else {
				m = 1;
			}
			ans  = ans*10 +m;
				
			n = n/10;
		}
		System.out.println(ans);
	}
}
