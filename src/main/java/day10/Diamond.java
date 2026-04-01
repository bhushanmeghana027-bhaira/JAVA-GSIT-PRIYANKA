package day10;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		for(int i=1;i<=2*n-1;i++)
		{
			
			if(i<=3) {
				for(int j=1;j<=n-i;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
			}
			else {
//				System.out.println(i);
				for(int j=1;j<=i-n;j++) {
					System.out.println(i);
					System.out.print(" ");
				}
				for(int j=1;j<=2*n-i;j++) {
					System.out.print("* ");
				}
			}
			
			System.out.println();
		}

	}

}
