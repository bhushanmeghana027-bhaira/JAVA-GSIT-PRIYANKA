package Arraysss;

public class Linearr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10, 20, 30, 40, 50};
		int target = 30;
		boolean isFound = false;
		for(int i=0;i<=arr.length-1;i++) {
			if(target == arr[i]) {
				System.out.println(i);
				isFound = true;
				break;
			}
			
		}
		if(isFound == false)
		    System.out.println("not found");	

	}

}
