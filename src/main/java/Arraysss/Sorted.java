package Arraysss;

 class Sorted {
	boolean Sort(int[] arr) {
		boolean isSorted = true;
		for(int i=0;i<=arr.length-2;i++) {
			if(arr[i]>arr[i+1])
					isSorted = false;
			
		}
		return isSorted;
	}


	public static void main(String[] args) {
		int[] arr= {100,2,5,125};
		Sorted s1 = new Sorted();
		boolean Status = s1.Sort(arr);
		System.out.println(Status);
		
	}
 }


