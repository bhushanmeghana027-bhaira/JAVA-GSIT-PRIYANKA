public class Day5_WhileCondition {
	public static void main(String[] args) {
		int n=1,ans;
		while(n<=50) {
			int r =n;
			if(r%2==0 && r%5==0) {
				ans=(int) Math.pow(r, 2);
				System.out.println(ans);
			}
			else if(r%2==0 && r%5 != 0) {
				ans=(int) Math.pow(r, 3);
				System.out.println(ans);
			}
			else if(r%5==0 && r%2 != 0) {
				ans = r*5;
				System.out.println(ans);
			}
			else {
				System.out.println(r);
			}
			n++;
			
		}
	}

}
