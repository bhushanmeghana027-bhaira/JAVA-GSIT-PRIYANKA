package Exceptions;

public class CustomException {
	static void checkAge(int age) throws Exception{
		if(age<18)
			throw new Exception("Under age");
	}
	public static void main(String[] args) {
		try {
			System.out.println("Hello");
			checkAge(18);
		}catch(Exception ex) {
			System.out.println("Exception ocuured:"+ex.getMessage());
		}
	}
}
