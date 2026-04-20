package Arraysss;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,0,3,12};
		int[] arr1 = new int[5];
		int pos =0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i] != 0) {
				arr1[pos]=arr[i];
				pos++;}
		}
		
//		 for(int i=0;i<=arr.length-1;i++) {
//           if (arr[i] == 0) {
//               ar[pos] = arr[i];
//               pos++;
//           }
//       }
		for(int j=0;j<=arr.length-1;j++) {
			System.out.println(arr1[j]);
		}

	}

}
