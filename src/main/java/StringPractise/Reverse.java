package StringPractise;

public class Reverse {
	public static void main(String[] args) {
		String h = "hello",ans="";
		for(int i=h.length()-1;i>=0;i--) {
			ans = ans+h.charAt(i);
		}
		System.out.println(ans);
	}
}
