public class Sour {
	public static void main(String[] args) {
		int[] arr = {5,9,8,3,1,2};
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp =arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
//		for(int h :arr) {
//			System.out.println(h);
//		}
		if(arr[0] == arr[arr.length-1]) {
			System.out.println("all elements are same no second smallest or largest");
		}
		else {
		System.out.println("Second smallest:"+arr[1]);
		System.out.println("Second largest:"+arr[arr.length-2]);
		}
	}

}
