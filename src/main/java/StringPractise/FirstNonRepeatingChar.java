package StringPractise;

public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		String h ="bbananaweq";
		for(int i=0;i<h.length();i++) {
			int count=0;
			char f = h.charAt(i);
			for(int j=0;j<h.length();j++) {
				
				if(f==h.charAt(j))
				{
//					System.out.println(f);
//					System.exit(0);
					count++;
				}
			}
			if(count==1) {
				System.out.println(f);
				break;
			}
		}
		
	}
}
