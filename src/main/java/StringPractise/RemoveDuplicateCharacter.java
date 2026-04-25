package StringPractise;

public class RemoveDuplicateCharacter {
	public static void main(String[] args) {
		String h = "Programming";
		h = h.toLowerCase();
		String ans="";
		int c,i;
		for(char ch='a';ch<='z';ch++) {
			c=0;
			for(i=0;i<h.length();i++) {
				if(h.charAt(i)==ch)
					c++;
			}
			if(c==1) {
				ans =ans+ch;
			}
		}
		System.out.println(ans);
	}
}
