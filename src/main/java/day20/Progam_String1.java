package day20;

public class Progam_String1 {
	public static void main(String[] args) {
		String s = "today is tuEsday";
		int count=0;
		String r = s.toLowerCase();
		for(int i=0;i<r.length();i++) {
			if(r.charAt(i)=='a'||r.charAt(i)=='e'||r.charAt(i)=='i'||r.charAt(i)=='o'||r.charAt(i)=='u') {
				count++;
				
			}
		}
		System.out.println(count);
	}

}
