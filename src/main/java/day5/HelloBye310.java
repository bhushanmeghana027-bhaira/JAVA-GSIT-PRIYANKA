package day5;

public class HelloBye310 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		while(n<=15) {
			int ans = 2*n;
			n++;
//			System.out.println(ans);
			if(ans%10 == 0 ) {
				System.out.println(ans +":" +"Bye");
			}
			else if(ans%3==0 && ans%10 != 0) {
				System.out.println(ans + ":"+"hello");
			}
			else {
				System.out.println(ans);
			}
		}

	}

}
