package Week3_Basics;

public class Fibonncci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10,c,a=0,b=1;
		System.out.print(a+ " "+b);
		for(int i=2;i<=10;i++) {
			c = a +b;
			a=b;
			b=c;
			
			System.out.print(" "+c+" ");
		}
		

	}

}
