package StringPractise;

public class FrequencyCounter {
	public static void main(String[] args) {
		String h = "aannhbh";
		int c;
		for(char ch='a';ch<='z';ch++) {
			c=0;
			for(int i=0;i<h.length();i++) {
				if(h.charAt(i)==ch) {
					c++;
				}
			}
			if(c!=0) {
				System.out.println("Character is:"+ch+":"+"count is"+":"+c);
			}
		}
	}
}
