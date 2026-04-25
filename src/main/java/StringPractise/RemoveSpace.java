package StringPractise;

public class RemoveSpace {
	public static void main(String[] args) {
		String s = "I love Bhairava ";
		String h ="";
		String m;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				m = s.charAt(i)+"";
				m="";
				h = h+m;
			}
			else {
				h = h +s.charAt(i);
			}
		}
		System.out.println(h);
	}
}
