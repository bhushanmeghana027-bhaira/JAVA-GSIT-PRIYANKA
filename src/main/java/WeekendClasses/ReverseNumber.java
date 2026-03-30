package WeekendClasses;

public class ReverseNumber {
	public static void main(String[] args) {
		
		int num = 1234;
		int r , ans=0;
		for(;num>0;num=num/10) {
			r = num%10;
			ans = (ans*10)+r;
			
		}
		System.out.print(ans);
	}
}
