package May7;

import java.util.Scanner;

////Step 1 - CREATE custom exception class
//class YourCustomException extends Exception {
// public YourCustomException(String message){
//     super(message); // passes message to Exception class
// }
//}
//
////Step 2 - THROW it in main
//throw new YourCustomException("your message here");
//
////Step 3 - CATCH it in main
//catch(YourCustomException ex){
// System.out.println(ex.getMessage());
//}
class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}
public class Age_Exception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age = sc.nextInt();
		try {
			
			if(age<18)
				throw new InvalidAgeException("Age must be at least 18");
			else if(age>60)
				throw new InvalidAgeException("Age must be less than 60");
			else
				System.out.println("Valid Age! Welcome!");
		}catch(InvalidAgeException ex) {
			System.out.println(ex.getMessage());
			
		}
	}
}
