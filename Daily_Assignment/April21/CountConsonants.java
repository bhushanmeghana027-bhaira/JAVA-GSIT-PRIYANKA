package April21;

public class CountConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World";
		s = s.toLowerCase();
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ' && s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u'){
			    c++;
			}
		}
		System.out.println(c);

	}

}
