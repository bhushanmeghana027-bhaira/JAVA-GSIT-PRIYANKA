package Arraysss;

public class frequency {
	public static void main(String[] args) {
		int[] arr= {1, 2, 2, 3, 1};
		for(int i=0;i<=arr.length-1;i++) {
			int count =0,j;
			for( j=0;j<=arr.length-1;j++) {
				if(arr[i] == arr[j])
					count++;
			}
			int firstOccurance =0;
			for(int k=0;k<i;k++) {
				if(arr[k] == arr[i])
					firstOccurance++;
			}
			if(firstOccurance==0)
			System.out.println(arr[i] + ":" + count);
		}
	}

}
