package April9;

public class ArrayFirstNonRepeat {
	public static void main(String[] args) {
		int[] arr =  {4, 5, 1, 2, 0, 4};
		
		for(int i =0;i<arr.length;i++) {
			int c=0;
			for(int j =0;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					c++;
				}
			}
//			System.out.println(arr[i]+":"+c);
			if(c==1) {
				System.out.println(arr[i]+":"+c+"This is the first non repeating elememnt");
				break;
			}
		}
	}
}
