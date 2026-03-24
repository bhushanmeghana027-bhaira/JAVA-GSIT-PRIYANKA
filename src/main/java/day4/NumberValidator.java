package day4;

import java.util.Scanner;

public class NumberValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num to be validaed:");
		int n = sc.nextInt();

		
		if(n==0) {
			System.out.println(n + " u r a zero");
		}
		else if(n>0) {
			System.out.println(n+ " u r positive");
		}
		else {
			System.out.println(n+ " u r negative");
		}

	}

}
