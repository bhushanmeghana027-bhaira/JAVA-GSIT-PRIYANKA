package StringPractise;

public class NumberWords {
	public static void main(String[] args) {
		String j = "i loe jaba hi";
		int v=0;
		for(int i =0;i<j.length();i++) {
			if(j.charAt(i)==' ') {
				v++;
			}
		}
		System.out.println(v+1);
	}
}
