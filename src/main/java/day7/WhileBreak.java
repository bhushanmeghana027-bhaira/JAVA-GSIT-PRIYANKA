package day7;

public class WhileBreak {
	public static void main(String[] args) {
		int num =1;
		System.out.println("hello");
		while(num<=10) {
			System.out.print(num);
//			there is difference between both if carefully see
//			first tim 1 2 3 4 5 bye
			if(num==5) break;
			num++;
//			second time here 1 2 3 4 bye 
//			num++;
//			if(num==5) break;

			
		}
		System.out.println("\nbye");
	}
}
