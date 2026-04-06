package Arraysss;

public class countersdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {26,8,9,3,1,02};
		int c1=0,c2=0;
		for(int i =0;i<=arr.length-1;i++) {
			int n = arr[i];
			if(n%2==0)
				c1++;
			else
				c2++;
		}
		System.out.println("even is :"+c1);
		System.out.println("Odd is :"+c2);

	}

}
