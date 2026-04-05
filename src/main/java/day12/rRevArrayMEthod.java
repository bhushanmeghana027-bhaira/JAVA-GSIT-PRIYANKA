package day12;

public class rRevArrayMEthod {
	static void rev(int arr[])
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		int arr1[]= {6,8,9,3};
		rev(arr1);
		
	}

}
