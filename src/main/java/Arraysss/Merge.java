package Arraysss;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={1, 2, 3};
		int[] arr2 = {4, 5, 6};
		int[] arr3= new int[6];
		for(int i=0;i<=arr1.length-1;i++) {
			arr3[i] = arr1[i];	
		}
		for(int i=0;i<=arr2.length-1;i++) {
			arr3[i+3] = arr2[i];	
		}
		for(int i=0;i<=arr3.length-1;i++) {
			System.out.println(arr3[i]);
		}

	}

}
