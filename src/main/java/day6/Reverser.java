package day6;

public class Reverser {
	public static void main(String[] args) {
		int num = 5431;
		int ans =0 , rem;
		
//		while(num>0) {
//			rem = num %10;
//			ans = (ans*10)+rem;
//			num = num/10;
//			
//		}
//		System.out.println(ans);
		
//		using do while
//		do {
//			rem = num %10;
//			ans = (ans*10)+rem;
//			num = num/10;
//		}
//		while(num>0);
//		System.out.println(ans);
		
//		using for
		for(;num>0;num=num/10) {
			rem = num%10;
			ans =(ans*10)+rem;
		}
		System.out.println(ans);
	}
}



