package day9;

public class Swappers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10,num2=20;
//		by using thirs variable 
		int temp = num1;
		num1 = num2 ;
		num2 = temp;
		System.out.println("num1 is :"+num1);
		System.out.println("num2 is :"+num2);
		
//		without third vriable
		int a =10,b=1;
		 a = a+b;
		 b =a-b; 
		 a=a-b;
		 System.out.println("a is :"+a);
		 System.out.println("b is:"+b);
		 
//		 by using xor
		 int h = 8,r =6;
		 h = h^r;
		 r = h^r;
		 h =h^r;
		 
		 System.out.println("h is :"+h);
		 System.out.println("r is :"+r);
		 
//		  by multiplying
		 int g =29, y =60;
		 g = g*y;
		 y = g/y;
		 g = g/y;
		 System.out.println("g is :"+g);
		 System.out.println("y is :"+y);
	}

}
