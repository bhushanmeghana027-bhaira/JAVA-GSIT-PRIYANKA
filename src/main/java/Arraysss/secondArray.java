package Arraysss;

public class secondArray {
	public static void main(String[] args) {
		int[] arr = {2,8,10,1,6,3};
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-2;j++)
			{
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
//		for(int k=0;k<=arr.length-1;k++) {
//			System.out.println(arr[k]);
//			System.out.println();
//		}
		System.out.println(arr[arr.length-2]);
	}

}
