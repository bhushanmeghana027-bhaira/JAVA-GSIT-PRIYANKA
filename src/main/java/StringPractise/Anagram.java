package StringPractise;

public class Anagram {
	public static void main(String[] args) {
		String h ="listen",h1="silent";
		int n = h.length();
		int n1 = h1.length();
		int hc=0,hc1=0;
		
		if(n!=n1) {
			System.out.println("Not anagrams");
		}
		else {
			for(char ch='a';ch<='z';ch++) {
				hc=0;
				for(int i=0;i<h.length();i++) {
					if(h.charAt(i)==ch) {
						hc++;
					}
					
				}
				if(hc!=0)
					System.out.println("character in h is:"+ch+":"+hc);
				hc1=0;
				for(int j=0;j<h1.length();j++) {
					if(h1.charAt(j)==ch) {
						hc1++;
					}
				}
				if(hc1!=0)
				System.out.println("character in h1 is"+ch+":"+hc1);
				System.out.println(hc+":"+hc1);
				if(hc!=hc1) {
					System.out.println("Not Anagrams");
					System.exit(0);
				}
				
			}
			System.out.println(" ansagrams");
			
		}
	}
}
