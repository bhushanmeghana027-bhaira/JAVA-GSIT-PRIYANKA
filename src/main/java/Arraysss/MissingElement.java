package Arraysss;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,5,6};
		int h =0,l=0;
		for(int i=0;i<=arr.length-1;i++) {
			h = arr[i];
			l = arr[i+1];
			if(l-h!=1) 
				break;
		}
			
			System.out.println(h+1);
	}
}


