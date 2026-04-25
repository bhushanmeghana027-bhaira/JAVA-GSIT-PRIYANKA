package StringPractise;

public class DuplicateCharacters {
	public static void main(String[] args) {
		String h = "Programming";
		 h = h.toLowerCase();
		 char ch;
		 int c;
		for(ch='a';ch<='z';ch++) {
			c=0;
			for(int i=0;i<h.length();i++) {
				if(h.charAt(i)==ch) {
					c++;
				}
//				if(c>=2)
//				System.out.println("character is"+ch+":"+"frequency"+c);
			}
			if(c>=2) {
				System.out.println(ch);
			}
		}
	}
}
