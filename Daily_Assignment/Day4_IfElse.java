import java.util.Scanner;

public class Day4_IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of elements:");
		int size = sc.nextInt();
		int counter=0;
		int totalMarks = 0;
		double per;
		
		int[] marks = new int[size];
		
		System.out.println("Enter the element vaalue:");
		for(int i=0;i<size;i++) {
			marks[i]=sc.nextInt();
		}
		
		for(int j=0;j<size;j++) {
			if(marks[j] < 33) {
				counter++;
			}
		}
		if(counter>0) {
			System.out.println("Result = Fail");
			System.out.println("Grade = F");
		}
		
		else {
			for(int k=0;k<size;k++) {
				totalMarks = totalMarks + marks[k];	
			}
			System.out.println(totalMarks);
			per = (totalMarks/500.0)*100;
			System.out.println(per);
			
			String grade = "";

            if (per >= 90) grade = "A+";
            else if (per >= 75) grade = "A";
            else if (per >= 60) grade = "B";
            else if (per >= 50) grade = "C";
            else grade = "D";
            
            System.out.println("Percentage: " + per + "%");
            System.out.println("Result: Pass");
            System.out.println("Grade: " + grade);
			
			
		}
		
		

	}

}
