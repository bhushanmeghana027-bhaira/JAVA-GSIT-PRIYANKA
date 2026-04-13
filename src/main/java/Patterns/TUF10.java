package Patterns;

public class TUF10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int total_rows = 2*n-1;
		for(int i=1;i<=total_rows;i++) {
			if(i<=n) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			
			}
			else {
				for(int j=1;j<=i-n;j++) {
					System.out.print("");
				}
				for(int j=1;j<=total_rows-i+1;j++) {
					System.out.print("* ");
				}
			}
				
			System.out.println();
		}


	}

}
