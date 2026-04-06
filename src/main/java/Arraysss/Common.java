package Arraysss;

public class Common {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {1,2,3};
		int[] a2 = {2,3,5};
		int[] a3;
		for(int i=0;i<=a1.length -1;i++) {
			for(int j=0;j<=a2.length -1;j++) {
				if(a1[i]==a2[j]) {
					System.out.print(a1[i]);
				}
			}
		}

	}

}
