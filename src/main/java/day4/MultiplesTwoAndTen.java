package day4;

import java.util.Scanner;

public class MultiplesTwoAndTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num to be validaed:");
		int n = sc.nextInt();
		
		if(n%2 != 0) {
			System.out.println(n +" : not multiple of 2 ");
		}
		else {
			if(n%2==0 && n%10 != 0) {
				System.out.println(n +" : is multiple of 2 only");
			}
			else {
				System.out.println(n + " : is multiple of 2and 10");
			}
		}

	}

}
