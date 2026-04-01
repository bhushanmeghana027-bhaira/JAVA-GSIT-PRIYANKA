package day10;

public class DiamondTernary {
	public static void main(String[] args) {
		int n=3;
		for(int i=1;i<=2*n-1;i++) {
			int stars = (i<=n)?(i):(2*n-i);
			int space = (i<=n)?(n-i):(i-n);
			
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
