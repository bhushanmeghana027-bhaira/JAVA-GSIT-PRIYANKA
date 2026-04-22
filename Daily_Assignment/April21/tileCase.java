package April21;

public class tileCase {
	public static void main(String[] args) {
		String s = "java programming language";
		String ans ="";
		String []h = s.split(" ");
		for(String word:h) {
			String m = word.charAt(0)+"";
			m = m.toUpperCase();
			ans = ans + m+word.substring(1)+" ";
		}
		System.out.println(ans);
	}
}
