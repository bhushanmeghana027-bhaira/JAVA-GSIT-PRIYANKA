package day12;

public class FindSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,9,0,6,0,7};
		int count =0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i] !=0) {
				count++;
			}
		}
		System.out.println(count);

	}

}
