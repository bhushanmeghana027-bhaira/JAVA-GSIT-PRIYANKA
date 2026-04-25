package StringPractise;

public class LongestPrefix {
	public static void main(String[] args) {
		String ar[]= {"dog", "racecar", "car"};
		String prefix = ar[0];
		
		for(String eachWord:ar) {
			while(!eachWord.startsWith(prefix)) {
				prefix = prefix.substring(0,prefix.length()-1);
			}
		}
		System.out.println(prefix);
	}
}
