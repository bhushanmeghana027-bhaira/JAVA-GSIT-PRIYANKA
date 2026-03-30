package day7;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6,count=0;
		for(int i=1;i<=7;i++) {
			if(n%i==0) count++;
		}
		if(count == 2) {
			System.out.println("U r a prime");
		}
		else {
			System.out.println("u r not a prime");
		}

	}

}
