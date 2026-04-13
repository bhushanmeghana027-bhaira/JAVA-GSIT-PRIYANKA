package Patterns;

public class TUF11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				int start =1;
			for(int j=1;j<=i;j++) {
				System.out.print(start+" ");
				start = 1-start;
			}
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			}
			else {
				int start =0;
				for(int j=1;j<=i;j++) {
					
					System.out.print(start+" ");
					start = 1 - start;
				}
			}
			System.out.println();
		}
		

	}

}
