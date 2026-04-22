package day20;

public class Program_String3 {
	public static void main(String[] args) {
		String og = "madam";
		String tep = og;
		String ans="";
		for(int i=og.length()-1;i>=0;i--) {
			ans = ans +og.charAt(i);
		}
//		System.out.println(ans);
		if(ans.equals(tep)) {
			System.out.println("Palli");
		}
		else {
			System.out.println("Not palli");
		}
	}
}
