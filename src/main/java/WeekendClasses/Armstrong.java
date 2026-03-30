package WeekendClasses;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153, ans =0, og =num;
//		while(n!=0) {
//			int digit = n%10;
//			 ans = (int) (ans + Math.pow(digit, 3));
//			n = n/10;
//		}
//		if( ans ==og) System.out.println("Arms");
//		else System.out.println("No arms");
		
		
		for(;num!=0;num=num/10) {
			int digit = num %10;
			ans = (int) (ans+Math.pow(digit, 3));
		}
		System.out.println(ans);

	}

}
