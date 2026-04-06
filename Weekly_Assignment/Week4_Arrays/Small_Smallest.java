package Week4_Arrays;

public class Small_Smallest {
	public static void main(String[] args) {
		int[] arr= {5,9,10,8,2,50};
		int temp =0;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-2;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
			
			}
//		for(int n=0;n<=arr.length-1;n++) {
//			System.out.println(arr[n]);
//		}
		System.out.println(arr[1]);
		
	}
	
}
