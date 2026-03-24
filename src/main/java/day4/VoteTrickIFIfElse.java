package day4;

public class VoteTrickIFIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 18;
		if(age==18) {
			System.out.println("Congrats on ur first vote");
		}
//		 else block is only associated with previous if condition hence if(age==18) also got executed
		if(age==18) {
			System.out.println("u can vote");
		}
		else {
			System.out.println("u cant vote");
		}

	}

}
