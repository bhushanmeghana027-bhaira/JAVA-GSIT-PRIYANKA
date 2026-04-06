package Week4_Arrays;


public class Sorter {
	boolean isSorted(int[] arr) {
		boolean isSortFlag=true;
		for(int i=0;i<=arr.length-2;i++) {
			
				if(arr[i]>arr[i+1]) {
					isSortFlag =  false;
				}
		}
		
		return isSortFlag;
		
		
	}
	
	public static void main(String[] args) {
		Sorter s1 = new Sorter();
		int[] m = {5,6,8,1,3};
		System.out.println(s1.isSorted(m));
		
	}
}
