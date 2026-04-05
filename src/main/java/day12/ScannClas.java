package day12;

import java.util.Scanner;

public class ScannClas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Tell me the number of elements:");
		int n = sc.nextInt();
		System.out.println("Enter the elements:");
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		for(int eachNumber:arr) {
			System.out.println(eachNumber);
		}

	}

}
