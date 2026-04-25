package NumberPractise;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int ans=1;
		
		if(n==0 || n==1) {
			System.out.println("factorial of"+n+"is"+1);
		}
		else if(n<0){
			System.out.println("invalid input");
		}
		else {
			for(int i=1;i<=n;i++) {
				ans = ans*i;
			}
			System.out.println(ans);
		}
		
	}
}
