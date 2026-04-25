package StringPractise;

public class LargestWord {
	public static void main(String[] args) {
		String g = "i am longest word in the sentence";
		String g1[] = g.split(" ");
		String longestWord="";
		int max=0,r=0;
		for(String eachWord:g1) {
			r = eachWord.length();
			if(r>max) {
				max=r;
				longestWord=eachWord;
			}
		}
		System.out.println("Longest word is:"+longestWord+":"+"with letters"+max);
	}
}
