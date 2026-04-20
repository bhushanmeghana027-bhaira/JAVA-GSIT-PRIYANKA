package day17outsidePAckage;

import day17.TestAccess;

public class toShowDemoOfProtected extends TestAccess {
	public static void main(String[] args) {
		toShowDemoOfProtected obj = new toShowDemoOfProtected();
		System.out.println(obj.protectedNum);
//		 see protected can be accesed outside package via inheritance 
		
	}
	
}
