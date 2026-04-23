package april23;

public class Program_Anagrams {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		char ch;
		
		
		int n1=s1.length();
		int n2= s2.length();
		int i,j;
		
		if(n1!=n2) {
			System.out.println("Not anagrams");
		}
		else {
			for(ch='a'; ch<='z';ch++) {
				int c1=0,c2=0;
				for( i=0;i<=s1.length()-1;i++) {
					if(s1.charAt(i)==ch) {
						c1++;
					}
				}
				for( j=0;j<=s2.length()-1;j++) {
					if(s2.charAt(j)==ch) {
						c2++;
					
					}
				}
				if(c1!=0)
				System.out.println("String1:"+ch+":"+c1);
				if(c2!=0)
				System.out.println("String2:"+ch+":"+c2);
				
				if(c1 != c2) {
					System.out.println("NotAnagram");
					System.exit(0);
				}
				
			}
			System.out.println("We are anagrams");
		}
		
	}
}
