package day4;

import java.util.Scanner;

public class CharacterValidator {
//alternatove way 
//	public class Test {
//	    public static void main(String[] args) {
//	        char ch = '@';
//
//	        if (ch >= 'A' && ch <= 'Z') {
//	            System.out.println("Uppercase");
//	        } 
//	        else if (ch >= 'a' && ch <= 'z') {
//	            System.out.println("Lowercase");
//	        } 
//	        else {
//	            System.out.println("Special character or digit");
//	        }
//	    }
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the char to be validaed:");
		char ch = sc.next().charAt(0);
		
		if(Character.isDigit(ch)) {
			System.out.println(" u r a number ");
		}
		else {
			if(Character.isUpperCase(ch)) {
				System.out.println("u r capital");
			}
			else if(Character.isLowerCase(ch)) {
				System.out.println("u rsmall");
			}
			else {
				System.out.println("u r special character");
			}
		}

	}

}
