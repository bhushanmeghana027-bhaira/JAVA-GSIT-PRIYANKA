package Exceptions;

public class Finally_Program {
	public static void main(String[] args) {
		try {
			System.out.println("Hello");
			Thread.sleep(5000);
			int num =10/0;
			int arr[]= {10,20,30};
			System.out.println(arr[10]);
			System.out.println("Bye");
			}
			
			catch(Exception e) {
				System.out.println("Exception occures:"+e.getMessage());
				System.exit(0);
				//i willnot execute finally blocka s i already came out og the program bcz of exit
			}
		finally{
			
		System.out.println("I will alaways execute");
		}
	}
}
