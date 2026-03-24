package day4;

public class ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		notes:
		/* if the if cpndition satisfies it print 
		 * then checks else
		 * 
		 * if the of condition dosent satisfy moves to next else and executs
		 * */
		
		 
		int age = 19;
		if(age==18) {
			System.out.println("Congrats on ur first vote");
		}
		else if(age>=18) {
			System.out.println("u can vote");
		}
		else {
			System.out.println("u cant vote");
		}

	}

}
