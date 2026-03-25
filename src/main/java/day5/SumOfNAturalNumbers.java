package day5;

public class SumOfNAturalNumbers {
	public static void main(String[] args) {
		int n=1;
		int ans=0;
		while(n<=5) {
			 ans = (n*(n+1))/2;
			n++;
		}
		System.out.println(ans);
		
	}

}
