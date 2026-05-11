package Exceptions;

public class CustomException2  {
	public static void main(String[] args) throws NegativeException {
		
	
	try {
		int num=-2;
		if(num<0)
			throw new NegativeException("Less than 0 is not allowed");
	}catch(Exception ex) {
		System.out.println(ex.getMessage());
	}
	}

}
