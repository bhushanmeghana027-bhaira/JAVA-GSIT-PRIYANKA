package day6;

public class PallindromeFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 565;
		int og = num;
		int rem ,ans =0 ;
		for(;num>0;num=num/10) {
			rem = num %10;
			ans = (ans*10)+rem;
			
		}
		System.out.println(ans);
		if(ans==og) {
			System.out.println("Pallindrome");
		}
		else {
			System.out.println("Not pallindome");
		}
		
	}

}
