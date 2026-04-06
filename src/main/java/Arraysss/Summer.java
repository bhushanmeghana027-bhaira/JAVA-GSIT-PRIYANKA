package Arraysss;

public class Summer {
	public static void main(String[] args) {
		int[] arr = {2,6,9,1};
		int n = arr.length;
		float sum =0;
		for(int i=0;i<=arr.length-1;i++) {
			sum = sum +arr[i];
		}
		System.out.println("Total is :"+sum);
		System.out.println("Average is:"+ sum/n);
	}

}
