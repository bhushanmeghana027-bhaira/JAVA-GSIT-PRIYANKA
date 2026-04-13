package April9;

public class LefterRighter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4};
//		int temp = arr[0];
//		for(int i=0;i<arr.length-1;i++) {
//			arr[i]=arr[i+1];
//		}
//		arr[arr.length-1] = temp;
//		
//		for(int e:arr) {
//			System.out.println(e);
//		}

		
//		 right shift 
		int temp = arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
		for(int h:arr) {
			System.out.println(h);
		}
	}

}
