package day4;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=18;char gender ='M';
		if(age==18) {
			System.out.println("Congrats on ur first vote");
			if(gender == 'M') {
				System.out.println("Please vote boi");
			}
			else {
				System.out.println("Please vote girl");
			}
		}
		if(age>=18) {
			System.out.println("u can vote");
		}
		else {
			System.out.println("u cannot vote");
		}

	}

}
