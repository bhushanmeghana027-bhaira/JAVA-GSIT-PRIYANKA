package Patterns;

public class TUF12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int first = 2*(n-1);
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int j=1;j<=(first);j++)
	            System.out.print(" ");
			
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			
			
			System.out.println();
			first = first -2;
		}

	}

}
