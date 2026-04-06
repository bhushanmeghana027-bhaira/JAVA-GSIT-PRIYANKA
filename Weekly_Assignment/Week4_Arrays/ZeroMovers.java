package Week4_Arrays;

public class ZeroMovers {
	int[] zeroMovers(int[] arr) {
		int pos=0;
		int[] arr1 = new int[5];
//		for(int i=0;i<=arr.length-1;i++) {
//			if(arr[i]==0) {
//				arr1[pos] = arr[i];
//				pos++;
//			}
//		}
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]!=0) {
				arr1[pos] = arr[i];
				pos++;
			}
		}
		
		
		return arr1 ;
	}
	public static void main(String[] args) {
		int[] m = {1,0,3,0,5};
		ZeroMovers zm = new ZeroMovers();
		int[] r = zm.zeroMovers(m);
		for(int i=0;i<=r.length-1;i++) {
			System.out.print(r[i]+" ");
		}
		
		
	}

}
