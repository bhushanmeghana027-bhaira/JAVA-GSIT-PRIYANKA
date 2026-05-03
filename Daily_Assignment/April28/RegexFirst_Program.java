package April28;

public class RegexFirst_Program {
//	public static void main(String[] args) {
//		String productCode = "AB123X";
//		String regex="^[A-Z]{2}[0-9]{3}(X|Z)$";
//		System.out.println(productCode.matches(regex));
//		
//		String pc2= "ab123X";
//		System.out.println(pc2.matches(regex));
//	}
	public static void main(String[] args) {
		String reg = "^[A-Za-z][A-Za-z0-9_]{4,11}$";
		String c1 ="hello_123";
		System.out.println(c1.matches(reg));
	}
}
