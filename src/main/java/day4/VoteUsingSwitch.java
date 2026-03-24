package day4;

public class VoteUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=80;
		switch(age) {
		case 18:
			System.out.println("go vote");
			break;
		case 47:
			System.out.println("u r senior u can vote");
			break;
		case 3:
			System.out.println("u r chold dpnt vote");
			break;
			
		default:
			System.out.println("u cant vote u r dog");
			break;
		}

	}

}
