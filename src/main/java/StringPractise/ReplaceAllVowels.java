package StringPractise;

public class ReplaceAllVowels {
	public static void main(String[] args) {
		String j = "Meghana aeiou Bhairava";
		j = j.toLowerCase();
		String m = null;
		String ans="";
		for(int i=0;i<j.length();i++) {
			if(j.charAt(i)=='a'||j.charAt(i)=='e'||j.charAt(i)=='i'||j.charAt(i)=='o'||j.charAt(i)=='u') {
				m = j.charAt(i)+"";
				m = '❤'+"";
				ans = ans + m;
			}
			else {
				ans = ans+j.charAt(i);
			}
			
			
		}
		System.out.println(ans);
	}

}
