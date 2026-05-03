package April29;

import java.util.Scanner;

public class Scanner_Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		String name = sc.nextLine();
		System.out.println(name);
		System.out.println("Enter the age:");
		int age = sc.nextInt();
		System.out.println(age);
		System.out.println("Enter salary:");
		double Salary = sc.nextDouble();
		System.out.println(Salary);
	}
}
