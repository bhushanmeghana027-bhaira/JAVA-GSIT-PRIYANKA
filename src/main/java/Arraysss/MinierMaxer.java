package Arraysss;

public class MinierMaxer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,3,6,8,100};
		int min = arr[0],max = arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Minimum element is :"+min);
		System.out.println("Minimum element is :"+max);

	}

}
