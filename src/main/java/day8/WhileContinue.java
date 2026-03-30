package day8;

public class WhileContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("helllo");
		int n=0;
		while(n<10) {
			
			n++;
			if(n==5) {
				
				continue;
			}
			System.out.print(n+ " ");
			
		}
		System.out.println("\nbye");

	}

}
