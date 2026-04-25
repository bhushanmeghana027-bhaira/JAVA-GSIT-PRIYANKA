package StringPractise;

public class UpperLower {
	public static void main(String[] args) {
		String s = "I LOver VhBhairavA";
		String ans="";
		for(int i=0;i<s.length();i++) {
			char letter= s.charAt(i);
			if(letter>='A' && letter<='Z') {
				ans = ans +(char)(letter+32); //cpnverts to lower
				
			}
			else if(letter>='a' && letter<='z') {
				ans = ans+(char)(letter-32); //converts to upper
			}
			else
			{
				ans = ans+(char)(letter);
			}
		}
		System.out.println(ans);
	}
}
