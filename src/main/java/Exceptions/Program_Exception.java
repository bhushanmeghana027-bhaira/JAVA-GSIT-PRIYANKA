package Exceptions;

public class Program_Exception {
	public static void main(String[] args) {
		try {
		System.out.println("Hello");
		Thread.sleep(5000);
		int num =10/0;
		int arr[]= {10,20,30};
		System.out.println(arr[10]);
		System.out.println("Bye");
		}
		catch(ArrayIndexOutOfBoundsException  ae) {
			System.out.println(ae.getMessage());
		}
		catch(Exception e) {
			System.out.println("Exception occures:"+e.getMessage());
		}
	}
}
