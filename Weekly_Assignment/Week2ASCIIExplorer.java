import java.util.Scanner;

public class Week2ASCIIExplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch = sc.next().charAt(0);
	
		int ans = (char)ch;
		System.out.println("ASCII value:"+ ans);
		
		int r_ans = ans +5;
		System.out.println("New ASCII value:"+r_ans);
		
		char fans = (char)r_ans;
		System.out.println("New character: "+fans);
	
		

	}

}
