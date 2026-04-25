package StringPractise;

public class CharacterCount {
	public static void main(String[] args) {
		String h = "banana";
		int c=0;
		for(int i=0;i<h.length();i++) {
			if(h.charAt(i)=='a')
				c++;
		}
		System.out.println(c);
	}
}
