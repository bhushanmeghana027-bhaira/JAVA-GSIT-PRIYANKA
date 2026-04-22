package April22;

public class Homework {
	public static void main(String[] args) {
//		String s = "ABCD123E5",m="";
//		for(int i =0;i<s.length();i++) {
//			char r = s.charAt(i);
//			boolean res= Character.isDigit(r);
//			if(res==true) {
//				m = m+r;
//			}
//		}
//		String h = m.substring(0,3);
//		String l = m.substring(3);
////		System.out.println(l);
//		int j = Integer.parseInt(h);
//		int j1 = Integer.parseInt(l);
//		System.out.println(j+j1);
		
		String s = "ab12cd34",m="";
		for(int i =0;i<s.length();i++) {
			char r = s.charAt(i);
			boolean res= Character.isDigit(r);
			if(res==true) {
				m = m+r;
			}
		}
//		System.out.println(m);
		String h = m.substring(0,2);
		String h1 = m.substring(2);
//		System.out.println(h+":"+h1);
		int r = Integer.parseInt(h);
		int r1 = Integer.parseInt(h1);
		System.out.println(r+r1);
		
		
	}
}
