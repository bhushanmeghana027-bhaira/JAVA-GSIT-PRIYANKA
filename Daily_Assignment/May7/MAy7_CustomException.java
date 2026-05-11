package May7;
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message){
        super(message);
    }
}
public class MAy7_CustomException {
	public static void main(String[] args) {
		String pas="abcdefgh";
		int r = pas.length();
		try {
			if(r!=8)
				throw new InvalidPasswordException("Passsword must contain minimum 8 characters");
			else
                System.out.println("Password Accepted!");
		}catch(InvalidPasswordException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
